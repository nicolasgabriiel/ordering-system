package com.nsilva.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nsilva.project.entities.User;

public interface IUserRepository extends JpaRepository<User, Long> {

}