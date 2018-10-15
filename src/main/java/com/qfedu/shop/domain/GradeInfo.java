package com.qfedu.shop.domain;

public class GradeInfo {
    private Integer id;

    private String ginfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGinfo() {
        return ginfo;
    }

    public void setGinfo(String ginfo) {
        this.ginfo = ginfo == null ? null : ginfo.trim();
    }
}