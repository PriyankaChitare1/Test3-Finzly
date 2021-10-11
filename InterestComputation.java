package task_4Finzly;

public class InterestComputation {
	static double Simple_Interest;
	static double Compound_Interest;

	public static double Simple_Interest(double Principal, double Rate, double Time_Period) {
		return Simple_Interest = (Principal * Rate * Time_Period) / 100;
	}

	public static double Compound_Interest(double Rate, double Time_Period, double Simple_Interest) {
		return Compound_Interest = Simple_Interest * Math.pow(1.0 + Rate / 100.0, Time_Period) - Simple_Interest;
	}

	public static void main(String[] args) {
		double Principal = 32.00;
		double Rate = 7.75;
		double Time_Period = 30;

		System.out.println("Principal    :  " + "$ " + Principal);
		System.out.println("Rate of Interest    : " + Rate + " %");
		long millis = System.currentTimeMillis();
		java.sql.Date date = new java.sql.Date(millis);
		System.out.println("Today's Date   :  " + date);
		Simple_Interest = Simple_Interest(Principal, Rate, Time_Period);
		System.out.println("Amount at Maturity Later 30 Year:  " + String.format("%.4f", Simple_Interest));
		Compound_Interest = Compound_Interest(Rate, Time_Period, Simple_Interest);
		System.out.println(
				"Amount at Maturity (Compounding)  Later 30 year  :  " + String.format("%.4f", Compound_Interest));

	}

	/*
	 * Principal : $ 32.0 Rate of Interest : 7.75 % Today's Date : 2021-10-10 Amount
	 * at Maturity Later 30 Year: 74.4000 Amount at Maturity (Compounding) Later 30
	 * year : 623.9792
	 */
}
