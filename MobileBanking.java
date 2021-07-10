package project;

public class MobileBanking extends Payment implements OnlinePayment {
	private double amount;
	private String pinNum;
	private String phoneNum;
	public MobileBanking(double amount,String pinNum,String phoneNum)
	{
	super ("Mobile Banking");
	this.amount = amount;
	this.pinNum=pinNum;
	this.phoneNum = phoneNum;
	}
	
	
	public void setAmount(double amount){ this.amount = amount;}
	public double getAmount(){ return amount;}
	
	public void setPinNumber(String pinNum) { this.pinNum = pinNum;}
	public String getPinNumber(){ return  pinNum;}
	
	public void setPhoneNum(String phoneNum) { this.phoneNum = phoneNum;}
	public String getPhoneNum() { return phoneNum;}
	
	//method from abstract class
		public void paid()
		{
			System.out.println("********Thanks*******\n Your payment is done and the amount is "+amount );
		}
	}
