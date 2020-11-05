package com.nick.apirestcursofullstack.entity;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class User {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="email", nullable = false)
    private String email;

    @Column(name="userpass", nullable = false)
    private String password;

    @Column(name="nombre", nullable = false)
    private String name;

    @Column(name="apellido", nullable = false)
    private String surname;

    @Column(name = "user_role", nullable = false)
    private String userRole;

    protected User(){

    }

    public User(Long id, String email, String password, String userRole) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.userRole = userRole;
    }

    public User(String email, String password, String userRole) {
        this.email = email;
        this.password = password;
        this.userRole = userRole;
    }

    public User(String email, String password, String nombre, String surname, String userRole) {
        this.email = email;
        this.password = password;
        this.name = nombre;
        this.surname = surname;
        this.userRole = userRole;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
}
