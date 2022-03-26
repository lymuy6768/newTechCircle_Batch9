package day31_encapsulation;

public class Item {
	/*
	create a class called Item
				instance variables:
					name, unitPrice, quantity
				add a constructor that can initialize the fields
				instance methods:
					calcCost(): returns the total cost as double
					
								hint: totalCost = quantity * unitPrice
					toString(): returns the name, unit price, 
					             quantity and total cost info as calculated by calcCost()
	 */
	
	private String name;
	private double unitPrice;
	private int quantity;
	
	public Item(String name, double unitPrice, int quantity) {
		
		this.name = name;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double calculateTotalCost() {
		double totalCost=0;
		return totalCost=quantity*unitPrice;
	}
	public String toString() {
		return "the name: "+name +", unit price: "
				+ unitPrice+ ",quantity: "+ quantity
				+",total cost: "+ calculateTotalCost();

	}
	public static void main(String[] args) {
		Item it= new Item("book",10,20);
		System.out.println(it.calculateTotalCost());
		System.out.println(it.toString());
	}
}