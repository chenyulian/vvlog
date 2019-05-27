package com.ylchen.vvlog.pojo;

import java.util.Date;

public class UserLikeVideo {
    private String id;

    private String videoId;

    private String userId;

    private Date addTime;

    public UserLikeVideo(String id, String videoId, String userId, Date addTime) {
        this.id = id;
        this.videoId = videoId;
        this.userId = userId;
        this.addTime = addTime;
    }

    public UserLikeVideo() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId == null ? null : videoId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}