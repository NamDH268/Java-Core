import java.time.LocalDate;
public class Account {
    int id;
    String email;
    String username;
    String fullName;
    Department department;
    Position position;
    LocalDate createdDate;

    Account(){
    }

    public Account(int id, String email, String username, String firstName, String lastName) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.fullName = firstName + lastName;
    }

    public Account(int id, String email, String username, String firstName, String lastName , Position position) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.fullName = firstName + lastName;
        this.position = position;
        this.createdDate = LocalDate.now();
    }

    public Account(int id, String email, String username, String firstName, String lastName , Position position, LocalDate createdDate) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.fullName = firstName + lastName;
        this.position = position;
        this.createdDate = createdDate;
    }
}