import java.util.Random;
public class CreditCard{
    String ownerName;
    IBank bank;
    double monthlyIncome;
    double limit;
    String number;
    double balance;

    public CreditCard(String ownerName, IBank bank, double monthlyIncome){
        this.ownerName = ownerName;
        this.bank = bank;
        this.monthlyIncome = monthlyIncome;
        this.limit = grantCreditLimit(monthlyIncome);
        this.number = generateCreditCardNumber();
        this.balance = 0;
    }
    public String generateCreditCardNumber(){
        Random random = new Random();
        long numRandom = (long) (random.nextDouble() * 9_000_000_000_000_000L) + 1_000_000_000_000_000L;
        return "" + numRandom;
    }
    public double grantCreditLimit(double monthlyIncome){
        return monthlyIncome * 3;
    }
}
