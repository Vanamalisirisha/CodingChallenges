
public class StringRemove {
	
	//Method to remove char a from the string
	
	public static String stringRep(String str) {
		int len = str.length();
		if(len==0) {
			throw new IllegalArgumentException();
		}
		String temp = "";
		for(int i=0;i<len;i++){
			if(str.charAt(i)!='a')
			{
				temp+=str.charAt(i);
			}				
		}
		return temp;		
	}

	
	//method to replace char a from the string using replaceAll()
	
	public static String stringRem(String str) {
		char[] ch = str.toCharArray();
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]=='a') 				
			str= str.replace('a', ' ');			
		}
		return str.trim();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringRep("aaabbbb"));
		System.out.println(stringRem("aaabb"));
	}

}
