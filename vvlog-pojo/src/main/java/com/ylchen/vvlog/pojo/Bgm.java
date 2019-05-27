package com.ylchen.vvlog.pojo;

public class Bgm {
    private String idbgm;

    private String author;

    private String name;

    private String path;

    public Bgm(String idbgm, String author, String name, String path) {
        this.idbgm = idbgm;
        this.author = author;
        this.name = name;
        this.path = path;
    }

    public Bgm() {
        super();
    }

    public String getIdbgm() {
        return idbgm;
    }

    public void setIdbgm(String idbgm) {
        this.idbgm = idbgm == null ? null : idbgm.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }
}