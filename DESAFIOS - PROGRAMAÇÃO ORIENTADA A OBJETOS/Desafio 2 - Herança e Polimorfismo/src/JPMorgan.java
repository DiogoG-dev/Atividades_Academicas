import java.util.Date;

public class JPMorgan implements IBank, IInsuranceCompany{
    String name;
    String manager;
    String country;
    String address;
    double balance;
    java.util.Currency currency;

    public JPMorgan(String name, String manager, String country, String address, double balance, String currencyCode){
        this.name = name;
        this.manager = manager;
        this.country = country;
        this.address = address;
        this.balance = balance;
        this.currency = java.util.Currency.getInstance(currencyCode);
    }
    @Override
    public double deposit(double valor) {
        balance += valor;
        return balance;
    }
    @Override
    public boolean withdraw(double valor){
        if (valor > balance) {
            System.out.println("Insufficient funds!");
            return false;
        }
        else  {
            balance -= (valor * 1.01f);
            System.out.println("Amount successfully withdrawn.");
            return true;
        }
    }
    @Override
    public boolean createInsurancePolicy(String name, int age){
        System.out.println("Life insurance successfully processed!");
        return true;
    }
    @Override
    public boolean createInsurancePolicy(String carModel, int carID, int manufacturedYear){
        if (manufacturedYear < 2000){
            System.out.println(String.format("Unauthorized insurance for the car manufactured in the year %d.", manufacturedYear));
            return true;
        }
        else {
            System.out.println("Car insurance successfully completed.");
            return true;
        }
    }
    @Override
    public boolean createInsurancePolicy(String passengerName, String origin, String destination, Date departureDate, Date returnDate){
        System.out.println("Travel insurance successfully processed!");
        return true;
    }
}
