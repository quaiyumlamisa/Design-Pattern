package strategy_Pattern;

public class Client 
{
	public static void main(String[]args)
	{
   Shopping_cart sc=new  Shopping_cart();
   sc.pay(new Bkash());
	}
}
