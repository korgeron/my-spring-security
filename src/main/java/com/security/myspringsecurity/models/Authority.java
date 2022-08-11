package com.security.myspringsecurity.models;

import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "authorities")
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, length = 50)
    private String name;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "authorities")
    private List<User> users;

    public Authority() {
    }

    public Authority(String name) {
        this.name = name;
    }

    public Authority(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Authority(Long id, String name, List<User> users) {
        this.id = id;
        this.name = name;
        this.users = users;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
