import java.util.Date;

public interface IInsuranceCompany{
    public boolean createInsurancePolicy(String name, int age);
    public boolean createInsurancePolicy(String carModel, int carID, int manufacturedYear);
    public boolean createInsurancePolicy(String passengerName, String origin, String destination, Date departureDate, Date returnDate);
}
