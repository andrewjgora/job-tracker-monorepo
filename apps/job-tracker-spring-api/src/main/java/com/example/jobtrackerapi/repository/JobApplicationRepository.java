package com.example.jobtrackerapi.repository;

import com.example.jobtrackerapi.model.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {
}
