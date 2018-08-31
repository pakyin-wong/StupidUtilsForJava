package proof;
import com.google.common.base.CharMatcher;


public class ProveUnicodeLength {
	public static void main(String args[]){
		String str = "中文英文abcd";
		System.out.println(str);
		for (int i = 0; i < str.length(); i++){
			char chr = str.charAt(i);
			boolean ascii;
			ascii = CharMatcher.ascii().matches(chr);
			System.out.println(i + ": " + chr + " / " + ascii);
			
		}
	}
}
