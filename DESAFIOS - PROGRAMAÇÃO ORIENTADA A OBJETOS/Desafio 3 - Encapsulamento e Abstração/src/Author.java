import java.util.Date;

public class Author extends Person {
    private String nationality;
    private String biography;
    private String area;

    public Author(String firstname, String lastName, Date dateOfBirth, String nationality, String biography, String area) {
        super(firstname, lastName, dateOfBirth);
        this.nationality = nationality;
        this.biography = biography;
        this.area = area;
    }

    public String getNationality(){
        return nationality;
    }
    public void setNationality(String newNationality){
        nationality = newNationality;
    }
    public String getBiography(){
        return biography;
    }
    public void setBiography(String newBiography){
        biography = newBiography;
    }
    public String getArea(){
        return area;
    }
    public void setArea(String newArea){
        area = newArea;
    }
}
