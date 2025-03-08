package com.example.myappmusicconbeo;

public class SettingItem {
    private String title;
    private String description;
    private SettingType type;

    public SettingItem(String title, String description, SettingType type) {
        this.title = title;
        this.description = description;
        this.type = type;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public SettingType getType() { return type; }
}
