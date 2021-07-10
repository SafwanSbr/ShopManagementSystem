package project;

public class AccountRevenue extends Account{
	
	private static double totalRevenue=0;
	private double revenue;
	
	public void setRevenue(double revenue) {this.revenue=revenue; totalRevenue+=revenue;update(revenue);}

	//override abstract methods
	public void update(double a) {
		super.setRevenue(a);
		super.calculateIncome();
	}
	public void showDetails() {
		System.out.print("\n\n\n");
		System.out.print("*************Expenses Details***************");
		System.out.print("\n\t\t TOTAL REVENUE: " +(super.getTotalRevenue()));
	}
}