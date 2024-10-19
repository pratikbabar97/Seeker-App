package com.seeker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seeker.model.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {

}
