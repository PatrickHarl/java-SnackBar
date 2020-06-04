package snackBar;

public class Customer {


	private static int maxId = 0;

	private int id;
	private String name;
	private double cashOnHand;

	public Customer(String name, double cashOnHand) {

		maxId++;
		id = maxId;

		this.name = name;
		this.cashOnHand = cashOnHand;

	}

	public int getId() {

		return id;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public void addCash(double cash) {

		this.cashOnHand += cash;

	}

	public double getCashOnHand() {

		return cashOnHand;

	}

	public void buySnacks(double totalCost) {


		this.cashOnHand -= totalCost;


	}



}