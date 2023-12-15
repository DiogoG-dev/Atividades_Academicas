public class Santander implements IBank{
    String name;
    String manager;
    String country;
    String address;
    double balance;
    java.util.Currency currency;

    public Santander(String name, String manager, String country, String address, double balance, String currencyCode){
        this.name = name;
        this.manager = manager;
        this.country = country;
        this.address = address;
        this.balance = balance;
        this.currency = java.util.Currency.getInstance(currencyCode);
    }
    @Override
    public double deposit(double valor){
        balance += valor;
        return balance;
    }
    @Override
    public boolean withdraw(double valor) {
        if (valor > balance){
            System.out.println("Insufficient funds!");
            return false;
        }
        else{
            balance -= valor;
            System.out.println("Amount successfully withdrawn.");
            return true;
        }
    }
}
