package springdog;

public class Food {
	private String type;
	private int quantity;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Food [type=" + type + ", quantity=" + quantity + "]";
	}
	

}
