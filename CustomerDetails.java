package project;
import java.util.Scanner;


public class CustomerDetails {
	Scanner s=new Scanner(System.in);
	
	//Instances Variable
	private static String name;
	private static String address;
	private static String number;
	private static String email;
	private static String nid;
	
	//Setter Function
	public void setName(String name) {this.name=name;}
	public void setAddress(String address) {this.address=address;}
	public void setNumber(String number) {this.number=number;}
	public void setEmail(String email) {this.email=email;}
	public void setNid(String nid) {this.nid=nid;}
	
	
	
	//Getter Functions
	public String getName() {return name;}
	public String getNid() {return nid;}
	public String getAddress() {return address;}
	public String getNumber() {return number;}
	public String getEmail() {return email;}
	
	
	

	
	void Display() {
		 System.out.println("Enter your Name:" );
		 String name=s.nextLine();
		 System.out.println("Enter your Address:" );
		 String address=s.nextLine();
		 System.out.println("Enter your email:" );
		 String email=s.nextLine();
		 System.out.println("Enter your phone number:");
		 String number=s.nextLine();
		 System.out.println("Enter your phone nid:");
		 String nid=s.nextLine();
		 FileCustomer frwd = new FileCustomer();
	}



}