package project;
import java.lang.*;

public interface OnlinePayment {
	public void setAmount(double amount);
	public double getAmount();
	public void setPinNumber(String pinNum);
	public String getPinNumber();
	
	
}
