package files;

import java.util.Scanner;

public class invert {

	//递归实现
	public static void reserve(String str) {
		if(str.length()==1)
		{
			System.out.print(str);
		}
		else {
			String substring1=str.substring(0, str.length()-1);
			String substring2=str.substring(str.length()-1);
			System.out.print(substring2);
			reserve(substring1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp=null;
		System.out.println("输入一个字符串:");
		Scanner sc=new Scanner(System.in);
		temp=sc.nextLine();
		
		
//		字符数组实现
//		char [] chararray=temp.toCharArray();
//		System.out.println("逆转输出：");
//		for(int i=chararray.length-1;i>=0;i--)
//		{
//			System.out.print(chararray[i]);
//		}
		
//		stringbuffer实现
//		StringBuffer str=new StringBuffer(temp);
//		System.out.println("逆序输出:"+str.reverse());
		
		System.out.println("逆转输出：");
		reserve(temp);
	}

}
