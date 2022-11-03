package ski.mashiro.pojo

data class ZhiPinData(
    val brandCard : String?,
    val filterString: String,
    val hasMore: Boolean,
    val jobList : List<ZhiPinJob>,
    val lid: String,
    val resCount: Int,
    val totalCount : Int
) {
}