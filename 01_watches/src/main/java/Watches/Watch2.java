package Watches;

public class Watch2 {
    private String name;
    private double price;
    private int hours, minutes, seconds;

    public Watch2(String name, double price) {
        this.name = name;
        this.price = price;
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public void setTime(int hours_, int minutes_, int seconds_) throws Exception {
        if (hours_ < 0 || hours_ > 11) {
            throw new Exception("Error. Your hours is " + hours_ + ". " + "But hours must be between zero to eleven");
        }
        if (minutes_ < 0 || minutes_ > 59) {
            throw new Exception("Error. Your hours is " + minutes_ + ". " + "But minutes must be between 0 and 59");
        }
        if (seconds_ < 0 || seconds_ > 59) {
            throw new Exception("Error. Your hours is " + seconds_ + ". " + "But seconds must be between 0 and 59");
        }
        hours = hours_;
        minutes = minutes_;
        seconds = seconds_;
    }

    public void addTime(int hours_, int minutes_, int seconds_) {
        minutes = (minutes + minutes_) % 60;
        seconds = (seconds + seconds_) % 60;
        hours = (hours + hours_) % 12;
    }

    public int[] getTime() {
        return new int[]{ hours, minutes, seconds };
    }

    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }
}
