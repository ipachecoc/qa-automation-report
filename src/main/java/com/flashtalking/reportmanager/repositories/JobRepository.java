package com.flashtalking.reportmanager.repositories;

import org.springframework.data.repository.CrudRepository;

import com.flashtalking.reportmanager.domain.Job;
 
public interface JobRepository extends CrudRepository<Job, Long>{

}
