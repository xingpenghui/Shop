package com.qfedu.shop.utils;

import us.codecraft.webmagic.Spider;

/**
 *@Author feri
 *@Date Created in 2018/10/13 09:11
 */
public class Sprider_Main {
    public static void main(String[] args) {
        String url="https://www.cnblogs.com/";
        new Spider(new YHDProcess()).addUrl(url).addPipeline(new YHDPipeline()).thread(3).run();
    }
}
