package project;

public abstract class Account {
	
	
	//Static Variable
	private static double investment = 0;
	private static double totalExpenses = 0;
	private static double totalRevenue = 0;
	private static double totalIncome = 0;
	
	//Instances Variable
	private double expenses;
	private double revenue;
	
	//Setter Function
	public void setInvestment(double investment) {this.investment = investment; }
	public void setExpenses(double expenses) {this.expenses = expenses; totalExpenses += expenses; }                //decrease income
	public void setRevenue(double revenue) {this.revenue = revenue; totalRevenue +=revenue;}
    public void calculateIncome() {totalIncome=totalRevenue-totalExpenses;}
    
	//Getter Functions
    public final double getInvestment() {return investment;} 
	public final double getTotalIncome() {return totalIncome;}
	public final double getTotalExpenses() {return totalExpenses;}
	public final double getTotalRevenue() {return totalRevenue;}
	
	//abstract method
	public abstract void update(double a);
	
	//Showing Details
	public abstract void showDetails();
	
}
