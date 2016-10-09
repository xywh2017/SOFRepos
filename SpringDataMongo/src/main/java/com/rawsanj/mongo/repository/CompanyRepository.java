package com.rawsanj.mongo.repository;

import com.rawsanj.mongo.entity.Company;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by Sanjay on 10/9/2016.
 */
public interface CompanyRepository extends MongoRepository<Company, String> {

    Company findOneByJobId(String id);

    List<Company> findByJobId(String id);
}
