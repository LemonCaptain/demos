package classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Moviesstore {

	private Movie[] movies;
	private int size;
	
	public Moviesstore() {
		size=0;
		movies=new Movie[100];
	}
	
	public void add(Movie m) {
		movies[size]=m;
		size++;
	}
	
	
	public static void main(String[] args) throws ParseException {
		Movie m1=new Movie(1,"泰坦尼克号");
		String user="007";
		m1.setOutid(user);
		Date now = new Date(); 
		m1.setOuttime(now);
		
		Moviesstore s=new Moviesstore();
		s.add(m1);
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("应归还日期："+m1.getdeadline());
		String backs="2018-01-24";
		String[] datedivide=backs.split("-");
		Calendar c=Calendar.getInstance();
		c.set(Integer.parseInt(datedivide[0].trim()),Integer.parseInt(datedivide[1].trim()),Integer.parseInt(datedivide[2].trim()));
		Date backday=c.getTime();
		System.out.println("实际归还日期："+format.format(backday));
		System.out.println("应付费用："+m1.getpay(backday));
	}
}

class Movie{
	private int id;
	private String name;
	private String outid;
	private Date outtime;
	private int usetime;
	private int daymoney;  //逾期每天应交费用
	
	public Movie(int id,String name) {
		this.id=id;
		this.name=name;
		this.usetime=7;
		this.daymoney=2;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOutid() {
		return outid;
	}
	public void setOutid(String outid) {
		this.outid = outid;
	}

	public Date getOuttime() {
		return outtime;
	}

	public void setOuttime(Date outtime) {
		this.outtime = outtime;
	}

	public int getUsetime() {
		return usetime;
	}
	public void setUsetime(int usetime) {
		this.usetime = usetime;
	}
	public int getDaymoney() {
		return daymoney;
	}
	public void setDaymoney(int daymoney) {
		this.daymoney = daymoney;
	}
	
	public String getdeadline() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date=new Date();
		Calendar ca = Calendar.getInstance();
		ca.add(Calendar.DATE, usetime);
		date = ca.getTime();
		String enddate=format.format(date);
		return enddate;
	}
	
	public float getpay(Date date1) throws ParseException {
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(""+format.format(outtime));
		System.out.println(""+format.format(date1));
		int days=(int)((date1.getTime()-outtime.getTime())/(1000*3600*24));
		float pay=(days-7)*daymoney;
		return pay;
	}
}
