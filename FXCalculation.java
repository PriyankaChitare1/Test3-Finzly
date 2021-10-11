package task_4Finzly;

public class FXCalculation {
	// 1 USD = 73.65 Rupees;
	static double USD = 73.65; 

	public static double Converter(long RupeesAmount) {

		return (RupeesAmount * 100 / 7365);
	}

	public static void main(String[] args) {

		long RupeesAmount = 1000000;
		double USD_Amount = Converter(RupeesAmount);
		double Profit = 50;
		double Total_Amount = USD_Amount + Profit;
		/*
		 * Markup % = (selling price – cost) / cost x 100
		 * 
		 */
		double Exchange_Rate = ((Total_Amount - USD_Amount) / USD_Amount * 100);

		// System.out.println("USD_Amount ==> $" + String.format("%.2f",USD_Amount) );
		System.out.println("Amount in Rs ===> " + " Rs " + RupeesAmount);
		System.out.println("Exchange Rate ===>  " + String.format("%.2f", Exchange_Rate));
		System.out.println("Profit in $ ==> " + "$ " + Profit);
		System.out.println("Amount to be paid by customer ($) ==> " + "$ " + String.format("%.2f", Total_Amount));

	}

}
