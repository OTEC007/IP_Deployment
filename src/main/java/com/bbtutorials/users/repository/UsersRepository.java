package com.bbtutorials.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bbtutorials.users.entity.Users;

@RepositoryRestResource()
public interface UsersRepository extends JpaRepository<Users, Integer> {}
