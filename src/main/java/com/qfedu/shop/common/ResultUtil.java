package com.qfedu.shop.common;


import com.qfedu.shop.vo.R;

/**
 *@Author feri
 *@Date Created in 2018/10/12 11:37
 */
public class ResultUtil {
    //
    public static R setOK(String msg){
        return new R(200,msg,null);
    }
    public static R setERROR(String msg){
        return new R(400,msg,null);
    }
    public static R setRes(int count){
        if(count>0){
            return setOK("操作成功");
        }else {
            return setERROR("操作失败");
        }
    }

}
