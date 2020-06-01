package snackBar;

public class Main {


	private static void workWithData() {


		Customer jane = new Customer("Jane", 45.25);
		Customer bob = new Customer("Bob", 33.14);

		VendingMachine food = new VendingMachine("Food");
		VendingMachine drink = new VendingMachine("Drink");
		VendingMachine office = new VendingMachine("Office");

		//String name, int quantity, double cost, int vendingMachineId

		Snack chips = new Snack("Chips", 36, 1.75, food.getId());
		Snack chocolateBars = new Snack("Chocolate Bar", 36, 1.00, food.getId());
		Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());

		Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
		Snack water = new Snack("Water", 20, 2.75, drink.getId());


		soda.buySnack(3);
		jane.buySnacks(soda.getTotalCost(3.0));

		System.out.println();
		System.out.println("Customer " + jane.getId() + " cash on hand " + "$" + jane.getCashOnHand());
		System.out.println("Quantity of snack " + soda.getId() + " is " + soda.getQuantity());
		System.out.println();

		pretzel.buySnack(1);
		jane.buySnacks(pretzel.getTotalCost(1.0));

		System.out.println("Customer " + jane.getId() + " cash on hand " + "$" + jane.getCashOnHand());
		System.out.println("Quantity of snack " + pretzel.getId() + " is " + pretzel.getQuantity());
		System.out.println();

		soda.buySnack(2);
		bob.buySnacks(soda.getTotalCost(2.0));

		System.out.println("Customer " + bob.getId() + " cash on hand " + "$" + bob.getCashOnHand());
		System.out.println("Quantity of snack " + soda.getId() + " is " + soda.getQuantity());
		System.out.println();

		jane.addCash(10.0);
		System.out.println("Customer " + jane.getId() + " cash on hand " + "$" + jane.getCashOnHand());
		System.out.println();

		chocolateBars.buySnack(1);
		jane.buySnacks(chocolateBars.getTotalCost(1.0));

		System.out.println("Customer " + jane.getId() + " cash on hand " + "$" + jane.getCashOnHand());
		System.out.println("Quantity of snack " + chocolateBars.getId() + " is " + chocolateBars.getQuantity());
		System.out.println();

		pretzel.addQuantity(12);
		System.out.println("Quantity of snack " + pretzel.getId() + " is " + pretzel.getQuantity());
		System.out.println();

		pretzel.buySnack(3);
		bob.buySnacks(pretzel.getTotalCost(3.0));

		System.out.println("Customer " + bob.getId() + " cash on hand " + "$" + bob.getCashOnHand());
		System.out.println("Quantity of snack " + pretzel.getId() + " is " + pretzel.getQuantity());
		System.out.println();

		System.out.println("Snack: " + chips.getName());
		if(chips.getVendingMachineId() == 1) {

			System.out.println("Vending Machine: " + food.getName());

		}

		if(chips.getVendingMachineId() == 2) {

			System.out.println("Vending Machine: " + drink.getName());

		}

		System.out.println("Quantity: " + chips.getQuantity());
		double total = Math.round(((double)chips.getQuantity()) * chips.getCost() * 100) / 100.0;
		System.out.println("Total Cost: " + "$" + String.format("%.2f", total));
		System.out.println();


		System.out.println("Snack: " + chocolateBars.getName());
		if(chocolateBars.getVendingMachineId() == 1) {

			System.out.println("Vending Machine: " + food.getName());

		}

		if(chocolateBars.getVendingMachineId() == 2) {

			System.out.println("Vending Machine: " + drink.getName());

		}
		System.out.println("Quantity: " + chocolateBars.getQuantity());
		total = Math.round(((double)chocolateBars.getQuantity()) * chocolateBars.getCost() * 100) / 100.0;
		System.out.println("Total Cost: " + "$" + String.format("%.2f", total));
		System.out.println();


		System.out.println("Snack: " + pretzel.getName());
		if(pretzel.getVendingMachineId() == 1) {

			System.out.println("Vending Machine: " + food.getName());

		}

		if(pretzel.getVendingMachineId() == 2) {

			System.out.println("Vending Machine: " + drink.getName());

		}
		System.out.println("Quantity: " + pretzel.getQuantity());
		total = Math.round(((double)pretzel.getQuantity()) * pretzel.getCost() * 100) / 100.0;
		System.out.println("Total Cost: " + "$" + String.format("%.2f", total));
		System.out.println();


		System.out.println("Snack: " + soda.getName());
		if(soda.getVendingMachineId() == 1) {

			System.out.println("Vending Machine: " + food.getName());

		}

		if(soda.getVendingMachineId() == 2) {

			System.out.println("Vending Machine: " + drink.getName());

		}
		System.out.println("Quantity: " + soda.getQuantity());
		total = Math.round(soda.getQuantity() * soda.getCost() * 100) / 100.0;
		System.out.println("Total Cost: " + "$" + String.format("%.2f", total));
		System.out.println();


		System.out.println("Snack: " + water.getName());
		if(water.getVendingMachineId() == 1) {

			System.out.println("Vending Machine: " + food.getName());

		}

		if(water.getVendingMachineId() == 2) {

			System.out.println("Vending Machine: " + drink.getName());

		}
		System.out.println("Quantity: " + water.getQuantity());
		total = Math.round(((double)water.getQuantity()) * water.getCost() * 100) / 100.0;
		System.out.println("Total Cost: " + "$" + String.format("%.2f", total));
		System.out.println();

		

	}

	public static void main(String[] args) {

		workWithData();

	}


}