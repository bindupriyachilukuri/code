package simplearray;

import java.util.Scanner;

public class simplearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int sum = 0;
	        for(int arr_i=0; arr_i < n; arr_i++){
	            sum += in.nextInt();
	        }
	        System.out.println(sum);
	    }
	}


