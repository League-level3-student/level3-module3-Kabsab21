package _02_The_Wave;

import java.util.ArrayList;

public class _01_TheWave {
	/*
	 * Background: https://en.wikipedia.org/wiki/Wave_%28audience%29
	 * 
	 * Task: Your task is to create a function that turns a string into a Wave. You
	 * will be passed a string and you must return that string in an ArrayList where
	 * an uppercase letter is a person standing up. Example: wave("hello") =>
	 * "Hello", "hEllo", "heLlo", "helLo", "hellO"
	 * 
	 * 1. The input string will always be lower case but maybe empty. 2. If the
	 * character in the string is whitespace then pass over it as if it was an empty
	 * seat.
	 */

	public static ArrayList<String> wave(String str) {

		ArrayList<String> wave = new ArrayList<String>(str.length());
		StringBuilder builder = new StringBuilder(str);

		for (int i = 0; i < str.length(); i++) {
			System.out.println(i);
			char a = Character.toUpperCase(str.charAt(i));
			
			String r = builder.insert(i, a).toString();
			r = builder.delete(i + 1, i + 2).toString();
			if(i >= 1) {
				char b = Character.toLowerCase(str.charAt(i-1));
				r = builder.insert(i, b).toString();
				r =  builder.delete( i-1, i).toString();
			}
			if(r != r.toLowerCase()) {
					wave.add(r);
			
			}
		
		
}
		System.out.println(wave);
		return wave;
	}
}
	
//String r = "";
//for (int in = 0; in < str.length(); in++) {
//	
//	if( in != i ) {
//		r = builder.insert( in, in).toString();
//	} else if(in == i){
//		r = builder.insert(in, Character.toUpperCase(str.charAt(i))).toString();
//	}
//	wave.add(r);
//}
	
	
	
	
	

		// if( i > 1 ) {
//	char b = Character.toLowerCase(str.charAt(i-1));
//	String r = 	 builder.insert( i, b).toString();
//  	r =  builder.delete( i-1, i).toString();
//    		wave.add( r);
		// }
//		System.out.println(i);
//		char a = Character.toUpperCase(str.charAt(i));
//		char b = Character.toLowerCase(str.charAt(i-1));
//		String r = builder.insert(i, a).toString();
//		r = builder.insert(i, b).toString();
//		r =  builder.delete( i-1, i).toString();
//		r = builder.delete(i + 1, i + 2).toString();
//		wave.add(r);
//		
//	}
//	System.out.println(wave);
//	return wave;
