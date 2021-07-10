package project;


public class Cash extends Payment implements OfflinePayment {
	private int amount;
	public Cash(int amount)
	{
		super("Cash");
		this.amount = amount;
	}
	
	//set and get methods to access the value of a private variable
	//setAmount method from interface
	public void setAmount(int amount)
	{
		this.amount = amount;
	}
	
	//getAmount method from interface
	public int getAmount()
	{
		return amount;
	}
	
	//method from abstract class
	public void paid()
	{
		System.out.println("********Thanks*******\n Your payment is done and the amount is "+amount);
	}
	
}