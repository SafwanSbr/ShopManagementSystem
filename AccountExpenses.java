package project;

public class AccountExpenses extends Account{
	
	private static double totalSalary;
	private static double totalBills;
	private static double totalCostForProduct;
    	
	private double salary;
	private double bills;
	private double costForProduct;
	
	public void setSalary(double salary) {
		   this.salary=salary;
		   totalSalary+=salary;
		   update(salary);
		}
	public void setBills(double bills)   {
		  this.bills=bills;
	      totalBills+=bills;
	      update(bills);
	    }
	public void setCostForProduct(double costForProduct) {
		  this.costForProduct=costForProduct;
		  totalCostForProduct+=costForProduct;
	      update(costForProduct);
	    }
	
	//Getter Methods
	public final double getSalary() {return salary;}
	public final double getBills() {return bills;}
	public final double getCostForProduct() {return costForProduct;}
	public final double getTotalSalary() {return totalSalary;}
	public final double getTotalBills() {return totalBills;}
	public final double getTotalCostForProduct() {return totalCostForProduct;}
	
	//Override
	public void update(double a) {super.setExpenses(a); super.calculateIncome();}
	
	public void showAccountDetails() {
		System.out.print("\n\t**************ACCOUNT DETAILS***************");
		System.out.print("\nTOTAL: ");
		System.out.print("\nIncome: " +super.getTotalIncome());
		System.out.print("\nExpenses: " +super.getTotalExpenses());
		System.out.print("\nRevenue: " +super.getTotalRevenue());
		System.out.print("\n\t\t CURRENT BALANCE: " +(super.getInvestment()+super.getTotalIncome()));
	}
	
	public void showDetails() {
		System.out.print("\n\n\n");
		System.out.print("*************Expenses Details***************");
		System.out.print("\nMonthly Total: ");
		System.out.print("\nSalary of Employees: " +getTotalSalary());
		System.out.print("\nBills: " +getTotalBills());
		System.out.print("\nCost to Buy Product: " +getTotalCostForProduct());
		System.out.print("\n\t\t TOTAL EXPENSES: " +(super.getTotalExpenses()));
	}
}
