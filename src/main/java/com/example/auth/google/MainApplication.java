package com.example.auth.google;

public class MainApplication {

	public static void main(String[] args) throws Exception {
		String secretKey = "setsecret";
		String code = Utils.getTOTPCode(secretKey);
		System.out.println(code);
		while (true) {
			String ncode = Utils.getTOTPCode(secretKey);
			if (!code.equals(ncode)) {
				code = ncode;
				System.out.println(code);
			}
			Thread.sleep(500);
		}

	}

}
