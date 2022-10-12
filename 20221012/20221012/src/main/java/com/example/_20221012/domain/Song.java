package com.example._20221012.domain;

public class Song {
    private String title;
    private String singer;
    private String composer;
    private int year;

    public Song(String title, String singer, String composer, int year) {
        this.title = title;
        this.singer = singer;
        this.composer = composer;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
