package project;

import java.util.Scanner;
public class MembershipCustomer {
	Scanner s=new Scanner(System.in);
	
	private String card;
	public void setCard(String card) {this.card = card;}

	public String getCard() {return card;}
	
	public void cardInfo() {
		
		
		System.out.print("You have any membership card? ");
		String card=s.nextLine();
		
			if(card.equalsIgnoreCase("yes")) {
				System.out.println("\t *****Congratulation you got 10% discount***** \t\n \t\t Stay safe");
				}
			else if (card.equalsIgnoreCase("no"))
			{
				System.out.println("\t **** Welcome****** \t \n \t Come again \n \t\t Stay safe");
			}
			else
			{
				System.out.println ("Only yes or no allow \n Please try again ");
			}
			
		}

}