package com.practice;

public class BlindReverse {
public static void StringReverse(String name) {
	StringBuilder obj = new StringBuilder(name);
	System.out.println(obj.reverse());
	
}
public static void main(String[] args) {
	StringReverse("Farhan");
}
}
