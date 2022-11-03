package ski.mashiro.net

import ski.mashiro.file.ConfigFile
import ski.mashiro.file.ZhiPinFile
import ski.mashiro.pojo.Job
import java.net.URL
import kotlin.collections.ArrayList

class BossZhiPin {
    companion object {
        fun getJobList() {
            if (ConfigFile.config?.zhiPinConfig?.switch == true) {
                val string = ConfigFile.config!!.zhiPinConfig.toString()
                val substring = string.substring(string.indexOf("scene") - 1, string.indexOf(")"))
                val uri = substring.replace(" ", "").replace(",", "&")
                val jobList = ArrayList<Job>(4 * 30)
                println("由于反爬限制，单次最多爬取4页，第二次需更新cookie")
                println("开始爬取...")
                for (i in ConfigFile.config?.zhiPinConfig!!.initPage..ConfigFile.config?.zhiPinConfig!!.initPage + 3) {
                    val url = URL("https://www.zhipin.com/wapi/zpgeek/search/joblist.json?$uri&page=$i&pageSize=30")
                    val result = HttpRequest.sendGet(url, ConfigFile.config?.zhiPinConfig?.cookie.toString())
                    if (result == null) {
                        println("第 $i 页 爬取失败")
                        if (i == ConfigFile.config?.zhiPinConfig!!.initPage) {
                            println("cookie无效")
                            return
                        }
                    } else {
                        println("第 $i 页 爬取成功")
                    }
                    val zhiPinJobs = result?.zpData?.jobList
                    if (zhiPinJobs != null) {
                        for (zhiPinJob in zhiPinJobs) {
                            var skills = zhiPinJob.skills.contentToString()
                            skills = skills.substring(skills.indexOf("[") + 1, skills.lastIndexOf("]")).replace(" ", "").replace(",", " ")
                            var welfare = zhiPinJob.welfareList.contentToString()
                            welfare = welfare.substring(welfare.indexOf("[") + 1, welfare.lastIndexOf("]")).replace(" ", "").replace(",", " ")
                            val address : String = if (zhiPinJob.cityName != "" && zhiPinJob.areaDistrict != "" && zhiPinJob.businessDistrict != "") {
                                zhiPinJob.cityName + "-" + zhiPinJob.areaDistrict + "-" + zhiPinJob.businessDistrict
                            } else if (zhiPinJob.businessDistrict == "") {
                                zhiPinJob.cityName + "-" + zhiPinJob.areaDistrict
                            } else if (zhiPinJob.areaDistrict == "") {
                                zhiPinJob.cityName + "-" + zhiPinJob.businessDistrict
                            } else {
                                zhiPinJob.cityName
                            }
                            jobList.add(Job(zhiPinJob.jobName, zhiPinJob.salaryDesc, zhiPinJob.daysPerWeekDesc + " " + zhiPinJob.leastMonthDesc, zhiPinJob.jobExperience, zhiPinJob.jobDegree, skills,
                                zhiPinJob.brandName, address, zhiPinJob.brandIndustry, zhiPinJob.brandScaleName, welfare))
                        }
                    }
                }

                if (ZhiPinFile.exportResult(jobList)) {
                    println("爬取结束")
                }
            }
        }
    }
}