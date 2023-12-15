public class Book implements ILibraryArtifact{
    private String title;
    private Author author;
    private int publicationYear;
    private int available;
    private String genre;

    public Book(String title, Author author, int publicationYear, int available, String genre){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.available = available;
        this.genre = genre;
    }

    @Override
    public String getTitle() {
        return title;
    }
     public void setTitle(String newTitle){
        title = newTitle;
     }

    @Override
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author newAuthor){
        author = newAuthor;
    }

    @Override
    public int getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(int newPublicationYear){
        publicationYear = newPublicationYear;
    }

    public int getAvailable(){
        return available;
    }
    public void setAvailable(int newAvailable){
        available = newAvailable;
    }

    public String getGenre(){
        return genre;
    }
    public void setGenre(String newGenre){
        genre = newGenre;
    }

    @Override
    public boolean isAvailableForLoan() {
        if (available >= 1){
            return true;
        }
        else {
            return false;
        }
    }
}
