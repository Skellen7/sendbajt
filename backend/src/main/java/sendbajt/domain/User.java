package sendbajt.domain;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String username;
    private String password;
    private int rating;

//    @OneToMany
//    @Embedded
//    jobsOrdered

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "UserInformation{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", rating=" + rating +
                '}';
    }

    public User() {
    }

    public User(String username, String password, int rating) {
        this.username = username;
        this.password = password;
        this.rating = rating;
    }
}
