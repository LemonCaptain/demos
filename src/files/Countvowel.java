package files;

import java.util.Scanner;

public class Countvowel {

	public static void count(String str) {
		char[] chararray=str.toCharArray();
		int counta=0,counte=0,counti=0,counto=0,countu=0;
		for(int i=0;i<chararray.length;i++) {
			switch(chararray[i]) {
				case 'a':
					counta++;
					break;
				case 'e':
					counte++;
					break;
				case 'i':
					counti++;
					break;
				case 'o':
					counto++;
					break;
				case 'u':
					countu++;
					break;
				default:
					break;
			}
				
		}
		System.out.println("counta:"+counta);
		System.out.println("counte:"+counte);
		System.out.println("counti:"+counti);
		System.out.println("counto:"+counto);
		System.out.println("countu:"+countu);
	}
	
	public static void main(String[] args) {
		System.out.println("输入一个字符串:");
		Scanner sc=new Scanner(System.in);
		String tr=sc.nextLine();
		count(tr);
	}

}
