package entities;

public class Product {
	private String name;
	private Double price;

	// CONSTRUTOR VAZIO
	public Product() {
	}

	// CONSTRUTOR COM ARGUMENTOS
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	// GETTERS E SETTERS

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public String priceTag() {
		return name + " $ " + String.format("%.2f", price);
	}

}
