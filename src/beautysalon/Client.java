package beautysalon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Client extends Booking
{
	private boolean check;
	private String str;
	//private int discount;
	
	Scanner in = new Scanner(System.in);
	FileReader fr = null;
	
	public void isCLient(String searchNumber) throws IOException 
	{
		File file = new File("Guest.txt");
		
		try 
		{
			fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			while ( (str = br.readLine()) != null )
			{
				if ( str.contains(searchNumber))
				{
					System.out.println("\n" + str);
					check = true;
					
					//discount = sum - 300;
					
				}
//				else 
//					check = false;
			}
		} 
		
		catch (IOException e) 
		{
			System.out.println(" ERROR ! " + e);
		}
		
		finally 
		{
			fr.close();
		}
	}
	
	public boolean Check() 
	{
		
		return check;
	}
	
}

