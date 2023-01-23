package com.example.part2.models;

import jakarta.persistence.*;

@Entity
@Table(name="crypto_user")
public class CryptoUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="username")
    private String username;
    @Column(name="email")
    private String email;
    @Column(name = "pass")
    private String pass;
    @Column(name="roles")
    private String roles;

    public CryptoUser(){}

    public CryptoUser(String username, String email, String password, String roles) {
        this.username = username;
        this.email = email;
        this.pass = password;
        this.roles = roles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + pass + '\'' +
                ", roles='" + roles + '\'' +
                '}';
    }
}
