public class Main{
    public static void main(String[] args){
        Movie movie = new Movie("Shrek Forever", 103, "Shrek Film Synopsis");
        FamilyClient familyClient = new FamilyClient("manypeople", "onepays");
        
        System.out.println(movie.getSynopsis());
        System.out.println(movie.getDurationInMinutes());
        System.out.println(familyClient.grantInstances());
        System.out.println(familyClient.getPassword());
    }
    
}