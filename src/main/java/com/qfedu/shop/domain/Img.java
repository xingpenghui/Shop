package com.qfedu.shop.domain;

public class Img {
    private Integer id;

    private String imginfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImginfo() {
        return imginfo;
    }

    public void setImginfo(String imginfo) {
        this.imginfo = imginfo == null ? null : imginfo.trim();
    }
}