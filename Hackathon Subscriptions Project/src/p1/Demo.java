package p1;

import java.text.DecimalFormat;

public class Demo 
{

	public static void main(String[] args) 
	{
		Bag theBag = new Bag(100);
		Bag2 theBag2 = new Bag2(100);
		theBag.insert(new Subscriptions("Spotify", 9.99, "04/28/2019")); // 119.88
		theBag.insert(new Subscriptions("Symbolab", 2.49, "05/01/2019"));
		theBag.insert(new Subscriptions("Audible", 14.95, "05/09/19"));
		theBag.insert(new Subscriptions("Chegg", 16.24, "05/12/2019")); // 194.88
	//	theBag.insert(new Subscriptions("Aleks", 21.67, "05/13/2019"));
		theBag.insert(new Subscriptions("Netflix", 12.99, "05/15/2019")); // 155.88
		theBag2.insert(new Subscriptions2("Amazon Prime", 119.00, "08/04/2019"));
		theBag.display();
		theBag2.display();
		
		double total = 0;
		double total2 =0;
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		
		Subscriptions[] array = theBag.getArray();
		for(int i = 0; i < theBag.getNElems(); i++) {
			total += array[i].getPrices();
		}
		
		Subscriptions2[] array2 = theBag2.getArray();
		for(int i = 0; i < theBag2.getNElems(); i++) {
			total2 += array2[i].getPrices();
		}
		double totalNew = total + total2;
		System.out.println("You Spend $" + numberFormat.format(total/12) + " per month");
		System.out.println("You Spend $" + numberFormat.format(totalNew) + " per year");
		System.out.println("-------");
		

	}

}
