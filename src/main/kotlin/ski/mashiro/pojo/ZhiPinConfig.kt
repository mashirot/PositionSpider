package ski.mashiro.pojo

data class ZhiPinConfig(
    // 开关
    val switch : Boolean,
    val initPage : Int,
    val cookie : String,
    val scene : String,
    // 查询关键字
    val query : String,
    // 城市
    val city : String,
    // 工作经验
    val experience : String,
    // 学历
    val degree : String,
    // 公司行业
    val industry : String,
    // 公司规模
    val scale : String,
    // 融资阶段
    val stage : String,
    // 职位
    val position : String,
    // 工资
    val salary : String,
    // 公司位置
    val multiBusinessDistrict : String,
    ) {
}