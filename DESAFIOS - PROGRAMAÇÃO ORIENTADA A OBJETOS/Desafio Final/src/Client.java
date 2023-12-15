public abstract class Client{
    private String username;
    private String password;
    protected int instancesNumber;
    
    
    public Client(String username, String password, int instancesNumber){
        this.username = username;
        this.password = password;
        this.instancesNumber = instancesNumber;
    }
    
    
    public String getUsername(){
        return username;
    }
    public void setUsername(String newUsername){
        username = newUsername;
    }
    
    
    public String getPassword(){
        return password;
    }
    public void setPassword(String newPassword){
        password = newPassword;
    }
    
    
    public int getInstancesNumber(){
        return instancesNumber;
    }
    public void setInstancesNumber(int newInstancesNumber){
        instancesNumber = newInstancesNumber;
    }
    
    
    public abstract int grantInstances();
}