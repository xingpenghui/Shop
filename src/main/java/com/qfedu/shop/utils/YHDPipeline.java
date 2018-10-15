package com.qfedu.shop.utils;


import com.qfedu.shop.domain.Grade;
import com.qfedu.shop.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/10/13 10:08
 * 基于WebMagic存储爬取结果到数据库中
 */
@Service
public class YHDPipeline implements Pipeline {

    @Autowired
    private GradeService gradeService;



    @Override
    public void process(ResultItems resultItems, Task task) {
        List<Grade> list= resultItems.get("data");//key
        for(Grade cb:list){
            gradeService.save(cb);
        }
        System.err.println("此次新增："+list.size());
    }
}
