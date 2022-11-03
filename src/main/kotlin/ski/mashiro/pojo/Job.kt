package ski.mashiro.pojo

import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonPropertyOrder("jobName", "jobSalary", "daysLimit", "jobExp", "jobDegree", "jobSkill", "companyName", "companyAddress", "companyIndustry", "companyScale", "welfareList")
data class Job(
    val jobName : String,
    val jobSalary : String,
    val daysLimit : String,
    val jobExp : String,
    val jobDegree : String,
    val jobSkill : String,
    val companyName : String,
    val companyAddress : String,
    val companyIndustry : String,
    val companyScale : String,
    val welfareList : String,
) {
}