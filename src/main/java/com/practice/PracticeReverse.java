package com.practice;

public class PracticeReverse {
// how to reverse a string
	//for loop
	
	public void getReverse(String country) {
		for(int i=(country.length())-1;i>=0;i--) {
			System.out.print(country.charAt(i));
		}
	
}
	public static void main(String[] args) {
		PracticeReverse obj = new PracticeReverse();
		obj.getReverse("America");
		obj.SBReverse("Skittles");
	}
	
	public void SBReverse(String country) {
		StringBuilder sb = new StringBuilder(country);
		System.out.println(sb.reverse());
	}
}