package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Place {

    @Id
    long id;


    @ManyToOne
    Person Person;


    @ManyToOne
    Asessment asessment;

    String pricePerson;

    public Place(int id, Person Person, Asessment asessment) {
        this.id = id;
        this.Person = Person;
        this.asessment = asessment;
    }

    public Place() {
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPerson() {
        return Person;
    }

    public void setPerson(Person Person) {
        this.Person = Person;
    }

    public Asessment getAsessment() {
        return asessment;
    }

    public void setAsessment(Asessment asessment) {
        this.asessment = asessment;
    }
}