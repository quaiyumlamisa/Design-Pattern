package strategy_Pattern;

public class Shopping_cart 
{
	
	public void show_items()
	{
		System.out.println("list of items");
		
	}

	public void add_items()
	{
		
		System.out.println("add items");
	}
	
	public void pay(I_Payment_method p)
	{
		p.how_to_pay();
		
	}
}
