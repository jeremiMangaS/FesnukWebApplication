package com.mycompany.fesnukwebapp.model;

import jakarta.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "app_users")// Nama tabel
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Integer userId;
    @Column(unique = true, nullable = false, length = 50) private String username;
    @Column(unique = true, nullable = false, length = 255) private String email;
    @Column(nullable = false, length = 255) private String password;
    @Column(name = "display_name", length = 255) private String displayName;
    @Column (columnDefinition = "TEXT") private String bio;
    
    @Enumerated(EnumType.STRING) 
    @Column(nullable = false, length = 50) private Role role;
    
    @Column(name = "created_at", nullable = false) private OffsetDateTime createdAt;
    @Column(name = "updated_at", nullable = false) private OffsetDateTime updatedAt;
    
    public User() {}
    
    public Integer getUserId()
    {
        return userId;
    }
        
    public void setUserId(Integer userId) 
    {
        this.userId = userId;
    }
        
    public String getUsername()
    {
        return username;
    }
        
    public void setUsername(String username)
    {
        this.username = username;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String email) 
    {
        this.email = email;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public String getDisplayName()
    {
        return displayName;
    }
    
    public void setDisplayName(String displayName)
    {
        this.displayName = displayName;
    }
    
    public String getBio()
    {
        return bio;
    }
    
    public void setBio(String bio)
    {
        this.bio = bio;
    }
    
    public Role getRole()
    {
        return role;
    }
    
    public void setRole(Role role) 
    {
        this.role = role;
    }
    
    public OffsetDateTime getCreatedAt()
    {
        return createdAt;
    }
    
    public void setCreatedAt(OffsetDateTime createdAt)
    {
        this.createdAt = createdAt;
    }
    
    public OffsetDateTime getUpdateAt()
    {
        return updatedAt;
    }
    
    public void setUpdatedAt(OffsetDateTime updatedAt)
    {
        this.updatedAt = updatedAt;
    }
    
    // Override
}
