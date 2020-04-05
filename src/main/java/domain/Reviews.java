package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Reviews {
    @Id
    long id;

    @Column
    String name;

    @Column
    int experience;

    public Reviews() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Reviews(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }
}
