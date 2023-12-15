public class Company {
    String companyName;
    int employeeCount;
    Person owner;

    public Company(String companyName, int employeeCount, Person owner){
        this.companyName = companyName;
        this.employeeCount = employeeCount;
        this.owner = owner;
    }
    public void hireEmployee(Person newEmployee){
        String firstname = newEmployee.firstname;
        String lastname = newEmployee.lastname;
        System.out.println("Hired a new employee: " + firstname + " " + lastname);
        employeeCount++;
    }
    public void scheduleMeeting(String agenda){
        System.out.println(companyName + " Meeting Scheduled - Agenda " + agenda);
    }
    public void displayCompanyInfo(){
        System.out.println("Company Name: " + companyName);
        System.out.println("Number of Employees: " + employeeCount);
        System.out.println("Owner:");
        owner.displayInfo();
    }
}
