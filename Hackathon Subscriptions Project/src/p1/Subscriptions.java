package p1;

public class Subscriptions 
{
	private String subs;
	private double prices;
	private String renewalDate;
      
	public Subscriptions(String subs, double prices, String renewalDate) 
	{
		super();
		this.subs = subs;
		this.prices = prices;
		this.renewalDate = renewalDate;
	}

	

	public String getSubs() 
	{
		return subs;
	}



	public void setSubs(String subs)
	{
		this.subs = subs;
	}



	public double getPrices() 
	{
		return prices * 12;
	}



	public void setPrices(double prices)
	{
		this.prices = prices;
	}



	public String getRenewalDate()
	{
		return renewalDate;
	}



	public void setRenewalDate(String renewalDate) 
	{
		this.renewalDate = renewalDate;
	}



	@Override
	public String toString()
	{
		return "Your subscription for " + subs + ", price = $" + prices + " Per Month. Renewal Date is " + renewalDate;
	}
	
}
