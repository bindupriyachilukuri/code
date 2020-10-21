package largestnum;

import java.util.Scanner;

public class largestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=0;
int max=Integer.MAX_VALUE;
while(count<n)
{
	int input=sc.nextInt();
	if(input>max)
	{
		max=input;
	}
	count++;
}
System.out.println(max);
	}

}
