package com.github.writeback.client.support;

import com.github.writeback.client.WriteBackClient;

public class OnlyDecreaseThread implements Runnable {
	private String key;
	private WriteBackClient client;
	private int callCount;
	
	public OnlyDecreaseThread(String key, WriteBackClient client, int callCount) {
		this.key = key;
		this.client = client;
		this.callCount = callCount;
	}
	
	public void run() {
		for (int i = 0; i < callCount; i++) {
			client.decrease(key);
		}
	}
}