import java.util.Scanner;

public class DecimalToBinary {
	public static void printBinary(int number)
	{
		int binary[] = new int[25];
		int index =0, temp=0;
		while(number>0)
		{
			temp = number%2;
			binary[index]= temp;
			number=number/2;
			index++;
		}
		
		for(int i=index+1;i>1;i--)
		{
			System.out.println(binary[i]);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the decimal no for conversion");
		int value = scan.nextInt();
		scan.close();
		printBinary(value);

	}

}
