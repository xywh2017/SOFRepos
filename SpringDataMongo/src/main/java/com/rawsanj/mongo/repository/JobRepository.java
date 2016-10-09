package com.rawsanj.mongo.repository;

import com.rawsanj.mongo.entity.Job;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Sanjay on 10/9/2016.
 */
public interface JobRepository extends MongoRepository<Job, String>{

    Job findOneByName(String name);

}
