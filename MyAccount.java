package class_constructor;


	  class BankAccount {
		   private String accountHolderName;
		   private String bankName;
		   private double accountBalance;

		   //create a parameterized constructor 
		public  BankAccount(String accountHolderName,String bankName,double accountBalance) {
			   this.accountHolderName=accountHolderName;
			   this.bankName=bankName;
			   this.accountBalance=accountBalance;
		   }
		
		   //declare  the methods 
		    double getBalance() {
			   return this.accountBalance;
		   }
		   
		    void deposite(double amount) {
			   this.accountBalance=accountBalance+amount;
			   System.out.println("Account balance: " + accountBalance);
		   }
		   
		    void withdraw(double amount) {
			   this.accountBalance=accountBalance-amount;
			   System.out.println("Withdwaw amount: " +amount);
			   
		   }
		   
		    // create a display method
		   public void amountDisplay() {
			   System.out.println("Account holderName: " + accountHolderName);
			   System.out.println("Bank name: " + bankName);
			   System.out.println("Account balance: " + accountBalance);
		   }
		}
         
	     //create a class named as myAccount
		 public class MyAccount{
			 
			public static void main(String[]args) {
				//create object named as BankAccount
				BankAccount acc1 = new BankAccount("Akhil kumar","ICCI",1200.0);
				BankAccount acc2 = new BankAccount("Dibya pradhan","HDFC",700.0);
				BankAccount acc3 = new BankAccount("Debabrat swain","SBI",500.0);
				
				acc1.amountDisplay();
				acc1.deposite(400);
				acc1.amountDisplay();
				acc1.withdraw(200);
				acc1.amountDisplay();
			}
		}
		 
		 
//---------------- OUTPUT---------------------
//Account holderName: Akhil kumar
//Bank name: ICCI
//Account balance: 1200.0
//Account balance: 1600.0
//Account holderName: Akhil kumar
//Bank name: ICCI
//Account balance: 1600.0
//Withdwaw amount: 200.0
//Account holderName: Akhil kumar
//Bank name: ICCI
//Account balance: 1400.0

