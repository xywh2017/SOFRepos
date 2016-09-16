package com.rawsanj.bootjdbc.repository;

import com.rawsanj.bootjdbc.domain.User;
import com.rawsanj.bootjdbc.domain.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Sanjay on 9/17/2016.
 */
@Repository
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
    public List<User> findAll() {
        return jdbcTemplate.query("select * from users", new UserRowMapper());
    }

}