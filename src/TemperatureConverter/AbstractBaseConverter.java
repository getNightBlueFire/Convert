package TemperatureConverter;

abstract public class AbstractBaseConverter implements BaseConverter {
    private double temperature = 0;
    public AbstractBaseConverter() {
    }

    public AbstractBaseConverter(double temp) {
        this.temperature = temp;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public abstract String name();

    public void showTemperature() {
        System.out.println(String.format("%.2f", this.getTemperature()) + name());
    }

}
