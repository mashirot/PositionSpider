package ski.mashiro.file

import org.apache.commons.io.FileUtils
import ski.mashiro.pojo.Config
import ski.mashiro.pojo.ZhiPinConfig
import ski.mashiro.util.Utils.Companion.yamlMapper
import java.io.File

class ConfigFile {

    companion object {
        var config : Config? = null

        private val configFile = File(".", "Config.yml")

        private fun createFile() {
            if (!configFile.exists()) {
                writeInitConfig()
                return
            }
            if (!configFile.isFile) {
                if (configFile.delete()) {
                    writeInitConfig()
                }
            }
        }
        private fun writeInitConfig() {
            if (configFile.createNewFile()) {
                FileUtils.writeStringToFile(configFile, yamlMapper.writeValueAsString(Config(1.0, ZhiPinConfig(true,1, "","1","","","","","","","","","", ""))), "utf-8")
            }
        }
        fun loadFile() {
            createFile()
            config = yamlMapper.readValue(FileUtils.readFileToString(configFile, "utf-8"), Config::class.java)
        }
    }

}