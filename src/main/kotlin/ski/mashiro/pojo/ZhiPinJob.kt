package ski.mashiro.pojo

/*\
[{"name":"全国","code":100010000,"url":"/?city=100010000"},
{"name":"北京","code":101010100,"url":"/beijing/"},{"name":"上海","code":101020100,"url":"/shanghai/"},
{"name":"广州","code":101280100,"url":"/guangzhou/"},{"name":"深圳","code":101280600,"url":"/shenzhen/"},
{"name":"杭州","code":101210100,"url":"/hangzhou/"},{"name":"天津","code":101030100,"url":"/tianjin/"},
{"name":"西安","code":101110100,"url":"/xian/"},{"name":"苏州","code":101190400,"url":"/suzhou/"},
{"name":"武汉","code":101200100,"url":"/wuhan/"},{"name":"厦门","code":101230200,"url":"/xiamen/"},
{"name":"长沙","code":101250100,"url":"/changsha/"},{"name":"成都","code":101270100,"url":"/chengdu/"},
{"name":"郑州","code":101180100,"url":"/zhengzhou/"},{"name":"重庆","code":101040100,"url":"/chongqing/"},
{"name":"佛山","code":101280800,"url":"/foshan/"},{"name":"合肥","code":101220100,"url":"/hefei/"},
{"name":"济南","code":101120100,"url":"/jinan/"},{"name":"青岛","code":101120200,"url":"/qingdao/"},
{"name":"南京","code":101190100,"url":"/nanjing/"},{"name":"东莞","code":101281600,"url":"/dongguan/"},
{"name":"昆明","code":101290100,"url":"/kunming/"},{"name":"南昌","code":101240100,"url":"/nanchang/"},
{"name":"石家庄","code":101090100,"url":"/shijiazhuang/"},{"name":"宁波","code":101210400,"url":"/ningbo/"},
{"name":"福州","code":101230100,"url":"/fuzhou/"}]
 */

data class ZhiPinJob(
    val anonymous : String,
    val areaDistrict : String,
    val atsDirectPost : Boolean,
    val bossAvatar : String,
    val bossCert : Int,
    val bossName : String,
    val bossOnline : Boolean,
    val bossTitle : String,
    val brandIndustry : String,
    val brandLogo : String,
    val brandName : String,
    val brandScaleName : String,
    val brandStageName : String,
    val businessDistrict : String,
    val city : Long,
    val cityName : String,
    val contact : Boolean,
    val daysPerWeekDesc : String,
    val encryptBossId : String,
    val encryptBrandId : String,
    val encryptJobId : String,
    val expectId : Int,
    val goldHunter : Int,
    val iconFlagList : Array<String>,
    val iconWord : String,
    val industry : Long,
    val isShield : Int,
    val itemId : Int,
    val jobDegree : String,
    val jobExperience : String,
    val jobLabels : Array<String>,
    val jobName : String,
    val jobType : Int,
    val jobValidStatus : Int,
    val leastMonthDesc : String,
    val lid : String,
    val optimal : Int,
    val outland : Int,
    val proxyJob : Int,
    val proxyType : Int,
    val salaryDesc : String,
    val securityId : String,
    val skills : Array<String>,
    val welfareList : Array<String>,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ZhiPinJob

        if (anonymous != other.anonymous) return false
        if (areaDistrict != other.areaDistrict) return false
        if (atsDirectPost != other.atsDirectPost) return false
        if (bossAvatar != other.bossAvatar) return false
        if (bossCert != other.bossCert) return false
        if (bossName != other.bossName) return false
        if (bossOnline != other.bossOnline) return false
        if (bossTitle != other.bossTitle) return false
        if (brandIndustry != other.brandIndustry) return false
        if (brandLogo != other.brandLogo) return false
        if (brandName != other.brandName) return false
        if (brandScaleName != other.brandScaleName) return false
        if (brandStageName != other.brandStageName) return false
        if (businessDistrict != other.businessDistrict) return false
        if (city != other.city) return false
        if (cityName != other.cityName) return false
        if (contact != other.contact) return false
        if (daysPerWeekDesc != other.daysPerWeekDesc) return false
        if (encryptBossId != other.encryptBossId) return false
        if (encryptBrandId != other.encryptBrandId) return false
        if (encryptJobId != other.encryptJobId) return false
        if (expectId != other.expectId) return false
        if (goldHunter != other.goldHunter) return false
        if (!iconFlagList.contentEquals(other.iconFlagList)) return false
        if (iconWord != other.iconWord) return false
        if (industry != other.industry) return false
        if (isShield != other.isShield) return false
        if (itemId != other.itemId) return false
        if (jobDegree != other.jobDegree) return false
        if (jobExperience != other.jobExperience) return false
        if (!jobLabels.contentEquals(other.jobLabels)) return false
        if (jobName != other.jobName) return false
        if (jobType != other.jobType) return false
        if (jobValidStatus != other.jobValidStatus) return false
        if (leastMonthDesc != other.leastMonthDesc) return false
        if (lid != other.lid) return false
        if (optimal != other.optimal) return false
        if (outland != other.outland) return false
        if (proxyJob != other.proxyJob) return false
        if (proxyType != other.proxyType) return false
        if (salaryDesc != other.salaryDesc) return false
        if (securityId != other.securityId) return false
        if (!skills.contentEquals(other.skills)) return false
        if (!welfareList.contentEquals(other.welfareList)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = anonymous.hashCode()
        result = 31 * result + areaDistrict.hashCode()
        result = 31 * result + atsDirectPost.hashCode()
        result = 31 * result + bossAvatar.hashCode()
        result = 31 * result + bossCert
        result = 31 * result + bossName.hashCode()
        result = 31 * result + bossOnline.hashCode()
        result = 31 * result + bossTitle.hashCode()
        result = 31 * result + brandIndustry.hashCode()
        result = 31 * result + brandLogo.hashCode()
        result = 31 * result + brandName.hashCode()
        result = 31 * result + brandScaleName.hashCode()
        result = 31 * result + brandStageName.hashCode()
        result = 31 * result + businessDistrict.hashCode()
        result = 31 * result + city.hashCode()
        result = 31 * result + cityName.hashCode()
        result = 31 * result + contact.hashCode()
        result = 31 * result + daysPerWeekDesc.hashCode()
        result = 31 * result + encryptBossId.hashCode()
        result = 31 * result + encryptBrandId.hashCode()
        result = 31 * result + encryptJobId.hashCode()
        result = 31 * result + expectId
        result = 31 * result + goldHunter
        result = 31 * result + iconFlagList.contentHashCode()
        result = 31 * result + iconWord.hashCode()
        result = 31 * result + industry.hashCode()
        result = 31 * result + isShield
        result = 31 * result + itemId
        result = 31 * result + jobDegree.hashCode()
        result = 31 * result + jobExperience.hashCode()
        result = 31 * result + jobLabels.contentHashCode()
        result = 31 * result + jobName.hashCode()
        result = 31 * result + jobType
        result = 31 * result + jobValidStatus
        result = 31 * result + leastMonthDesc.hashCode()
        result = 31 * result + lid.hashCode()
        result = 31 * result + optimal
        result = 31 * result + outland
        result = 31 * result + proxyJob
        result = 31 * result + proxyType
        result = 31 * result + salaryDesc.hashCode()
        result = 31 * result + securityId.hashCode()
        result = 31 * result + skills.contentHashCode()
        result = 31 * result + welfareList.contentHashCode()
        return result
    }
}