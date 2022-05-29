package org.springframework.study.demo1.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
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
	private ApplicationContext applicationContext;

	@Autowired
	private BeanFactory beanFactory;

	@Autowired
	private Environment environment;

	public void say(){
		System.out.println(111222211);
		System.out.println(applicationContext);
		System.out.println(beanFactory);
		System.out.println(environment);
	}
}
