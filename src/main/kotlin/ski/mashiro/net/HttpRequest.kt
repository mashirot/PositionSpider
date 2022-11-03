package ski.mashiro.net

import okhttp3.*
import ski.mashiro.pojo.ZhiPinJobList
import ski.mashiro.util.Utils
import java.lang.Exception
import java.net.URL

class HttpRequest {
    companion object {

        fun sendGet(url : URL, cookie : String) : ZhiPinJobList? {
            try {
                val httpClient = OkHttpClient.Builder().build()
                val request = Request.Builder().get().url(url)
                    .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:107.0) Gecko/20100101 Firefox/107.0")
                    .addHeader("Cookie", cookie)
                    .build()
                val response = httpClient.newCall(request).execute()
                val result = response.body?.string()
                if (result?.contains("Success") == true) {
                    return Utils.jsonMapper.readValue(result, ZhiPinJobList::class.java)
                }
                if (result?.contains("\"code\":5002") == true) {
                    println("您的 IP 存在异常访问行为，暂时被禁止访问！")
                }
            } catch (e : Exception) {
                e.printStackTrace()
            }
            return null
        }
    }
}