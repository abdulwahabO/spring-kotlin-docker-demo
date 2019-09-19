package me.adeshina.log.model

data class JobApplication(
        var id: Int,
        var title: String,
        var company: String,
        var location: String,
        var recruiter: String,
        var status: Status
)

enum class Status {
    APPLIED,
    INTERVIEWING,
    REJECTED
}
