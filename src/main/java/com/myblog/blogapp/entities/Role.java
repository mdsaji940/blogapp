package com.myblog.blogapp.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
// we can use @setter and @getter instead of @Data
@Setter
@Getter
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
}
