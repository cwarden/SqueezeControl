package com.squeezecontrol.util;

import java.util.HashMap;
import java.util.Map;

public class PathUtils {

	private static Map<Character, Character> replaceMap = new HashMap<Character, Character>();
	static {
		replaceMap.put('\\', ' ');
		replaceMap.put('/', ' ');
		replaceMap.put('<', ' ');
		replaceMap.put('<', ' ');
		replaceMap.put('>', ' ');
	}
	
	public static String escapeInvalidPathCharacters(String pathSegment) {
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < pathSegment.length(); i++) {
			char c = pathSegment.charAt(i);
			Character replacement = replaceMap.get(c);
			if (replacement != null) b.append(replacement);
			else b.append(c);
		}
		return b.toString();
	}
}
