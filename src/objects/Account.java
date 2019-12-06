package objects;

public class Account {
private long id;
private double balance;


public Account() {
	this(0);
}
public Account(double balance) {
	this.id = IdGenerator.getAccountId();
	this.balance = balance;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public long getId() {
	return id;
}

}
