package file;

import java.util.ArrayList;

public class MiniQuiz {

	public static boolean isPalindrome(String str) {
		
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		if(str.equals(reverse))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		System.err.println(isPalindrome("KAPAK"));
		System.err.println(isPalindrome("LAPAK"));
		}

}
