package com.example.appmusicconbeo.models;

public class User {
    private String userId;
    private String username;
    private String email;
    private String passwordHash; // mật khẩu đã băm
    private String fullName;

    public User() { } // Constructor rỗng cần thiết cho Firebase

    public User(String userId, String username, String email, String fullName) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.fullName = fullName;
    }

    public String getUserId() { return userId; }
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public String getFullName() { return fullName; }

    public void setUserId(String userId) { this.userId = userId; }
    public void setUsername(String username) { this.username = username; }
    public void setEmail(String email) { this.email = email; }
    public void setFullName(String fullName) { this.fullName = fullName; }
}
