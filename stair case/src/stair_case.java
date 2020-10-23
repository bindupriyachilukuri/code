import java.util.Scanner;

public class stair_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int num  = Integer.parseInt(sc.nextLine());
	        for(int j=0;j<num;j++){
	            for(int i=1;i<=num;i++){
	                System.out.print(i<num-j?" ":"#");
	            }
	            System.out.println("");
	        }
	}

}
