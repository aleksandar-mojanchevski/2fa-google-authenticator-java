package com.example.auth.google;

public class MainApplication {

	public static void main(String[] args) throws Exception {
		String gitSecretKey = "O65RGRM5UYRGFC44";
		String googleSecretKey = "IHXK GAO3 4ZG7 DXDE 3BCP 5AT4 6PTU GRZ3";
		String hypercubegoogleKey = "JDRA YTJ6 FCMW DHO3 DFV3 IZXT O3QC DEEK";

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
