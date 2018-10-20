package sendbajt.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String username;
    private String password;
    private int rating;

    @OneToMany
    private Collection<Job> jobs = new ArrayList<Job>();

    public Collection<Job> getJobs() {
        return jobs;
    }

    public int getId() {
        return id;
    }


    public User() {
    }

    public User(String username, String password, int rating) {
        this.username = username;
        this.password = password;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", rating=" + rating +
                ", jobs=" + jobs +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setJobs(Collection<Job> jobs) {
        this.jobs = jobs;
    }
}
