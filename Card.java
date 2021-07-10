package project;

public class Card extends Payment implements OnlinePayment{
	private double amount;
	private String pinNum;
	private String cardName;
	public Card(double amount, String pinNum,String cardName)
	{
		super("Card");
		this.amount = amount;
		this.pinNum = pinNum;
		this.cardName = cardName;
	}
	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	
	public double getAmount()
	{
		return amount;
	}
	
	public void setPinNumber(String pinNumber)
	{
		this.pinNum = pinNum;
	}
	public String getPinNumber()
	{
		return pinNum;
	}
	public void cardName(String cardName)
	{
		this.cardName = cardName;
	}
	public String getcardName()
	{
		return cardName;
	}
	
	//method from abstract class
	public void paid()
	{
		System.out.println("********Thanks*******\n Your payment is done and the amount is "+amount );
	}
}