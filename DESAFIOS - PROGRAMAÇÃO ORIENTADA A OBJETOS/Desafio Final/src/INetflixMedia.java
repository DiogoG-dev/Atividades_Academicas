public interface INetflixMedia{
    String getTitle();
    int getDurationInMinutes();
    void play();
    void pause();
    void stop();
}