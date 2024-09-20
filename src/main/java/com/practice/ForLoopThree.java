package com.practice;

public class ForLoopThree {
	public static void main(String[] args) {
		String a = "Im watching you";
		int var = 6;
	for(int i =0;i <= var;i++) {
		System.out.println(a);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
}
