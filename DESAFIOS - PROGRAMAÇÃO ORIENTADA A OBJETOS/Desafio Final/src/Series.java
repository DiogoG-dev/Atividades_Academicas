public class Series implements  INetflixMedia{
    private String title;
    private int durationInMinutes;
    private String synopsis;
    private int seasonsNumber;
    
    
    public Series(String title, int durationInMinutes, String synopsis, int seasonsNumber){
        this.title = title;
        this.durationInMinutes = durationInMinutes;
        this.synopsis = synopsis;
        this.seasonsNumber = seasonsNumber;
    }
    
    
    @Override
    public String getTitle(){
        return title;
    }
    public void setTitle(String newTitle){
        title = newTitle;
    }
    
    @Override
    public int getDurationInMinutes(){
        return durationInMinutes;
    }
    public void setDurationInMinutes(int newDurationInMinutes){
        durationInMinutes = newDurationInMinutes;
    }
    
    
    public String getSynopsis(){
        return synopsis;
    }
    public void setSynopsis(String newSynopsis){
        synopsis = newSynopsis;
    }
    
    
    public int getSeasonsNumber(){
        return seasonsNumber;
    }
    public void setSeasonsNumber(int newSeasonsNumber){
        seasonsNumber = newSeasonsNumber;
    }
    
    
    @Override
    public void play(){
        System.out.println("Playing a Series");
    }
    
    
    @Override
    public void pause(){
        System.out.println("Series Paused");
    }
    
    
    @Override
    public void stop(){
        System.out.println("Series Stopped");
    }
}