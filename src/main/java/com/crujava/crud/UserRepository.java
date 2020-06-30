package com.crujava.crud;

import java.util.List;
import org.springframework.data.repository.Repository;

public interface UserRepository extends Repository<User, Integer>{
    List<User>findAll();
    User findOne(int id);
    User save(User user);
    void delete(User user);    
}
