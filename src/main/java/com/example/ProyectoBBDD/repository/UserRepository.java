package com.example.ProyectoBBDD.repository;

import com.example.ProyectoBBDD.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}
