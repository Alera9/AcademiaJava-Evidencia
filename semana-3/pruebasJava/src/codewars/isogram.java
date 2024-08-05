package codewars;

import java.util.Arrays;

public class isogram {
	 public static boolean  isIsogram(String str) {
		 String compareStr = str.toLowerCase();
		 String[] strA = compareStr.split("");
		 boolean result = false;
		 for(String c: strA) {
			 
			 if( compareStr.indexOf(c) != compareStr.lastIndexOf(c)) {
				 result = false;
				 break;
			 }
			 result = true;
		 }
		 System.out.println(Arrays.toString(strA));
	        // ...
	      return result;
	    } 
	 
	 
	 //str.length() == str.toLowerCase().chars().distinct().count();
	 public static boolean  isIsogram2(String str) {
		 return str.length() == str.toLowerCase().chars().distinct().count();
	        // ...
	    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isIsogram("aba"));
		System.out.println(isIsogram2("moOse"));
		System.out.println(isIsogram("abc"));
		System.out.println(isIsogram2("mose"));

		
	}

}
