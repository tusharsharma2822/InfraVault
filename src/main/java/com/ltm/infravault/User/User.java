package com.ltm.infravault.User;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document(collection = "users")
public class User {

    @Id
    private String id;

    private String fullName;
    private String email;
    private String passwordHash;
    private String role;
    private String status;
    private boolean emailVerified;
    private Instant createdAt;
    private Instant updatedAt;

    public User(){};

    public User(String fullName, String email){
        this.fullName = fullName;
        this.email = email;
    };

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getFullName(){
        return fullName;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPasswordHash(){
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash){
        this.passwordHash = passwordHash;
    }

    public String getRole(){
        return role;
    }

    public void setRole(String role){
        this.role = role;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public boolean isEmailVerified(){
        return emailVerified;
    }

    public void setIsEmailVerified(boolean emailVerified){
        this.emailVerified = emailVerified;
    }

    public Instant getCreatedAt(){
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt){
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt(){
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt){
        this.updatedAt = updatedAt;
    }
}