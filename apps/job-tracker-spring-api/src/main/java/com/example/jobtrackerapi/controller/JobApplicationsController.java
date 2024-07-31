package com.example.jobtrackerapi.controller;

import com.example.jobtrackerapi.model.JobApplication;
import com.example.jobtrackerapi.repository.JobApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobapplications")
public class JobApplicationsController {

    @Autowired
    private JobApplicationRepository repository;

    @GetMapping
    public List<JobApplication> getAllJobApplications() {
        return repository.findAll();
    }

    @PostMapping
    public JobApplication createJobApplication(@RequestBody JobApplication jobApplication) {
        return repository.save(jobApplication);
    }
}
