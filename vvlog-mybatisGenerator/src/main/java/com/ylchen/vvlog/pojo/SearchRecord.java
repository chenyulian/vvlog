package com.ylchen.vvlog.pojo;

public class SearchRecord {
    private String idsearchRecords;

    private String content;

    public SearchRecord(String idsearchRecords, String content) {
        this.idsearchRecords = idsearchRecords;
        this.content = content;
    }

    public SearchRecord() {
        super();
    }

    public String getIdsearchRecords() {
        return idsearchRecords;
    }

    public void setIdsearchRecords(String idsearchRecords) {
        this.idsearchRecords = idsearchRecords == null ? null : idsearchRecords.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}