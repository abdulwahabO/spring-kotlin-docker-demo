package me.adeshina.log.controller

import me.adeshina.log.model.JobApplication
import me.adeshina.log.service.JobApplicationService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/log")
class JobApplicationController constructor(val jobApplicationService: JobApplicationService) {

    @PostMapping("/create")
    fun saveJob(@RequestBody jobApplication: JobApplication) {
        jobApplicationService.save(jobApplication, false)
    }

    @PutMapping("/update")
    fun updateJob(@RequestBody jobApplication: JobApplication) {
        jobApplicationService.save(jobApplication, true)
    }

    @GetMapping("/view")
    fun view(): ResponseEntity<Collection<JobApplication>>{
        return ResponseEntity.ok(jobApplicationService.viewLog())
    }
}
