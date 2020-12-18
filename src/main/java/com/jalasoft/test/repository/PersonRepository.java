package com.jalasoft.test.repository;

import com.jalasoft.test.model.Data;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends MongoRepository<Data,Integer> {

}
