package com.example.ProyectoBBDD.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

@Entity
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
    private String email;

}
