package collection3;

public class Shirt {
	private int size;
	private String brand;
	private String color;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Shirt(int size, String brand, String color) {
		super();
		this.size = size;
		this.brand = brand;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Shirt [size=" + size + ", brand=" + brand + ", color=" + color + "]";
	}
	
	

}
