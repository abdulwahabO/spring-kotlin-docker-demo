package me.adeshina.log.service

import me.adeshina.log.model.JobApplication
import me.adeshina.log.model.Status
import org.springframework.stereotype.Service
import java.time.Instant

@Service
class JobApplicationService {

    private var store = mutableListOf<JobApplication>()

    fun save(jobApplication: JobApplication, update: Boolean) {

        if (!update) {
            jobApplication.id = Instant.now().toEpochMilli().toInt()
        }

        store.add(jobApplication)
    }

    fun viewLog(): Collection<JobApplication> {
        store.add(JobApplication(127, "Driver II", "Example Inc", "Berlin", "N/A", Status.APPLIED))
        store.add(JobApplication(111, "Executive II", "Example Inc", "Berlin", "N/A", Status.APPLIED))
        store.add(JobApplication(129, "Engineer II", "Example Inc", "Berlin", "N/A", Status.APPLIED))
        return store
    }

}
