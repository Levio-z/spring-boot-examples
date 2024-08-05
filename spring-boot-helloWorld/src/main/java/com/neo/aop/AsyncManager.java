package com.neo.aop;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AsyncManager {

    // 或者更精细地控制线程池
    static ExecutorService customExecutorService = new ThreadPoolExecutor(
            3, // 核心线程数
            5, // 最大线程数
            60L, // 空闲线程存活时间
            TimeUnit.SECONDS, // 时间单位
            new java.util.concurrent.ArrayBlockingQueue<>(10) // 任务队列容量
    );

    public static void execute(Runnable task) {
        // 实现异步执行任务的方法
        customExecutorService.execute(task);
    }
}

