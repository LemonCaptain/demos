package files;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Countword {

	public static Map<String,Integer> count(String str){
		Map<String,Integer> result=new HashMap<String, Integer>();
		String[] array= {".",","," ","?","!"};
		int i=0;
		for(;i<array.length;i++) {
			str=str.replace(array[i], ",");
		}
		String[] temp=str.split(",");
		for(i=0;i<temp.length;i++)
		{
			String key=temp[i].toLowerCase();
			if(!key.equals("")) {
				Integer num=result.get(key);
				if(num==null||num==0)   //不存在该单词
				{
					result.put(key, 1);
				}
				else {         //存在该单词
					result.put(key, num+1);
				}
			}
		}
		return result;
	}
	
	public static void showmap(Map<String,Integer> map) {
		Iterator<String> iter=map.keySet().iterator();
		while(iter.hasNext()) {
			String key=iter.next();
			System.out.println(key+"\t\t"+map.get(key)+"次.....");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("输入一个字符串:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Map<String,Integer> result=count(str);
		System.out.println();
		showmap(result);
	}

}
