package TemperatureConverter;

abstract public class MyMathConvert implements IBaseConverter{
    private double temp;

    public int getFrom() {
        return from;
    }

    private int from;

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    private int to;



    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public int getFrom(int from) {
        return this.from;
    }

    public void setFrom(int from) {
        this.from = from;
    }
}
