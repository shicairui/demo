package com.example.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ShiCaiRui on 2016/10/29.
 */
@Repository
public interface UserRepository extends CrudRepository<User,Integer>{
}
