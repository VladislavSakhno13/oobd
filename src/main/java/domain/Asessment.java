package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Asessment {
    @Id
    long id;

    @Column
    int size;

    @Column
    String description;

    @Column
    int price;

    @ManyToOne
    Reviews reviews;

    public Asessment() {
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Asessment(long id, int id1, String description, int price, int size, Reviews reviews) {
        this.id = id1;
        this.description = description;
        this.price = price;
        this.size = size;
        this.reviews = reviews;
    }

    public Reviews getReviews() {
        return reviews;
    }

    public void setReviews(Reviews seller) {
        this.reviews = reviews;
    }
}

