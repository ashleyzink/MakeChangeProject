package makechange;

import java.util.Scanner;

public class MakeChange {
	
	static Scanner input = new Scanner(System.in);
	
	
	public static void main(String[] args) {
//		Hint: Mod operator
//		shoppingAllDay();
		double itemCostMain = shoppingAllDay();
//		costsTooMuch(itemCost);
		double amountOwedMain = costsTooMuch(itemCostMain);
		makeChange(amountOwedMain);
		
		input.close();
	}

//		User Story #1
//		The user is prompted asking for the price of the item.
		private static double shoppingAllDay() {
			System.out.println("Please enter the cost of your item: ");
//			Scanner getItemCost = new Scanner(System.in); //Scanner closing inside of method, causing error. Put Scanner into Class.
			double itemCost = input.nextDouble();
			System.out.println("Cash machine only. No Debit. You owe: $" + itemCost);
//			getItemCost.close();
			return itemCost; //1.33454
			
		}
		
//		User Story #2
//		The user is then prompted asking how much money was tendered by the customer.
		private static double costsTooMuch(double itemCost) {
			System.out.println("Please enter how much money was inserted: ");
//			Scanner getAmountTendered = new Scanner(System.in); //Same issue as in shoppingAllDay() 
			double amountTendered = input.nextDouble();
			double amountOwed = amountTendered - itemCost;
//			System.out.println(amountOwed + " : " + amountTendered + " : " + itemCost);
//			getAmountTendered.close();
			return amountOwed;
		}

			
//		User Story #3
//		Display an appropriate message if the customer provided too little money or the exact amount.
//		User Story #4
//		If the amount tendered is more than the cost of the item, 
//		display the number of bills and coins that should be given to the customer.
			private static void makeChange(double amountOwed) {
				int tens, fives, ones, quarters, dimes, nickles, pennies;
				if (amountOwed < 0) {
					System.out.println("You're not quite there, please deposit more money.");
				}
				else if (amountOwed == 0) {
					System.out.println("Thank you for the exact amount during COVID-19. You're helping with the coin shortage.");
				}
				else {
					System.out.printf("Thank you! Your change will be: $ %.2f\n", amountOwed);
					tens = (int) (amountOwed / 10);
					if (tens == 1) {
						System.out.print(tens + " ten dollar bill, ");
					} 
					amountOwed %= 10; 
					fives = (int) (amountOwed / 5);
					if (fives == 1) {
						System.out.print(fives + " five dollar bill, ");
					}
					amountOwed %= 5;
					ones = (int) amountOwed;
					if (ones == 1) {
						System.out.print(ones + " one dollar bill, ");
					} else if (ones > 1) {
						System.out.print(ones + " one dollar bills, ");
					}
					amountOwed %= 1;
					amountOwed *= 100 + .05;  //Converted from dollars to cents. 
					quarters = (int) (amountOwed / 25);
					if (quarters == 1) {
						System.out.print(quarters + " quarter, ");
					} else if (quarters > 1) {
						System.out.print(quarters + " quarters, ");
					}
					amountOwed %= 25;
					dimes = (int) (amountOwed / 10);
					if (dimes == 1) {
						System.out.print(dimes + " dime, ");
					} else if (dimes > 1) {
						System.out.print(dimes + " dimes, ");
					}
					amountOwed %= 10;
					nickles = (int) (amountOwed / 5);
					if (nickles == 1) {
						System.out.print(nickles + " nickle, ");
					} else if (nickles > 1) {
						System.out.print(nickles + " nickles, ");
					}
					amountOwed %= 5; 
					pennies = (int) (amountOwed);
					if (pennies == 1) {
						System.out.print(pennies + " penny, ");
					} else if (pennies > 1) {
						System.out.print(pennies + " pennies, ");
					}
					System.out.println("Thank you. Have a great day!");
				}
				
			}

}
