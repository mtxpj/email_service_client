package com.email.client.tools;

import java.util.ArrayList;
import java.util.List;

public class StringAndListTools {

	public static List<String> convertStringToList(String inputString) {
		List<String> list = new ArrayList<String>();
		String[] array = inputString.split(",");
		for (String singleString : array) {
			list.add(singleString);
		}
		return list;
	}

	public static String convertListToString(List<String> list) {
		StringBuilder sb = new StringBuilder();
		for (String string : list) {
			sb.append(string);
			sb.append(",");
		}
		sb.setLength(sb.length() - 1);
		return sb.toString();
	}

}
