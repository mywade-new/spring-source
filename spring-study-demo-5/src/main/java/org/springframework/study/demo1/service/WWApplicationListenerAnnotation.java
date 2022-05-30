package org.springframework.study.demo1.service;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 *  根据@EventListener生成监听处理对象
 *  @author wanghongjie
 *  @date 2022/5/29 22:59
 */
@Component
public class WWApplicationListenerAnnotation {

	@EventListener
	public void test(ApplicationEvent event){
		System.out.println("根据@EventListener生成监听处理对象-" + event);
	}
}
