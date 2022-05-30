package org.springframework.study.demo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.study.demo1.bean.TestBean;
import org.springframework.study.demo1.config.AppConfig;

/**
 * TODO
 *  @author wanghongjie
 *  @date 2022/5/26 14:47
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		TestBean bean = applicationContext.getBean(TestBean.class);
		bean.say();

		// 发布事件
		applicationContext.publishEvent("1111");

		applicationContext.close();

	}
}
