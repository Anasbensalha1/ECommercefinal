package com.ecom.dao;

import com.ecom.entity.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecom.entity.User;

import java.util.List;

@Repository
public interface UserDao extends CrudRepository<User, String> {
    public List<User> findByUserNameContainingIgnoreCaseOrUserFirstNameContainingIgnoreCase(
            String key1, String key2, Pageable pageable);
    public List<User> findAll(Pageable pageable);
}
