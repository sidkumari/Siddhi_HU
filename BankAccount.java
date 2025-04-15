package Assignments;

public class BankAccount {
	
	//declaring data members as  protected 
	protected String Account_number;
	protected String Acc_holders_name;
	protected double balance;
	
	//parameterized constructor to assign values to data members
	public BankAccount(String acc, String acc_holder, double b) {
		Account_number=acc;
		Acc_holders_name=acc_holder;
		balance=b;
	}
	
	//Method to deposit amount
	public void deposit(double amt) {
		if(amt>0) {  
			balance+=amt; //Adding deposited amount to current balance
			System.out.println("Amount Deposited: Rs"+amt);
		}
		
	}
	
	//Method to withdraw money
	public void withdraw(double amt) {
		if(amt>0 && amt<=balance) { // checking if the entered amount to withdraw is in account or not
			balance-=amt;
			System.out.println("Amount withdrawn: Rs"+amt);
		}
		else
			System.out.println("Insufficient balance");
	}
	
	//Method to check bank balance
	public void checkbalance() {
		System.out.println("Current Balance Rs"+balance);
	}
	
	//main Method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Savings s=new Savings("60000","Siddhi",10000.0,5.0);
		s.checkbalance();
		s.deposit(10000);
		s.withdraw(700.0);
		s.InterestAmount();
		s.checkbalance();

	}


}

//creating  a Savings class which inherits bankAcount class(child class/subclass/ derived class)
class Savings extends BankAccount{
	private double rateOfInterest;
	public Savings(String acc, String acc_holder, double b, double rateOfInterest) {
		super(acc, acc_holder,  b);
		this.rateOfInterest=rateOfInterest;
	}
	public void InterestAmount() {
		double interest=balance*(rateOfInterest/100);
		balance+=interest;
		System.out.println("Interest amount= Rs"+ interest);
//		System.out.println("Balance after Interest amount= Rs"+ balance);
		
	}
	
}

