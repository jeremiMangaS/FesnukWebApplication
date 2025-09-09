package com.mycompany.fesnukwebapp.dto;

//import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.Size;

public class UserRegistrationRequest {
    private String username;
    private String email;
    private String password;
    private String bio;
    
    public UserRegistrationRequest() {}
    
    // Get & Set
    
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
    
    public String getBio()
    {
        return bio;
    }
    
    public void setBio(String bio)
    {
        this.bio = bio;
    }
}
