package beautysalon;

import java.util.*;

public class Account  // (for guests only) compare it by the Transaction
{
	private String name;
	private String mobile;
	private Date date;
	
	

	public Account(String name, String mobile) 
	{
		//this();
		this.name = name;
		this.mobile = mobile;
		
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
