package com.cn.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogBackDemo {
    //获取日志对象
    public static final Logger LOGGER = LoggerFactory.getLogger("LogBackDemo.class");

    public static void main(String[] args) {
        try {
            LOGGER.debug("main方法开始执行了");
            LOGGER.info("记录第二行日志");
            int a=10;
            int b=0;
            LOGGER.trace("a=" +a);
            LOGGER.trace("b="+b);
            System.out.println(a/b);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("功能出现异常："+e);
        }
    }
}
