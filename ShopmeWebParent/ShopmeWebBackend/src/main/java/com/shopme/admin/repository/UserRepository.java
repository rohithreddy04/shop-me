package com.shopme.admin.repository;

import com.shopme.common.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
