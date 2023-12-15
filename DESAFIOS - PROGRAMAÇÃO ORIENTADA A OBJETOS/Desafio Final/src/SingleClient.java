public class SingleClient extends Client{
    public SingleClient(String username, String password){
        super(username, password, 0);
        this.instancesNumber = grantInstances();
    }
    
    public int grantInstances(){
        return 1;
    }
}