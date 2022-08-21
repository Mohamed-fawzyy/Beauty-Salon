package beautysalon;

import java.util.*;

public class Booking extends Service   // compare it by Account
{
	private int Choise;
	private String defaultMsg;
	int sum=0;
	
	private ArrayList<Integer> service = new ArrayList<>();
	private ArrayList<Account> account = new ArrayList<>();
	
	Scanner in = new Scanner(System.in);

	public void guestData(String n, String m)
	{
		account.add( new Account(n,m) );
	}
	
	public int numbers( int c )  // c:choice
	{
		
		while ( c != 0)
		{
			switch (c) 
			{
				case 1: 
					
					service.add(getSpa());
					break;
				
				case 2:
					service.add(getMassage());	
					break;
					
				case 3:
					service.add(getMakeUp());
					break;
					
				case 4:
					service.add(getNailCare());
					break;
					
				case 5:
					service.add(getHairTreatment());
					break;
					
				case 6:
					service.add(getFacialTreatment());
					break;

				default:
				{
					defaultMsg = " invalid number u have to enter from 1 to 6 or Zero tp Quit";
					System.out.println(defaultMsg);
				}
			}
			c = in.nextInt();
		}
		
		return c;
	}
	
	
	public void menu() 
	{
		System.out.println("\t\t\t\t\t\tBEAUTY SALON\n");
		System.out.println( "\n1)Spa= " + Spa + "L.E\t\t\t\t2)massage= " + massage + "L.E\n3)makeUp= " 
				+ makeUp + "L.E\t\t\t4)nailCare= " + nailCare + "L.E\n5)hairTreatment= " + hairTreatment 
				+ "L.E\t\t\t6)facialTreatment= " + facialTreatment+"L.E");
	}

	public double totalPrice()
	{
		//double sum=0;
		
		 for ( int counter = 0; counter<service.size(); counter++ )
		 {
			 sum += service.get(counter);
		 }
		 
		 return sum;
	} 

	public int getChoise() {
		return Choise;
	}

	public void setChoise(int choise) {
		Choise = choise;
	}

	public ArrayList<Integer> getService() {
		return service;
	}
	
	public ArrayList<Account> getAccount() {
		return account;
	}

}
