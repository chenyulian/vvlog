package com.ylchen.vvlog.pojo;

import java.util.Date;

public class Comment {
    private String idcomments;

    private String videoId;

    private String commentUserId;

    private Date createTime;

    private String comment;

    public Comment(String idcomments, String videoId, String commentUserId, Date createTime, String comment) {
        this.idcomments = idcomments;
        this.videoId = videoId;
        this.commentUserId = commentUserId;
        this.createTime = createTime;
        this.comment = comment;
    }

    public Comment() {
        super();
    }

    public String getIdcomments() {
        return idcomments;
    }

    public void setIdcomments(String idcomments) {
        this.idcomments = idcomments == null ? null : idcomments.trim();
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId == null ? null : videoId.trim();
    }

    public String getCommentUserId() {
        return commentUserId;
    }

    public void setCommentUserId(String commentUserId) {
        this.commentUserId = commentUserId == null ? null : commentUserId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}