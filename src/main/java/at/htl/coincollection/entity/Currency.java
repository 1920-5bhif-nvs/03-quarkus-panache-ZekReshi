package at.htl.coincollection.entity;

import javax.persistence.*;

@Entity
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    //region Constructors

    public Currency() {
    }

    public Currency(String name) {
        this.name = name;
    }

    //endregion

    //region Getter and Setter

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //endregion

}
