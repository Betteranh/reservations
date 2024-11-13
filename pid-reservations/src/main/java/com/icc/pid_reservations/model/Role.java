package com.icc.pid_reservations.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "role", length = 30)
    private String role;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;

    protected Role() {
    }

    public Role(Integer id, String role, List<User> users) {
        this.id = id;
        this.role = role;
        this.users = users;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
