package _01_StringBuilder;


public class _03_StringBuilder {
    
    public static String append(String str, char[] characters) {
    	 StringBuilder builder = new StringBuilder();
    	String sr = new String(characters);
    	
    	 String r = builder.append(str+sr).toString();
    	  System.out.println(r);
        return r;
    }
    
    public static String reverse(String str) {
    	 StringBuilder builder = new StringBuilder(str);
    	  System.out.println(str);
     	str = builder.reverse().toString();
     	
     	  System.out.println(str);
         return str;
    }
    
    public static String insert(String str, int index, char newChar) {
   	 StringBuilder builder = new StringBuilder(str);
   	 System.out.println(str);
   	str = builder.insert(index, newChar).toString();
	 System.out.println(str);
        return str;
    }
    
    public static String delete(String str, int startIndex, int endIndex) {
    	 StringBuilder builder = new StringBuilder(str);
       	 System.out.println(str);
       	str = builder.delete(startIndex, endIndex).toString();
    	 System.out.println(str);
            return str;
    }
}