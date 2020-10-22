package sumofnnum;

import java.util.Scanner;

public class sumofnnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int count=0;
		while(count<=n)
		{
			int input=sc.nextInt();
			sum=sum+input;
			count++;
			
		}
		System.out.println(sum);
	}

}
