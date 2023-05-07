package part3;

public class Mobile {
	
        String brand;
        int price;
        
	public Mobile(String brand,int price)
	{
		this.brand=brand;
		this.price=price;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", price=" + price + "]";
	}
	

}
