package com.springweb.utils;

/**
 * StringUtils
 * @author ntluu
 * @version 0.1
 * @since 2016-05-09
 * @modified: n/a
 */
public class StringUtils {
	
	public static boolean isEmpty(Object obj) {
		if (null == obj) {
			return true;
		}
		
		if(obj instanceof String && ((String)obj).isEmpty()) {
			return true;
		}
		
		return false;
	}
	
	public static boolean isNotEmpty(Object obj) {
		if (null == obj) {
			return false;
		}
		
		if(obj instanceof String && ((String)obj).isEmpty()) {
			return false;
		}
		
		return true;
	}
	
	public static String addEmpty(Object obj) {
		if (null != obj) {
			return obj.toString();
		}
		return "";
	}
}
