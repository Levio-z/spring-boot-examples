package com.neo.aop;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AsyncFactory {
    public Runnable recordOper(OperLog operLog) {
        // 返回一个用于记录操作日志的 Runnable 任务
        // 编写一个Runnable 打印json格式的日志
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("========");
                System.out.println(JSONObject.toJSONString(recordOper(operLog)));
                System.out.println("========");
                log.info("记录操作日志：{}", JSONObject.toJSONString(operLog));
            }
        };

    }
}