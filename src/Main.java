public class Main {
    public static void main(String[] args) {

        Client sergio = new Client("1256237", "Sergio andres", "2q4234523", "Ahorros");

        Client andrea = new Client("1256237", "andrea andres", "2q4234523", "Ahorros");

        sergio.deposit(300);
        sergio.transfer(500, andrea);
        sergio.withdraw(1000);
        System.out.println("sergio: " + sergio.getBalance() + " andrea: " + andrea.getBalance());
    }
}
