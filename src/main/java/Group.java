import java.time.LocalDate;
public class Group {
    int id;
    String name;
    Account creator;
    LocalDate createdDate;

    Group(){
    }

    public Group(int id, LocalDate createdDate, String name, Account creator) {
        this.id = id;
        this.createdDate = createdDate;
        this.name = name;
        this.creator = creator;
    }
}