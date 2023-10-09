
public class Product {
	
	private String name;
    
	private int price;
	private boolean soldOut;
	//constructor
	public Product() {
		
	}
	public Product(String name,int price) {
		this.name = name;
		this.price = price;
		
	}
	
	public Product(String name, int price, boolean soldOut) {
		this.name = name;
		this.price = price;
		this.soldOut = soldOut;
	}
	
	public void method1() {
    	
    }
	
	public void printDetails() {
		System.out.println("Product met naam " + name);
		System.out.println("  heeft prijs " + price);
	}
	
	public void stelPrijsIn(int price) {
		this.price = price;
	}
	
	public String watIsDeNaam() {
		return name;
	}
	
	public int watIsDePrijs() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		if (price > 0 && price < 1000000) {
			this.price = price;
		}
	}
}
