package com.practice;

public class ForLoopTwo {
public static void main(String[] args) throws Exception {
	String a = "I'm watching you!";
	int b = 5;
	
	for(int i = 0;i<b;i++) {
		Thread.sleep(2000);
		System.out.println(a);
	}
}
}
