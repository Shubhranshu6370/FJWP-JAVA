package operator;

 public  class BankAccount {
	 
      private String accountHolderName;
      private int  accountNumber;
      private int  balance;
      
      //create a parameterized constructor
    public BankAccount(String accountHolderName,int accountNumber,int balance) {
    	
    	this.accountHolderName=accountHolderName;
    	this.accountNumber=accountNumber;
    	this.balance=balance;
    }
    
    //using getter & setter methods
    public String getAccountHolderName() {
    	return accountHolderName;
    }
    
    public void setAccountHolderName(String accountHolderName) {
    	this.accountHolderName=accountHolderName;
    }
    
    public int getAccountNumber() {
    	return accountNumber;
    }
    
    public void setAccountNumber(int accountNumber) {
    	this.accountNumber=accountNumber;
    }
    
    public int getBalance() {
    	return balance;
    }
    
    public void setBalance(int Balance) {
    	this.balance = balance;
    }
    
    //using deposit method to deposit amount
    public void deposit(int amount) {
    	
    	balance+=amount;
    	System.out.println("Deposit " + amount + " into bankAccount"); 
    	}
    
    //using withdraw method to withdraw amount
    public void withdraw(int amount) {
    	
    	balance-=amount;
    	System.out.println("Withdraw " + amount + " from bankAccount");
    }
    
    public static void main(String[] agrs) {
    	
    	  //create a bank account object
    	  BankAccount acc =new BankAccount("Shubhranshu sekhar sethi",968556577,45000);
    	  
    	  //deposit & withdraw amount
    	  acc.deposit(4000);
    	  acc.withdraw(2000);
    	  
    	  //To get balance
    	  int balance=acc.getBalance();
    	  
    	  //declare a variable 
    	  String status;
    	  
    	  //check status using ternary operator
    	   status=(balance>=5000)? "Minimum balance Maintained" : "Minimum balance not Maintained";
    	  
    	  System.out.println("Account Holder Name: " + acc.getAccountHolderName());
    	  System.out.println("Account Number: " + acc.getAccountNumber());
    	  System.out.println("Balance: " + acc.getBalance());
    	  System.out.println("Status: " + status);
      }
}
 
 
 //------------------OUTPUT---------------
//Deposit 4000 into bankAccount
//Withdraw 2000 from bankAccount
//Account Holder Name: Shubhranshu sekhar sethi
//Account Number: 968556577
//Balance: 47000
//Status: Minimum balance Maintained 

 
