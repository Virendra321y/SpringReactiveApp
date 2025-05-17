package com.reactive.SpringReactiveApp.service;

import com.reactive.SpringReactiveApp.dto.UserDTO;
import com.reactive.SpringReactiveApp.entity.User;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<User> createUser(UserDTO userDTO);
    Flux<User> getAllUsers();
    Mono<User> getUserById(Long id);
    Mono<User> updateUser(Long id, UserDTO userDTO);
    Mono<Void> deleteUser(Long id);
}

