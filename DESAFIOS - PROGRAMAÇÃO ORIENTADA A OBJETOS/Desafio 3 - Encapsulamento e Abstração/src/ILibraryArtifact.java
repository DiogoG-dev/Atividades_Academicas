public interface ILibraryArtifact {
    String getTitle();
    Author getAuthor();
    int getPublicationYear();
    boolean isAvailableForLoan();
}
