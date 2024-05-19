package com.roodymike.userhandler.userhandlerybmanager.jpamodels;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class Users {
    private String accountId;
    private String username;
    private String email;
    private String pass;
    private String roles;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "accountid", nullable = false, unique = true)
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Column(name = "username", nullable = false, unique = true)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "email", nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "pass", nullable = false)
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Column(name = "roles", nullable = false)
    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Users{" +
                "account_id='" + accountId + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                ", roles='" + roles + '\'' +
                '}';
    }
}
