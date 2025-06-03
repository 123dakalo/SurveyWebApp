package net.javaguides.surveybackend.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "survey")
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String email;
    private LocalDate dateOfBirth;
    private String contactNumber;

    private boolean pizza;
    private boolean pasta;
    private boolean papWors;
    private boolean other;

    private int watchMovies;
    private int listenRadio;
    private int eatOut;
    private int watchTV;

    public Survey() {
        super();
    }

    public Survey(String fullName, String email, LocalDate dateOfBirth, String contactNumber, boolean pizza, boolean pasta, boolean papWors, boolean other, int watchMovies, int listenRadio, int eatOut, int watchTV) {
        this.fullName = fullName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.contactNumber = contactNumber;
        this.pizza = pizza;
        this.pasta = pasta;
        this.papWors = papWors;
        this.other = other;
        this.watchMovies = watchMovies;
        this.listenRadio = listenRadio;
        this.eatOut = eatOut;
        this.watchTV = watchTV;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public boolean isPizza() {
        return pizza;
    }

    public void setPizza(boolean pizza) {
        this.pizza = pizza;
    }

    public boolean isPasta() {
        return pasta;
    }

    public void setPasta(boolean pasta) {
        this.pasta = pasta;
    }

    public boolean isPapWors() {
        return papWors;
    }

    public void setPapWors(boolean papWors) {
        this.papWors = papWors;
    }

    public boolean isOther() {
        return other;
    }

    public void setOther(boolean other) {
        this.other = other;
    }

    public int getWatchMovies() {
        return watchMovies;
    }

    public void setWatchMovies(int watchMovies) {
        this.watchMovies = watchMovies;
    }

    public int getListenRadio() {
        return listenRadio;
    }

    public void setListenRadio(int listenRadio) {
        this.listenRadio = listenRadio;
    }

    public int getEatOut() {
        return eatOut;
    }

    public void setEatOut(int eatOut) {
        this.eatOut = eatOut;
    }

    public int getWatchTV() {
        return watchTV;
    }

    public void setWatchTV(int watchTV) {
        this.watchTV = watchTV;
    }
}
