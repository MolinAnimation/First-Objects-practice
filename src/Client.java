public class Client extends Person {
    String accountId;
    String accountType;
    double balance;

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

}
