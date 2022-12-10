package com.tns.interfacee;

interface Amazoncompany
{
	abstract void items();
	abstract void orderonline();
	abstract void delivery();
}
class Shop1 implements Amazoncompany
{
	public void items()
	{
		System.out.println("hoodies");
		System.out.println("sweaters");
		System.out.println("tshirts");
	}
	public void orderonline()
	{
		System.out.println("recieve by amazon");
		System.out.println("issue the order by amazon seller");
		System.out.println("amazon seller will see the stock and confirm it");
	}
	public void delivery()
	{
		System.out.println("handover the item by amazon seller to delivery boy");
	}
}
	
class Shop2 implements Amazoncompany
	{
		public void items()
		{
			System.out.println("shoes");
			System.out.println("jeans");
			System.out.println("shirts");
		}
		public void orderonline()
		{
			System.out.println("recieve by amazon");
			System.out.println("issue the order by amazon seller");
			System.out.println("amazon seller will see the stock and confirm it");
		}
		public void delivery()
		{
			System.out.println("handover the item by amazon seller to delivery boy");
		}
	}

class Amazonapp
{
	Amazoncompany selectshop(char ch)
	{
		if(ch=='m')
		{
			return new Shop1();
		}
		else
		{
			return new Shop2();
		}
}
}
public class User {

	public static void main(String[] args) {
		
		Amazonapp ref=new Amazonapp();
		Amazoncompany ac=ref.selectshop('m');
		ac.items();
		ac.orderonline();
		ac.delivery();
	}
}
