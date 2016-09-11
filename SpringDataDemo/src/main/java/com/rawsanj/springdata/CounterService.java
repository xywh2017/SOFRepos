package com.rawsanj.springdata;

import com.rawsanj.springdata.entity.Counter;
import com.rawsanj.springdata.repository.CounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Sanjay on 9/11/2016.
 */
@Service
@Transactional
public class CounterService {

    @Autowired
    private CounterRepository counterRepository;

    public void save(Counter counter){
        counterRepository.save(counter);
    }

    public void saveAll(List<Counter> counters){
        counterRepository.save(counters);
    }

    public int getLastInsterted(){
        return counterRepository.getLastInsertId();
    }

    public List<Counter> findAll(){
        return counterRepository.findAll();
    }

    public int updateCounterByName(String name){
        return counterRepository.updateCounterByName(name);
    }

    public Counter findOneByName(String name){
        return counterRepository.findOneByName(name);
    }

}
