package ski.mashiro

import ski.mashiro.file.ConfigFile
import ski.mashiro.net.BossZhiPin
import java.util.Scanner

fun main() {
    ConfigFile.loadFile()
    BossZhiPin.getJobList()
    println("任意输入并回车退出")
    Scanner(System.`in`).next()
}