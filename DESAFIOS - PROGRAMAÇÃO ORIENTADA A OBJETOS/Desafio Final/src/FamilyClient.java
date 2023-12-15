public class FamilyClient extends Client{
    public FamilyClient(String username, String password){
        super(username, password, 0);
        this.instancesNumber = grantInstances();
    }
    
    public int grantInstances(){
        return 5;
    }
}