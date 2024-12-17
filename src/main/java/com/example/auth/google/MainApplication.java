package com.example.auth.google;

public class MainApplication {

	public static void main(String[] args) throws Exception {
		String gitSecretKey = "setsecret";
		String googleSecretKey = "setsecret";
		String hypercubegoogleKey = "setsecret";

		String secretKey = hypercubegoogleKey;
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
