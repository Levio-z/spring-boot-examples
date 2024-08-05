package com.neo.aop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String loginName;
    private Dept dept; // 假设Dept是部门的类

    // getters and setters
}