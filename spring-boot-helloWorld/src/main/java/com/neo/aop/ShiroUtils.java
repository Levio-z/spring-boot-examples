package com.neo.aop;

public class ShiroUtils {
    public static User getSysUser() {
        // 实现获取当前系统用户的方法
        User user = new User();
        user.setLoginName("admin");
        user.setDept(new Dept("开发部"));
        return user;
    }

    public static String getIp() {
        // 实现获取请求 IP 的方法
        return "127.0.0.1";
    }
}