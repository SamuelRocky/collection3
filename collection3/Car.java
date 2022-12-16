package collection3;

public class Car {
	private String brand;
	private int price;
	private String color;
	private boolean isPetrol;
	private boolean isTubeless;
	private int cc;
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
	public boolean isPetrol() {
		return isPetrol;
	}
	public void setPetrol(boolean isPetrol) {
		this.isPetrol = isPetrol;
	}
	public boolean isTubeless() {
		return isTubeless;
	}
	public void setTubeless(boolean isTubeless) {
		this.isTubeless = isTubeless;
	}
	
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public Car(String brand, int price, String color, boolean isPetrol, boolean isTubeless, int cc) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.isPetrol = isPetrol;
		this.isTubeless = isTubeless;
		this.cc = cc;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", color=" + color + ", isPetrol=" + isPetrol
				+ ", isTubeless=" + isTubeless + ", cc=" + cc + "]";
	}
	
	

}
