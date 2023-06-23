public class Client extends Person {
    private String accountId;
    private String accountType;
    private double balance = 0;

    public Client(String id, String name, String accountId, String accountType) {
        super(id, name);
        this.accountId = accountId;
        this.accountType = accountType;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public boolean deposit(double amount) {
        boolean succesful = false;
        if (amount > 0) {
            this.balance += amount;
            succesful = true;
        }
        return succesful;
    }

    public boolean withdraw(double amount) {
        boolean succesful = false;
        if (amount <= this.balance) {
            succesful = true;
            this.balance -= amount;
        }
        return succesful;
    }

    public boolean transfer(double amount, Client recipient) {
        boolean succesful = false;
        if (amount <= this.balance) {
            succesful = true;
            withdraw(amount);
            recipient.deposit(amount);

        }
        return succesful;
    }

    public double getBalance() {
        return balance;
    }

}
