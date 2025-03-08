package com.example.appmusicconbeo.models;

import java.util.Date;

public class Album {
    private String albumId;
    private String title;
    private String description;
    private Date createdDate;
    private String userId; // ID người tạo album

    public Album() { }

    public Album(String albumId, String title, String description, Date createdDate, String userId) {
        this.albumId = albumId;
        this.title = title;
        this.description = description;
        this.createdDate = createdDate;
        this.userId = userId;
    }

    public String getAlbumId() { return albumId; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public Date getCreatedDate() { return createdDate; }
    public String getUserId() { return userId; }

    public void setAlbumId(String albumId) { this.albumId = albumId; }
    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setCreatedDate(Date createdDate) { this.createdDate = createdDate; }
    public void setUserId(String userId) { this.userId = userId; }
}
