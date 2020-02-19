
public final class Product {
	String name;
	String description;
	int price;
	int maxQuantity;
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public int getPrice() {
		return price;
	}
	public int getMaxQuantity() {
		return maxQuantity;
	}
	public Product(String name, String description, int price, int maxQuantity) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.maxQuantity = maxQuantity;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", description=" + description + ", price=" + price + ", maxQuantity="
				+ maxQuantity + "]";
	}
}
