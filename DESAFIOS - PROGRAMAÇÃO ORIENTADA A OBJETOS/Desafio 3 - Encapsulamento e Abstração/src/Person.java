import java.util.Date;

public abstract class Person {
    protected String firstname;
    protected String lastName;
    protected Date dateOfBirth;

    public Person(String firstname, String lastName, Date dateOfBirth){
        this.firstname = firstname;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstname(){
        return firstname;
    }
    public void setFirstname(String newFirstname){
        firstname = newFirstname;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String newLastName){
        lastName = newLastName;
    }
    public Date getDateOfBirth(){
        return dateOfBirth;
    }
    public void setDateOfBirth(Date newDateOfBirth){
        dateOfBirth = newDateOfBirth;
    }
}
