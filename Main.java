package conversioncurrency;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
static ArrayList<CurreencyConversion> array = new ArrayList<>();
static double Rate = 74.73;

public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	CurreencyConversion cc = new CurreencyConversion();
	while(true) {
		System.out.println("Book Trade -1 ");
		System.out.println("Print Trade -2 ");
		System.out.println("Exit -3 ");
		
		int choice = scan.nextInt();
		switch(choice) {
		
		case 1:
			System.out.println("Enter your Name");
			cc.Name =scan.next();
			System.out.println("Enter Currency Pair");
			cc.Currency_Pair = scan.next();
			if(!cc.Currency_Pair.equals("USDINR")){
				System.out.println("InValid....!");
			}
			else{
				System.out.println("Enter Amount to Transfer");
				cc.Amount = scan.nextDouble();
				System.out.println("Do you want to get Rate  (Yes/NO)");
				String Y = "Yes";
				if(Y.equals("Yes")) {
					cc.ConvertedAmount = (cc.Amount * Rate);
					System.out.println("you are Trasferring INR" + cc.ConvertedAmount + "to "  + cc.Name);
				}
				else {
					System.out.println(cc.Amount);
				}
				System.out.println("Book / Cancle this trade ?");
				String book = scan.next();
				if(book.equals("Book"))
				{
					array.add(cc);
					System.out.println("Trade for " +  cc.Currency_Pair + "has been booked with rate " + Rate +
							"the Amount of Rs" + cc.ConvertedAmount + "will be transferred in 2 Working days to "+ cc.Name);
				}else {
					System.out.println(" Trade is Cancled");
				}
				
			}
			break;
			
			
		case 2:
			
			      System.out.println(" Trade_Number \t   Currency_Pair \t Name \t CustomerName  \t   Amount  \t Rate " );
		            for(int j=0;   j<array.size(); j++){
		            	CurreencyConversion cc1 = array.get(j);
		          System.out.println(j++ + "\t\t\r" + cc1.Currency_Pair + "\t\t\r" + cc1.Name + "\t\t\r" + cc1.ConvertedAmount + "\t\t\r" + Rate);
			       }
		          break;
		          
		          
		          
		case 3:
			    
			System.out.println(" Do you really want to Exit(Y /N)");
			char Y =scan.next().charAt(0);
			if(Y == 'Y')
			{
				System.out.println("Bye - Have a good day");
				break;
			}
			
			
			
			
		}
	}
  }
}
