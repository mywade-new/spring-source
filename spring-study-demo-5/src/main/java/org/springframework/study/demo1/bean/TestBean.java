package com.study.spring.main.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author wanghongjie
 * @date 2022/1/15 23:02
 */
@Component
public class TestBean {

    @Autowired
    private TestBean2 testBean2;
}
