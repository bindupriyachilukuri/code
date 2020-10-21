package class17;

import java.util.ArrayList;

public class class17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSS("abc"));
	}

	private static ArrayList<String> getSS(String str) {
		if(str.length()==0)
		{
			ArrayList<String>toReturn=new ArrayList<>();
			toReturn.add("");
			return toReturn;
		}
		char ch=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> rr=getSS(ros);
		ArrayList<String> mr=new ArrayList<>();
		for(String s:rr)
		{
			mr.add(s);
			mr.add(ch+s);
		}
		return mr;
	}
	

}
