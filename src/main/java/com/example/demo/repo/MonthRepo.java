package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Monthly_Ex;

@Repository
public interface MonthRepo extends MongoRepository<Monthly_Ex, Long> {

	

	

}
