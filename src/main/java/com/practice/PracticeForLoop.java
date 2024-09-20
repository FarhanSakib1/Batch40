package com.practice;

public class PracticeForLoop {
public void getLoop() {
	for(int i=0;i<=10;i++) {
		System.out.println(i);
	}



}
public static void main(String[] args) {
	PracticeForLoop obj = new PracticeForLoop();
	obj.getLoop();
	obj.NegativeForLoop();
	obj.InfiniteLoop();
}
public void NegativeForLoop() {
	for(int j=100;j>=0;j--) {
		System.out.println(j);
	}
	

	}
public void InfiniteLoop() {
	for(int a=0;;a++) {
		System.out.println(a);
		if(a==50) {
			break;
		}
		
}
}

}
