package com.springbootjpa.datajpa.common;

import java.security.MessageDigest;
import java.util.List;

public class Util {

	private Util() {
	}
	
	public static boolean isNullOrBlank(String input) {
		return null==input || input.trim().length()==0;
	}
	
	public static boolean isListNullOrEmpty(List<?> list) {
		return null==list || list.isEmpty();
	}
	
	public static boolean isListNotNullOrEmpty(List<?> list) {
		return !isListNullOrEmpty(list);
	}
	
	public static String getHashCode512(String param) {
		StringBuilder hashCodeBuilder = new StringBuilder();
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-512");
			md.update(param.getBytes());
			byte byteData[] = md.digest();
			// convert the byte to hex format method
			for (int i = 0; i < byteData.length; i++) {
				hashCodeBuilder.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
			}
		} catch (Exception e) {
			return null;
		}
		if (hashCodeBuilder.length() > 0)
			return hashCodeBuilder.toString();
		return null;
	}
}
