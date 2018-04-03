
public class Palindrome {
	//method to check if the string is palindrome or not
	
	public static boolean isPalindrome(String str)
	{
		if(str==null) return false;
		StringBuilder st = new StringBuilder(str);
		String temp = st.reverse().toString();
		return temp.equals(str);			
	}
	
	//method to check if the string is palindrome without sb.
	
	public static boolean isPalin(String str)
	{
		if(str==null) return false;
		int len = str.length();
		for(int i=0;i<len/2;i++) {
			if(str.charAt(i)!=str.charAt(len-i-1))
				return false;		
		}
		return true;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("aca"));
		System.out.println(isPalin("aca"));

	}

}
