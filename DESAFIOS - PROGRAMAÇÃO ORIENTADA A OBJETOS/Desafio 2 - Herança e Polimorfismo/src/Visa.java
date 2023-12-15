import java.util.Random;

public class Visa extends CreditCard{
    public Visa(String ownerName, IBank bank, double monthlyIncome){
        super(ownerName, bank, monthlyIncome);
    }
    @Override
    public String generateCreditCardNumber() {
        Random random = new Random();
        long numRandom = (long) (random.nextDouble() * 900_000_000_000_000L) + 100_000_000_000_000L;
        return "3" + numRandom;
    }
    @Override
    public double grantCreditLimit(double monthlyIncome){
        return monthlyIncome * 2;
    }
}
