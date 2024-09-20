package com.practice;

public class ReverseFive {
public static void fiveReverse(String name) {
	StringBuilder a = new StringBuilder(name);
	System.out.println(a.reverse());
}
public static void main(String[] args) {
	fiveReverse("Azula");
}
}
