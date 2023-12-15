import java.util.Date;

public class Manager extends Person{
    private Date hireDate;
    private double salary;

    public Manager(String firstname, String lastName, Date dateOfBirth, Date hireDate, double salary) {
        super(firstname, lastName, dateOfBirth);
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public Date getHireDate(){
        return hireDate;
    }
    public void setHireDate(Date newHireDate){
        hireDate = newHireDate;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double newSalary){
        salary = newSalary;
    }
}
