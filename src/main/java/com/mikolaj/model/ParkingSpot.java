package com.mikolaj.model;

import javax.persistence.*;

@Entity
@Table(name = "Spot")
public class ParkingSpot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "imie")
    private String imie;

    @Column(name = "nazwisko")
    private String nazwisko;

    @Column(name = "marka")
    private String marka;

    @Column(name = "numer")
    private String numer;

    @Column(name = "miejsce")
    private String miejsce;

    public ParkingSpot() {

    }

    public ParkingSpot(int id, String imie, String nazwisko, String marka, String numer, String miejsce) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.marka = marka;
        this.nazwisko = nazwisko;
        this.miejsce = miejsce;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImie(String imie) {
        return this.imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNumer() {
        return numer;
    }

    public void setNumer(String numer) {
        this.numer = numer;
    }

    public String getMiejsce() {
        return miejsce;
    }

    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }

}
