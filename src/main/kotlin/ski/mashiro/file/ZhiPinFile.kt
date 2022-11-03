package ski.mashiro.file

import com.fasterxml.jackson.dataformat.csv.CsvSchema
import ski.mashiro.pojo.Job
import ski.mashiro.util.Utils
import java.io.File

class ZhiPinFile {
    companion object {
        private val zhiPinFile = File(".", "zhiPin" + ConfigFile.config?.zhiPinConfig!!.initPage + "-" + ConfigFile.config?.zhiPinConfig!!.initPage + 3 + ".csv")

        fun exportResult(jobList: List<Job>) : Boolean {
            if (zhiPinFile.exists()) {
                if (zhiPinFile.delete()) {
                    return createFile(jobList)
                }
            }
            return createFile(jobList)
        }

        private fun createFile(jobList: List<Job>) : Boolean {
            if (zhiPinFile.createNewFile()) {
                val csvSchema : CsvSchema = Utils.csvMapper.schemaFor(Job::class.java).withHeader()
                Utils.csvMapper.writer(csvSchema).writeValues(zhiPinFile).write(jobList)
                return true
            }
            return false
        }
    }
}