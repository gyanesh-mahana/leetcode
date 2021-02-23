package com.misc;

public class SyncThread implements Runnable {

	private Object obj1;
	private Object obj2;

	public SyncThread(Object obj1, Object obj2) {
		// TODO Auto-generated constructor stub
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + "Running...");
		System.out.println(threadName + "acquiring lock on object1: " + obj1);
		synchronized (obj1) {
			System.out.println(threadName + "acquired lock on object1: " + obj1);
			work();
			System.out.println(threadName + "acquiring lock on object2: " + obj2);
			synchronized (obj2) {
				System.out.println(threadName + "acquired lock on object2: " + obj2);
				work();
			}
			System.out.println(threadName + "released lock on object2:" + obj2);
		}
		System.out.println(threadName + "released lock on object1:" + obj1);

		System.out.println(threadName + "finished execution...");
	}

	private void work() {
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
