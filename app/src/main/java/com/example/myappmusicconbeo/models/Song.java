package com.example.myappmusicconbeo.models;

public class Song {
    private String songId;
    private String title;
    private String artist;
    private int duration; // Giây
    private String sourceType; // "YouTube" hoặc "Local"
    private String youTubeId;
    private String filePath;

    public Song() { }

    public Song(String songId, String title, String artist, int duration, String sourceType, String youTubeId, String filePath) {
        this.songId = songId;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.sourceType = sourceType;
        this.youTubeId = youTubeId;
        this.filePath = filePath;
    }

    public String getSongId() { return songId; }
    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public int getDuration() { return duration; }
    public String getSourceType() { return sourceType; }
    public String getYouTubeId() { return youTubeId; }
    public String getFilePath() { return filePath; }

    public void setSongId(String songId) { this.songId = songId; }
    public void setTitle(String title) { this.title = title; }
    public void setArtist(String artist) { this.artist = artist; }
    public void setDuration(int duration) { this.duration = duration; }
    public void setSourceType(String sourceType) { this.sourceType = sourceType; }
    public void setYouTubeId(String youTubeId) { this.youTubeId = youTubeId; }
    public void setFilePath(String filePath) { this.filePath = filePath; }
}
