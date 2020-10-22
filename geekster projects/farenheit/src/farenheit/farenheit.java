package farenheit;

import java.util.Scanner;

public class farenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int f=sc.nextInt();
		double c=((double)5/9)*(f-32);
		System.out.println(c);
	}

}
