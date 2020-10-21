package kpc;

import java.util.ArrayList;

public class kpc {

	public static void main(String[] args) {
		
	}
	public static ArrayList<String>getkpc(String str);
	{
	if(str.length()==0)
	{
		ArrayList<String>temp=new ArrayList<>();
		temp.add("");
		return temp;
	}
	char ch=str.charAt(0);
	String ros=str.substring(1);
	ArrayList<String>rr=getkpc(ros);
	ArrayList<String>mr=new ArrayList<String>();
	String mc=getchoice(ch);
	for(String s:rr)
	{
		for(int i=0;i<mac.length();i++)
		{
			mr.add(mc.charAt(i)+s);
		}
	}
	return mr;
	}

}
