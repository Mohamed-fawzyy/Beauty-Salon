package beautysalon;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException 
	{
		Scanner input = new Scanner(System.in);
	
	/////////////////////////////////////////////////////////////////////////////////////////
											/* MENU PART */
		
		Booking b = new Booking();
		b.menu();
		
	////////////////////////////////////////////////////////////////////////////////////////
											/* CLIENT PART */	
		
		/*Client c = new Client();
		
		System.out.print("\n enter ur number plz--> ");
		String mob = input.nextLine();
		
		c.isCLient(mob);
		System.out.print("\n" + c.Check()); // to print the true or false*/
		
	///////////////////////////////////////////////////////////////////////////////////////
											/* GUEST PART */
		
		String n = input.nextLine();
		String m = input.next();
		b.guestData(n, m);
		
		
		System.out.print("\n Choose ur Service--> ");
		
		int c1 = input.nextInt();  // c:choice
		b.numbers(c1);
		System.out.println("\nTotal price: " + b.totalPrice());
		
//		Booking b1 = new Booking();								the object carry the data
//		System.out.println("\nTotal price: " + b1.totalPrice());
		
		try
		{
			File file = new File("Guest.txt");
			FileWriter print = new FileWriter(file,true);
			
			for (int i = 0; i < b.getAccount().size(); i++) // to get all the data in the array which always =1
			{
				print.write("\n\n" + (b.getAccount()).get(i).getName());
				print.write("\t\t" /*mobile*/ + (b.getAccount()).get(i).getMobile());
				print.write("\t\t" /*date*/ + (b.getAccount()).get(i).getDate());
				print.write("\t\t"+b.totalPrice());
				
			}
			print.close();
		} 
		catch (IOException ex)
		{
			System.out.println(" ERROR ! " + ex);
		}
		 
	////////////////////////////////////////////////////////////////////	
		
		input.close();
	}

}
