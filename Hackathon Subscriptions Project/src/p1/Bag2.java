package p1;

import java.util.List;

public class Bag2 
{
	private Subscriptions2[] array2;
	private int nElems;
	
	public Bag2(int maxSize) 
	{
		array2 = new Subscriptions2[maxSize];
		nElems = 0;
	}
	
	public Subscriptions2[] getArray() 
	{
		return array2;
	}
	
	public int getNElems() 
	{
		return nElems;
	}
	
	public void insert(Subscriptions2 s)
	{
		array2[nElems++] = s;
	}
	
	public void display() 
	{
		for(int i = 0; i < nElems; i++)
		{
			System.out.println(array2[i]);
		}
		System.out.println();
	}
	
	public Subscriptions2 findByName(String name)
	{
		for(int i  = 0; i < nElems; i++) 
		{
			if(array2[i].getSubs().equals(name))
			{
				return array2[i];
			}
		}
		return null;
	}
	
	public Subscriptions2 removeByName(String name) 
	{
		int count = 0;
		for(count = 0; count < nElems; count++)
		{
			if(array2[count].getSubs().equals(name))
			{
				break;
			}
		}
		if(count == nElems) 
		{
			return null;
		} else
		{
			Subscriptions2 temp = array2[count];
			for(int i = count; i< nElems - 1; i++)
			{
				array2[i] = array2[i+1];
			}
			nElems--;
			return temp;
		}
		
	}
	
}
