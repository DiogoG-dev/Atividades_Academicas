public class Periodical implements ILibraryArtifact{
    private String title;
    private Author author;
    private int publicationYear;
    private int available;
    private String journal;
    public Periodical(String title, Author author, int publicationYear, int available, String journal){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.available = available;
        this.journal = journal;
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

    public String getJournal(){
        return journal;
    }
    public void setJournal(String newJournal){
        journal = newJournal;
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
