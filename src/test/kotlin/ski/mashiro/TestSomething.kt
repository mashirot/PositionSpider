package ski.mashiro

import org.junit.Test

class TestSomething {

    @Test
    fun testSubString() {
        val str = "a[bcd]e"
        println(str.substring(str.indexOf("[") + 1, str.lastIndexOf("]")))
    }
}