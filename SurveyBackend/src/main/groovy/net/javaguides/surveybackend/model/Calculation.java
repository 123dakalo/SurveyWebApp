package net.javaguides.surveybackend.model;


public class Calculation {
    private long totalSurveys;
    private double averageAge;
    private int oldestAge;
    private int youngestAge;
    private double pizzaPercentage;
    private double pastaPercentage;
    private double papWorsPercentage;
    private double eatOutAverage;
    private double moviesAverage;
    private double radioAverage;
    private double tvAverage;

    public Calculation() {
        super();
    }

    public Calculation(double tvAverage, double radioAverage, double moviesAverage) {
        this.tvAverage = tvAverage;
        this.radioAverage = radioAverage;
        this.moviesAverage = moviesAverage;
    }

    public Calculation(long totalSurveys, double averageAge, int oldestAge, int youngestAge,
                       double pizzaPercentage, double pastaPercentage, double papWorsPercentage,
                       double tvAverage, double radioAverage, double moviesAverage, double eatOutAverage) {
        this.totalSurveys = totalSurveys;
        this.averageAge = averageAge;
        this.oldestAge = oldestAge;
        this.youngestAge = youngestAge;
        this.pizzaPercentage = pizzaPercentage;
        this.eatOutAverage = eatOutAverage;
        this.papWorsPercentage = papWorsPercentage;
        this.pastaPercentage = pastaPercentage;
        this.tvAverage = tvAverage;
        this.radioAverage = radioAverage;
        this.moviesAverage = moviesAverage;
    }

    public long getTotalSurveys() {
        return totalSurveys;
    }

    public void setTotalSurveys(long totalSurveys) {
        this.totalSurveys = totalSurveys;
    }

    public double getAverageAge() {
        return averageAge;
    }

    public void setAverageAge(double averageAge) {
        this.averageAge = averageAge;
    }

    public int getOldestAge() {
        return oldestAge;
    }

    public void setOldestAge(int oldestAge) {
        this.oldestAge = oldestAge;
    }

    public int getYoungestAge() {
        return youngestAge;
    }

    public void setYoungestAge(int youngestAge) {
        this.youngestAge = youngestAge;
    }

    public double getPizzaPercentage() {
        return pizzaPercentage;
    }

    public void setPizzaPercentage(double pizzaPercentage) {
        this.pizzaPercentage = pizzaPercentage;
    }

    public double getEatOutAverage() {
        return eatOutAverage;
    }

    public void setEatOutAverage(double eatOutAverage) {
        this.eatOutAverage = eatOutAverage;
    }

    public double getPastaPercentage() {
        return pastaPercentage;
    }

    public void setPastaPercentage(double pastaPercentage) {
        this.pastaPercentage = pastaPercentage;
    }

    public double getPapWorsPercentage() {
        return papWorsPercentage;
    }

    public void setPapWorsPercentage(double papWorsPercentage) {
        this.papWorsPercentage = papWorsPercentage;
    }

    public double getMoviesAverage() {
        return moviesAverage;
    }

    public void setMoviesAverage(double moviesAverage) {
        this.moviesAverage = moviesAverage;
    }

    public double getRadioAverage() {
        return radioAverage;
    }

    public void setRadioAverage(double radioAverage) {
        this.radioAverage = radioAverage;
    }

    public double getTvAverage() {
        return tvAverage;
    }

    public void setTvAverage(double tvAverage) {
        this.tvAverage = tvAverage;
    }
}
