import java.util.Date;

public class Main {
    public static void main(String[] args){
        Santander santander = new Santander("SantanderBS",
                "Diogo Gabriel",
                "Brasil",
                "Avenida Qualquer, 100, Centro",
                2,
                "BRL");
        JPMorgan jpMorgan = new JPMorgan("JPMorganBS",
                "Raissa Albuquerque",
                "Suíça",
                "Rua Croix d'Or, 200, Centro",
                5,
                "CHF");

        CreditCard creditCard = new CreditCard("Diogo G S Amaro",
                santander,
                1351.39);

        Visa visa = new Visa("Diogo G S Amaro",
                santander,
                1351.39);

        MasterCard masterCard = new MasterCard("Diogo G S Amaro",
                santander,
                1351.39);

        santander.deposit(5);
        santander.deposit(4);
        santander.withdraw(9.5);

        jpMorgan.deposit(5);
        jpMorgan.deposit(4);
        jpMorgan.withdraw(9.5);

        jpMorgan.createInsurancePolicy("Diogo Gabriel", 25);

        jpMorgan.createInsurancePolicy("Ferrari", 2,2023);
        jpMorgan.createInsurancePolicy("Gol", 10,1999);

        jpMorgan.createInsurancePolicy("Diogo Gabriel", "Brasil", "Qatar", new Date(123, 9, 15), new Date(124, 0, 1));


        creditCard.generateCreditCardNumber();
        creditCard.grantCreditLimit(1351.39);


        visa.generateCreditCardNumber();
        visa.grantCreditLimit(1351.39);

        masterCard.generateCreditCardNumber();
        masterCard.grantCreditLimit(1351.39);
    }
}
