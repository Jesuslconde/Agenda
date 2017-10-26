package com.util;


public class FormatDate {
	public static String fechacat(String fmal) {
		String[] parts = fmal.split("/");
		String part0 = parts[0]; 
		String part1 = parts[1]; 
		String part2 = parts[2]; 
		String fbien = part2+ "/" + part1 + "/" + part0;
		return fbien;
	}
}
