package files;

import java.util.Scanner;

public class Plalindrome {

	public static boolean pladind(String str) {
		StringBuffer strbuf=new StringBuffer(str);
		if(strbuf.reverse().toString().equals(str))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		System.out.println("输入一个字符串");		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(pladind(str))
			System.out.println("是回文！");
		else
			System.out.println("不是回文!");
	}

}
