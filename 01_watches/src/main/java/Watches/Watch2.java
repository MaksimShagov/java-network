package Watches;

public class Watch2 extends Watch1{
    private int seconds;

    public Watch2(String name, double price) {
        super(name, price);
        this.seconds = 0;
    }

    public void setTime(int hours_, int minutes_, int seconds_) throws Exception {
        super.setTime(hours_, minutes_);
        if (seconds_ < 0 || seconds_ > 59) {
            throw new Exception("Error. Your hours is " + seconds_ + ". " + "But seconds must be between 0 and 59");
        }
        seconds = seconds_;
    }

    public void addTime(int hours_, int minutes_, int seconds_) {
        super.addTime(hours_, minutes_);
        seconds = (seconds + seconds_) % 60;
    }

    public int[] getTime() {
        return new int[]{ super.getTime()[0], super.getTime()[1], seconds };
    }
/*
    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }*/
}
