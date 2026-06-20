//Encapsulation
class BankAccount{
	//private(access modifier) data members(data hiding)
	private int accNo;
	private double balance;
	public int getAccNo(){//public getter for account Number
		return accNo;
	}
	public void setAccNo(int accNo){//public setter for account number
		this.accNo=accNo;
	}
	public double getBalance(){//public getter for balance
		return balance;
	}
	public void setBalance(double balance){//public setter for balance
		if(balance>=0){
			this.balance=balance;
		}else{
			System.out.println("Balance cannot be negative!");
		}
	}
}
public class Main{
	public static void main(String[] args){
		BankAccount acc=new BankAccount();
		acc.setAccNo(12345);
		acc.setBalance(5000.75);
		System.out.println("Account Number: "+acc.getAccNo());
		System.out.println("Account Balance: "+acc.getBalance());
	}
}