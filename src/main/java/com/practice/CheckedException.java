package com.practice;

public class CheckedException {

	public void getValue() {
		System.out.println("Hello!");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Boo!");
		
	}
	public static void main(String[] args) {
		CheckedException obj = new CheckedException();
		obj.getValue();
	}
}
