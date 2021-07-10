package project;

import java.util.Scanner;

public class Main {
public static int checkInput(int limit) {
		
		Scanner input = new Scanner(System.in);
		
		boolean b=true;
		int check=0;
		
		while(true) {
			try {
				System.out.print("Enter your choice: ");
			    check = input.nextInt();
				if(check>0 && check<=limit) { b=false; return check; }
				else {
				    System.out.print("Invalid input! Please try again. "); 
				}
			}
			catch(Exception e) {
				System.out.print("Invalid input. Please try again. ");
				input.nextLine();
			}
		}
	}

public static double checkInput() {
	
	Scanner input = new Scanner(System.in);
	
	boolean b=true;
	double amount=0;
	
	while(true) {
		try {
			System.out.print("Enter your amount: ");
		    amount = input.nextDouble();
			if(amount>=0) { b=false; return amount; }
			else {
			    System.out.print("Invalid Amount! Amount can't be negative. Please try again. "); 
			}
		}
		catch(Exception e) {
			System.out.print("Invalid input. Please try again. ");
			input.nextLine();
		}
	}
}
     
     public static void main(String[] avg) {
    	 
         System.out.println("\t\t\t***********************************");
         System.out.println("\t\t\t--------WELCOME TO OUR SHOP--------");
         System.out.println("\t\t\t***********************************");
    	 boolean t = true;
         while(t) {
         System.out.println("\tChoose: ");
         System.out.println("\t1. Account");
         System.out.println("\t2. Customer");
         System.out.println("\t3. Payment");
         
         int choice = checkInput(3);
         switch (choice) {
         
         case 1:
        	 
        	 Scanner input = new Scanner(System.in);
   		  
   		  AccountExpenses exp = new AccountExpenses();
   		  AccountRevenue rev = new AccountRevenue();
   		  Account acc ;
   		  
   		  System.out.println("Hello Admin.\n What do you want to do?");
   		  System.out.println("1. Update Expenses");
   		  System.out.println("2. Show Details");
   		  
   		  choice = checkInput(2);
   		  
   		  System.out.println(choice);
   		  if(choice == 1) {
   			   
   			  System.out.println("\n\nWhat Do you Want to update?");
   			  System.out.println("1. Investment. (One Time)");
   			  System.out.println("2. Salary. ");
   			  System.out.println("3. Bills. ");
   			  System.out.println("4. Cost of Products");
   		      choice = checkInput(4);
   			  
   			  switch(choice) {
   			  case 1:
   				  double investment;
   				  System.out.print("Enter Investment (One Time): ");
   			      investment = checkInput();
   			      exp.setInvestment(investment);
   			  case 2:
   				
   				  double salary;
   				  salary = checkInput();
   				  exp.setSalary(salary);
   				  break;
   				  
   			  case 3:
   				  
   				  double bills;
   				  bills = checkInput();
   				  exp.setBills(bills);
   				  break;
   				  
   			  case 4:
   				  
   				  double costForProduct;
   				  costForProduct = checkInput();
   				  exp.setSalary(costForProduct);
   				  break;
   				  
   			  }
   		  }   		  
   		  else if(choice == 2) {
   			  System.out.println("Which details you want to see?");
   			  System.out.println("1. Expenses Details.");
   			  System.out.println("2. Revenue Details.");
   			  System.out.println("3. Account Details.");
   			  choice = checkInput(3);//Take choice from user.
   			  
   			  switch(choice) {
   			  case 1: exp.showDetails(); break;
   			  case 2: rev.showDetails(); break;
   			  case 3: exp.showAccountDetails(); break;
   			  default:         				    break;
   			  }
   		  }
   		  break;
         case 2:
        	//CustomeDetails test
 			
 			CustomerDetails cus= new CustomerDetails();
 					
 					System.out.println("            ==========================             ");   
 				       System.out.println("            ---Customer Information---         ");
 				       System.out.println("            ==========================             ");
 				       System.out.println();
 				       Scanner n2 = new Scanner(System.in);
 				       System.out.print("   Enter Your Nid : "); 
 				       String nid= n2.nextLine(); 
 				       System.out.print("   Enter Your Name : "); 
 				       String name= n2.nextLine(); 
 				       System.out.print("   Enter Your Phone Number : "); 
 				       String number= n2.nextLine(); 
 				       System.out.print("   Enter Your Address : "); 
 				       String address= n2.nextLine(); 
 				       System.out.print("   Enter Your Email : "); 
 				       String email= n2.nextLine(); 
 				       

 				       cus.setNid(nid); 
 				       cus.setName(name); 
 				       cus.setNumber(number);  
 				       cus.setAddress(address);
 				       cus.setEmail(email);
 				       
 				       FileCustomer fc = new FileCustomer();
 				       fc.writeInFile(name,nid,number,address,email);
 				       fc.readFromFile();
 				       
 				       
 				       //MemberShip test
 						 MembershipCustomer msc=new MembershipCustomer();
 								msc.cardInfo();	 
 				break;				
         case 3:
        	 
        	 Scanner input1 = new Scanner(System.in);
     		Scanner user = new Scanner(System.in);	
     		
     System.out.println("------------Payment Option--------");	
     System.out.println("");
     System.out.println("");
     System.out.println("------There are three types of payment option------");
     System.out.println("");
     System.out.println("     1.Card");
     System.out.println("     2.Cash");
     System.out.println("     3.MobileBanking");
     System.out.println("");
     System.out.println("   Select your payment option : ");
     int n = checkInput(3);
     switch(n)
     {
     case 1:
     	System.out.println("Enter your amount");
     	int am = input1.nextInt();
     	Cash cs = new Cash(am);
     	System.out.println(" Amount : "+cs.getAmount());
     	break;
     case 2:
     	System.out.println("Enter your Card Name : ");
     	String cn = user.nextLine();
     	System.out.println("Enter your Amount : ");
     	double am1 = checkInput();
     	System.out.println("Enter your Pin Number : ");
     	String pn = user.nextLine();
     	Card ca = new Card(am1,pn,cn);
     	System.out.println("Card Name : "+ca.getcardName());
     	System.out.println("Pin Number : "+ca.getPinNumber());
     	System.out.println("Amount : "+ca.getAmount());
     	break;
     case 3:
     	System.out.println("Enter your Phone Number : ");
     	String phoneNum = user.nextLine();
     	System.out.println("Enter your amount : ");
     	double am2 = checkInput();
     	System.out.println("Enter your Pin Number : ");
     	String pinNum = input1.nextLine();
     	MobileBanking mb = new MobileBanking(am2,pinNum,phoneNum);
     	System.out.println("Phone Number : "+mb.getPhoneNum());
     	System.out.println("Amount : "+mb.getAmount());
     	System.out.println("Pin Number : "+mb.getPinNumber());
     	break;
     	default:
     		System.out.println("******Sorry You take the wrong number******\n\n******Please select (1-3)*****");
     		break;
     }



         }
         }
    }

}
