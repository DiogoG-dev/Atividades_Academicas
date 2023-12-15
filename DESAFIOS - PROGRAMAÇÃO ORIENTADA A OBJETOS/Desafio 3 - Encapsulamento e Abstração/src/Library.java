import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private Manager manager;
    private List<Book> books;
    private List<Map> maps;
    private List<Periodical> periodicals;
    private List<User> users;

    public Library(String name, Manager manager){
        this.name = name;
        this.manager = manager;
        books = new ArrayList<Book>();
        maps = new ArrayList<Map>();
        periodicals = new ArrayList<Periodical>();
        users = new ArrayList<User>();
    }

    public void registerBook(Book book){
        books.add(book);
    }

    public void registerMap(Map map){
        maps.add(map);
    }

    public void registerPeriodical(Periodical periodical){
        periodicals.add(periodical);
    }

    public void registerUser(User user){
        users.add(user);
    }

    public List<User> getUsers(){
        return users;
    }

    public List<Book> getBooks(){
        return books;
    }

    public List<Map> getMaps(){
        return maps;
    }

    public List<Periodical> getPeriodicals(){
        return periodicals;
    }

    public String getName(){
        return name;
    }

    public Manager getManager(){
        return manager;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setManager(Manager manager){
        this.manager = manager;
    }
}