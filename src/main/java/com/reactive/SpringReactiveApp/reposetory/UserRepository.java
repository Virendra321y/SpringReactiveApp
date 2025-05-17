package com.reactive.SpringReactiveApp.reposetory;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.reactive.SpringReactiveApp.entity.User;

@Repository
public interface UserRepository extends ReactiveCrudRepository<User, Long> {
}

