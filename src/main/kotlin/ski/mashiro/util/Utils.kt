package ski.mashiro.util

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.dataformat.csv.CsvMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper
import com.fasterxml.jackson.module.kotlin.kotlinModule

class Utils {
    companion object {
        val yamlMapper : ObjectMapper = YAMLMapper().registerModule(kotlinModule())
        val jsonMapper : ObjectMapper = JsonMapper().registerModule(kotlinModule())
        val csvMapper : CsvMapper = CsvMapper()
    }
}