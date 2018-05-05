import java.util.Scanner;

public class CircularPrime {
	
	//method to check if the no is prime or not
	public static boolean isPrimeNumber(int value)
	{		
		if(value==2) return true;
		if(value==0||value==1) return false;
		for (int i=2;i<value/2;i++) {
			if(value%i==0) return false;			
		}	
		return true;
	}
	
	//method to circulate the integer.
	public static int circulate(int value) {
		String temp = "";
		String stringValue = Integer.toString(value);		
		temp = stringValue.substring(1)+stringValue.charAt(0);
		return Integer.parseInt(temp);		
	}
	
	//method to check for circular prime
	public static String decision(int value) {
		int temp = value; 
		do {
			if(!isPrimeNumber(temp))
				return "Element is not a prime no"+temp;
			else 
			 temp = circulate(temp);				
		} while(temp!=value);
		
		return "Element is a prime no"+value;
		
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the integer to check if it is a prime:");
		int val = scan.nextInt();
		scan.close();
		System.out.println(decision(val));
	}

}
