package com.example.appmusicconbeo.models;

public class AlbumSong {
    private String albumId;
    private String songId;
    private int order; // Thứ tự trong album

    public AlbumSong() { }

    public AlbumSong(String albumId, String songId, int order) {
        this.albumId = albumId;
        this.songId = songId;
        this.order = order;
    }

    public String getAlbumId() { return albumId; }
    public String getSongId() { return songId; }
    public int getOrder() { return order; }

    public void setAlbumId(String albumId) { this.albumId = albumId; }
    public void setSongId(String songId) { this.songId = songId; }
    public void setOrder(int order) { this.order = order; }
}
