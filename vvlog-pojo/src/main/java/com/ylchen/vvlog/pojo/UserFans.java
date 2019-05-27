package com.ylchen.vvlog.pojo;

public class UserFans {
    private String iduserFans;

    private String userId;

    private String fanId;

    public UserFans(String iduserFans, String userId, String fanId) {
        this.iduserFans = iduserFans;
        this.userId = userId;
        this.fanId = fanId;
    }

    public UserFans() {
        super();
    }

    public String getIduserFans() {
        return iduserFans;
    }

    public void setIduserFans(String iduserFans) {
        this.iduserFans = iduserFans == null ? null : iduserFans.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getFanId() {
        return fanId;
    }

    public void setFanId(String fanId) {
        this.fanId = fanId == null ? null : fanId.trim();
    }
}