package p1;

import java.util.List;

public class Bag 
{
	private Subscriptions[] array;
	private int nElems;
	
	public Bag(int maxSize) 
	{
		array = new Subscriptions[maxSize];
		nElems = 0;
	}
	
	public Subscriptions[] getArray() 
	{
		return array;
	}
	
	public int getNElems() 
	{
		return nElems;
	}
	
	public void insert(Subscriptions s)
	{
		array[nElems++] = s;
	}
	
	public void display() 
	{
		for(int i = 0; i < nElems; i++)
		{
			System.out.println(array[i]);
		}
		System.out.println();
	}
	
	public Subscriptions findByName(String name)
	{
		for(int i  = 0; i < nElems; i++)
		{
			if(array[i].getSubs().equals(name))
			{
				return array[i];
			}
		}
		return null;
	}
	
	public Subscriptions removeByName(String name) 
	{
		int count = 0;
		for(count = 0; count < nElems; count++) 
		{
			if(array[count].getSubs().equals(name))
			{
				break;
			}
		}
		if(count == nElems)
		{
			return null;
		} else
		{
			Subscriptions temp = array[count];
			for(int i = count; i< nElems - 1; i++)
			{
				array[i] = array[i+1];
			}
			nElems--;
			return temp;
		}
		
	}
	
}
