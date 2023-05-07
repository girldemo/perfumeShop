package models;


public class Item {
	private int id;
	private Perfume product;
	private int quantity;
	private long price;
	private Order order;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Perfume getProduct() {
		return product;
	}

	public void setProduct(Perfume product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Item(int id) {
		super();
		this.id = id;
	}

	public Item(Perfume product, int quantity, long price, Order order) {
		super();
		this.product = product;
		this.quantity = quantity;
		this.price = price;
		this.order = order;
	}

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int id, Perfume product, int quantity, long price, Order order) {
		super();
		this.id = id;
		this.product = product;
		this.quantity = quantity;
		this.price = price;
		this.order = order;
	}
	
	
}
