import java.util.HashMap;

public class NumberOfOccurences {

	//Write a java program to find the duplicate words and their number of occurrences in a string
	public static void duplicateWords(String str)
	{
		String[] words = str.split(" ");
		
		HashMap<String,Integer> hm = new HashMap<>();
		for(int i=0;i<words.length;i++) {
		if(hm.containsKey(words[i])) hm.put(words[i], hm.get(words[i])+1);
		else
			hm.put(words[i], 1);		
	}
		System.out.println(hm);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicateWords("abc abc abc dbc www wujv");
	}

}
