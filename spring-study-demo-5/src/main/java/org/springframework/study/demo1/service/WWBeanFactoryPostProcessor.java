package org.springframework.study.demo1.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * TODO
 *  @author wanghongjie
 *  @date 2022/5/29 23:30
 */
@Component
public class WWBeanFactoryPostProcessor implements BeanFactoryPostProcessor, ApplicationContextAware {

	private ApplicationContext applicationContext;

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("获取beanfactory, 对应的applicationContext为" + applicationContext);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		System.out.println("获取applicationContext, 对应的applicationContext为" + this.applicationContext);
	}
}
