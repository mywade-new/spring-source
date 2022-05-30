package org.springframework.study.demo1.service;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 *  Spring生命周期接口
 *  @author wanghongjie
 *  @date 2022/5/29 21:24
 */
@Component
public class WWLifeCycleService implements SmartLifecycle {

	private boolean isRunning = false;

	@Override
	public void start() {
		System.out.println("start now");
		isRunning = true;
	}

	@Override
	public void stop() {
		System.out.println("stop now");
		isRunning = false;
	}

	@Override
	public boolean isRunning() {
		return isRunning;
	}
}
