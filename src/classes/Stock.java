package classes;

public class Stock {

	private Product[] ps;
	private int size;
	
	public Stock() {
		size=0;
		ps=new Product[100];
	}
	
	public void add(Product p) {
		ps[size]=p;
		size++;
	}
	
	public float getvalue() {
		float values=0;
		if(size<=0)
			values=0;
		else {
			for(int i=0;i<size;i++)
			{
				values+=ps[i].getPrice()*ps[i].getCounts();
			}
		}
		return values;
	}
	
	
	public static void main(String[] args) {
		Stock s=new Stock();
		Product p1=new Product(1,16,20);
		Product p2=new Product(2,16,20);
		Product p3=new Product(3,16,20);
		s.add(p1);
		s.add(p2);
		s.add(p3);
		System.out.println("总价值为："+s.getvalue());
	}

}

class Product{
	private int id;
	private float price;
	private int counts;
	
	public Product(int id,float price,int counts)
	{
		this.id=id;
		this.price=price;
		this.counts=counts;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getCounts() {
		return counts;
	}
	public void setCounts(int counts) {
		this.counts = counts;
	}
	
	
}
