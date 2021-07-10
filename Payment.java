package project;

//Create an abstract class called Payment
public abstract class Payment{
	
//Private instance variable
private String paymentType;

//Parameterized Constructor
public Payment(String paymentType)
{
this.paymentType=paymentType;
}

public void type()
{
   System.out.println("Payment type is - "+paymentType);
}

}
