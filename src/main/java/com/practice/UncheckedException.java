package com.practice;

public class UncheckedException {
	
	int a = 5;
	public void getNumber() {
		System.out.println(a);
		System.out.println(a=4);
		System.out.println(a/0);
	}
public static void main(String[] args) {
	UncheckedException obj = new UncheckedException();
	obj.getNumber();
}
}
