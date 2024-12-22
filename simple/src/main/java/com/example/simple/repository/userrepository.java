package com.example.simple.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.simple.model.user;

public interface userrepository extends JpaRepository<user,Long> {

}
