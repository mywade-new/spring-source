package org.springframework.study.demo1.service;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * spring的监听
 *
 * @author wanghongjie
 * @date 2022/5/29 21:28
 */
@Component
@Lazy //哪怕使用懒加载的方式，依然可以触发监听
public class WWApplicationListener implements ApplicationListener<PayloadApplicationEvent<String>> {

//	@Override
//	public void onApplicationEvent(ApplicationEvent event) {
//		System.out.println("收到事件监听结果:" + event);
//	}

	/**
	 * PayloadApplicationEvent监听增强类可获取监听的对象
	 * @param event
	 * @author wanghongjie
	 * @date 2022/5/29 22:45
	 * @return void
	 */
	@Override
	@EventListener
	public void onApplicationEvent(PayloadApplicationEvent<String> event) {
		System.out.println("收到事件监听结果:" + event.getPayload());

	}
}
