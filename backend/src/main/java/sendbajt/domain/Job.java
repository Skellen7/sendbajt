package sendbajt.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private boolean jobTaken;
    private boolean jobOrdered;

    private String latitude;
    private String longtitude;
    private String category;
    private int price;
    private String description;
    private String startHour;
    private String endHour;

    public Job() {
    }

    public int getId() {
        return id;
    }


    public Job(boolean jobTaken, boolean jobOrdered, String latitude, String longtitude, String category, int price, String description, String startHour, String endHour) {
        this.jobTaken = jobTaken;
        this.jobOrdered = jobOrdered;
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.category = category;
        this.price = price;
        this.description = description;
        this.startHour = startHour;
        this.endHour = endHour;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", jobTaken=" + jobTaken +
                ", jobOrdered=" + jobOrdered +
                ", latitude='" + latitude + '\'' +
                ", longtitude='" + longtitude + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", startHour='" + startHour + '\'' +
                ", endHour='" + endHour + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isJobTaken() {
        return jobTaken;
    }

    public void setJobTaken(boolean jobTaken) {
        this.jobTaken = jobTaken;
    }

    public boolean isJobOrdered() {
        return jobOrdered;
    }

    public void setJobOrdered(boolean jobOrdered) {
        this.jobOrdered = jobOrdered;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(String longtitude) {
        this.longtitude = longtitude;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartHour() {
        return startHour;
    }

    public void setStartHour(String startHour) {
        this.startHour = startHour;
    }

    public String getEndHour() {
        return endHour;
    }

    public void setEndHour(String endHour) {
        this.endHour = endHour;
    }
}