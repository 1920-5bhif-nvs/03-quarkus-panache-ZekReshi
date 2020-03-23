package at.htl.coincollection.entity;

import javax.persistence.*;

@Entity
public class Coin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int value;
    private int preservation;
    private int yearOfCoinage;
    @ManyToOne
    private Source source;
    @ManyToOne
    private Currency currency;
    @ManyToOne
    private Collector collector;

    //region Constructors

    public Coin() {
    }

    public Coin(int value, int preservation, int yearOfCoinage, Source source, Currency currency, Collector collector) {
        this.value = value;
        this.preservation = preservation;
        this.yearOfCoinage = yearOfCoinage;
        this.source = source;
        this.currency = currency;
        this.collector = collector;
    }

    //endregion

    //region Getter and Setter

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getPreservation() {
        return preservation;
    }

    public void setPreservation(int preservation) {
        this.preservation = preservation;
    }

    public int getYearOfCoinage() {
        return yearOfCoinage;
    }

    public void setYearOfCoinage(int yearOfCoinage) {
        this.yearOfCoinage = yearOfCoinage;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Collector getCollector() {
        return collector;
    }

    public void setCollector(Collector collector) {
        this.collector = collector;
    }

    //endregion

}
