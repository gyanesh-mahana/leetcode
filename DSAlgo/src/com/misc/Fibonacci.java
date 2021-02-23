package com.misc;

public class Fibonacci {

	public void fibonacciWithLoop(int count) {
		int prev = 0;
		int curr = 1;
		int res = prev;
		for (int i = 0; i < count; i++) {

			System.out.print(res + " ");
			res = prev + curr;
			if (i == 0) {
				continue;
			}
			prev = curr;
			curr = res;
		}
		System.out.println();
	}
	
	public void fibonacciWithLoopV2(int count) {
		for(int i=0; i<count;i++) {
			System.out.print(fibonacciWithRecursion(i)+" ");
		}
	}

	public static int fibonacciWithRecursion(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibonacciWithRecursion(n - 1) + fibonacciWithRecursion(n - 2);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci f = new Fibonacci();
		f.fibonacciWithLoop(10);
		f.fibonacciWithLoopV2(10);
	}

}
