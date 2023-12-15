import java.util.Random;

public class MasterCard extends CreditCard{
    public MasterCard(String ownerName, IBank bank, double monthlyIncome){
        super(ownerName, bank, monthlyIncome);
    }
    @Override
    public String generateCreditCardNumber(){
        Random random = new Random();
        long numRandom = (long) (random.nextDouble() * 900_000_000_000_000L) + 100_000_000_000_000L;
        return "5" + numRandom;
    }
    @Override
    public double grantCreditLimit(double monthlyIncome){
        return monthlyIncome * 2.5;
    }
}
