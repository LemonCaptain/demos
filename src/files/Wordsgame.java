package files;

import java.util.Scanner;

public class Wordsgame {

	public static String game(String str) {
		char[] chararray=str.toCharArray();
		String temp="aeiou";
		char tr=' ';
		StringBuffer result=new StringBuffer();
		int i=0;
		for(i=0;i<chararray.length;i++)
		{
			if(temp.indexOf(chararray[i])==-1) {
				tr=chararray[i];
				break;
			}
			result.append(String.valueOf(chararray[i]));	
		}
		for(i=i+1;i<chararray.length;i++)
			result.append(String.valueOf(chararray[i]));
		result.append("-"+String.valueOf(tr)+"ay");
		return result.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("输入一个单词：");
		Scanner sc=new Scanner(System.in);
		String words=sc.nextLine();
		System.out.println("转换后:"+game(words));
	}

}
