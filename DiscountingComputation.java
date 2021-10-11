package task_4Finzly;

public class DiscountingComputation {
	/* P = A / (1 + r/n) nt */

	static double Total_Amount = 1000000; // Amount in Rupees;
	static double Rate = 7.5; // % rate
	static double Present_Age = 25;// in year
	static double Total_Age = 60; // in year
	static double Updated_Age = Total_Age - Present_Age;
	static double Invested_Amount;

	public static double Invested_Amount(double Total_Amount, double Rate, double Updated_Age) {

		return Invested_Amount = Total_Amount / Math.pow((1.0 + Rate / 100), Updated_Age);
	}

	public static void main(String[] args) {

		System.out.println("Amount Needed in 60 Years is :==> $ " + Total_Amount);
		System.out.println("Rate of Interest  ===>  " + Rate + "%");

		long millis = System.currentTimeMillis();
		java.sql.Date date = new java.sql.Date(millis);
		System.out.println("Today's Date " + date);

		Invested_Amount = Invested_Amount(Total_Amount, Rate, Updated_Age);

		System.out.println(" Total Amount to be Invested from today means (25 year_old upto 60th year_old) ===>  $"
				+ String.format("%.4f", Invested_Amount));
		System.out.println("Amount to be Invested from today(25 year_old ) means Each year means Yearlly ===> $ "
				+ String.format("%.4f", Invested_Amount / 12));
		System.out.println("Amount to be Invested from today(25 year_old ) means Each 6 Months(Half Yearlly)  ===> $ "
				+ String.format("%.4f", Invested_Amount * 6 / 12));
		System.out.println("Amount to be Invested from today(25 year_old ) means Each 4 Months  ===> $ "
				+ String.format("%.4f", Invested_Amount * 4 / 12));
		System.out.println("Amount to be Invested from today(25 year_old ) means Each 3 Months  ===> $ "
				+ String.format("%.4f", Invested_Amount * 3 / 12));

	}

}
