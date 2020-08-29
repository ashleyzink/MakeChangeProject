package makechange;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		Hint: Mod operator
//		shoppingAllDay();
		double itemCost = shoppingAllDay();
		costsTooMuch(itemCost);
		
	}

//		User Story #1
//		The user is prompted asking for the price of the item.
		private static double shoppingAllDay() {
			System.out.println("Please enter the cost of your item: ");
			Scanner getItemCost = new Scanner(System.in);
			double itemCost = getItemCost.nextDouble();
			System.out.println("Cash machine only. No Debit. Please enter $" + itemCost);
			
			getItemCost.close();
			return itemCost;
			
		}
		
//		User Story #2
//		The user is then prompted asking how much money was tendered by the customer.
		private static double costsTooMuch(double itemCost) {
			//pass by values sucks and doesn't work
			System.out.println("Change first, then bills. Please enter how much money was inserted: ");
			Scanner getAmountTendered = new Scanner(System.in);
			double amountTendered = getAmountTendered.nextDouble();
			double amountOwed = amountTendered - itemCost;
			System.out.println("Thank you! Your change will be: $" + amountOwed);
			if (amountOwed > amountTendered) {
				System.out.println("You're not quite there, put in more money.");
			}
			if (amountOwed == amountTendered) {
				System.out.println("Thank you for put the exact amount!");
					
			}
			getAmountTendered.close();
			return amountOwed;
			
			

			
		}
		
//		User Story #3
//		Display an appropriate message if the customer provided too little money or the exact amount.
//
//		User Story #4
//		If the amount tendered is more than the cost of the item, 
//		display the number of bills and coins that should be given to the customer.
		

		// TODO Auto-generated method stub
		


}
