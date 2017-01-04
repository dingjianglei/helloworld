package com.djl.demo;

import java.util.logging.Logger;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.djl.demo.service.UserService;

/**
 * Hello world!
 */
public class App {
    final static Logger log = Logger.getLogger(App.class.getName());
    final static String str = "";

    public static void main(String[] args) {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            log.info("service start success");
            UserService userService = context.getBean("userService", UserService.class);
            log.info("测试userService.login");
            userService.login("jianglei", "ding");
            synchronized (str) {
                str.wait();
            }
        } catch (BeansException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
