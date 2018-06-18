package su.full;

import com.google.common.base.CharMatcher;

public class PersonalInfoUtils {
	public int countWords(String str){
		if (str == null) return 0;
		if (str.isEmpty()) return 0;
		return 0;
	}
	public int countWords(String str, Language... languages){
		return 0;
	}
	public int countASCIIChar(String str){
		if (str == null || str.equals("")) return 0;
		int count = 0;
		String out = "";
		for (int i = 0; i < str.length(); i++){
			char chr = str.charAt(i);
			boolean ascii = CharMatcher.ascii().matches(chr);
			if (ascii) count++;
		}
		return count;
	}
	public int extractFirstName(String fullname, int type){
		return 0;
	}
}
