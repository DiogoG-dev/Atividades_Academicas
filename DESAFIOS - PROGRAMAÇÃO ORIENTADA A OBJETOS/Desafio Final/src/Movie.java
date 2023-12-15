public class Movie implements INetflixMedia{
    private String title;
    private int durationInMinutes;
    private String synopsis;
    
    public Movie(String title, int durationInMinutes, String synopsis){
        this.title = title;
        this.durationInMinutes = durationInMinutes;
        this.synopsis = synopsis;
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
    
    
    @Override
    public void play(){
        System.out.println("Playing a Film");
    }
    
    
    @Override
    public void pause(){
        System.out.println("Film Paused");
    }
    
    
    @Override
    public void stop(){
        System.out.println("Film Stopped");
    }
}