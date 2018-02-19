package org.cipher;

public class Cipher {
	
	char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	
	public String Encrypt(String input) {
		String output = "";
		for(int i=0; i < input.length(); i++) {
			for(int j=0; j < alphabet.length; j++) {
				if(input.charAt(i) == alphabet[j]) {
					if(j+3<=25) {
						output = output + alphabet[j+3];
					}else {
						output = output + alphabet[j-23];
					}
					j = alphabet.length;
				}
			}
		}
		return output;
	}
	
	public String Decrypt(String input) {
		String output = "";
		for(int i=0; i < input.length(); i++) {
			for(int j=0; j < alphabet.length; j++) {
				if(input.charAt(i) == alphabet[j]) {
					if(j-3>=0) {
						output = output + alphabet[j-3];
					}else {
						output = output + alphabet[j+23];
					}
					j = alphabet.length;
				}
			}
		}
		return output;
	}

}
