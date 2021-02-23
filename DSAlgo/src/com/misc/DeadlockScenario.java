/*
 * 11. How to Create a Deadlock Scenario Programatically?
 */

package com.misc;

public class DeadlockScenario {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();

		Thread t1 = new Thread(new SyncThread(obj1, obj2), "Thread1");
		Thread t2 = new Thread(new SyncThread(obj2, obj3), "Thread2");
		Thread t3 = new Thread(new SyncThread(obj3, obj1), "Thread3");

		t1.start();
		Thread.sleep(5000);
		t2.start();
		Thread.sleep(5000);
		t3.start();

	}

}
