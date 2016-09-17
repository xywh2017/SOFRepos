package com.rawsanj.datalog.repository;

import com.rawsanj.datalog.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Sanjay on 9/17/2016.
 */
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    @Query(value = "SELECT * from User where name = :name", nativeQuery = true)
    List<User> getListOfUserByName(@Param("name") String name);

}
