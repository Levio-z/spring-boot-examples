package com.neo.aop;

import lombok.Data;

@Data
public class OperLog {
    private int status;
    private String operIp;
    private String jsonResult;
    private String operUrl;
    private String operName;
    private String deptName;
    private int businessType;
    private String title;
    private int operatorType;
    private String operParam;
    private String method;
    private String requestMethod;
    private String errorMsg;

    // getters and setters
}