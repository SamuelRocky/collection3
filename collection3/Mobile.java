package collection3;

public class Mobile {
	private String brand;
	private int price;
	private String color;
	private int imei;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getImei() {
		return imei;
	}
	public void setImei(int imei) {
		this.imei = imei;
	}
	public Mobile(String brand, int price, String color, int imei) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.imei = imei;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", price=" + price + ", color=" + color + ", imei=" + imei + "]";
	}
	
	

}
