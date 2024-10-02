package assignment5;

class Bank {

	protected static double interestRate;

	public double getBalance() {
		return 0;
	}

	public double applyInterest() {
		return getBalance();
	}
}

class BankA extends Bank {
	private double balance;

	public BankA(double balance) {
		this.balance = balance;
		interestRate = 0.05;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public double applyInterest() {
		return balance + (balance * interestRate);
	}
}

class BankB extends Bank {
	private double balance;

	public BankB(double balance) {
		this.balance = balance;
		interestRate = 0.03;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public double applyInterest() {
		return balance + (balance * interestRate);
	}
}

class BankC extends Bank {
	private double balance;

	public BankC(double balance) {
		this.balance = balance;
		interestRate = 0.04;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public double applyInterest() {
		return balance + (balance * interestRate);
	}
}

public class TestBank {
	public static void main(String[] args) {
		Bank bankA = new BankA(1000);
		Bank bankB = new BankB(1500);
		Bank bankC = new BankC(2000);

		System.out.println("Bank A Balance: " + bankA.getBalance());
		System.out.println("Bank A Balance after Interest: " + bankA.applyInterest());

		System.out.println("Bank B Balance: " + bankB.getBalance());
		System.out.println("Bank B Balance after Interest: " + bankB.applyInterest());

		System.out.println("Bank C Balance: " + bankC.getBalance());
		System.out.println("Bank C Balance after Interest: " + bankC.applyInterest());
	}
}
