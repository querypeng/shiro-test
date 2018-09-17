package com.pengfeng.demo;

public class Demo {

	private static final String str = "0123456789abcdefghjklmnpqrstuvwxy";

	public static void main(String[] args) {
		System.out.println(getCode());
	}
	public static String getCode() {
		StringBuilder code = new StringBuilder();
		for (int i = 0, length = str.length(); i < 8; i++)
			code.append(str.charAt((int) (Math.random() * length)));

		return code.toString();

	}
}
