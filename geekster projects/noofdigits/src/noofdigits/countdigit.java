package noofdigits;

import java.util.Scanner;

public class countdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int count=0;
		while(input!=0)
		{
			input=input/10;
			count++;
			
		}
		System.out.println(count);
	}

}
