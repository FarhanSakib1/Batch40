package com.practice;

public class BlindReverseTwo {
public static void reverse(String name) {
	StringBuilder obj = new StringBuilder(name);
	System.out.println(obj.reverse());
}public static void main(String[] args) {
	reverse("Nasima");
}
}
