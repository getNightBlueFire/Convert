package TemperatureConverter;

import Vector.MyMath;

public class BaseConverter extends MyMathConvert {
    public BaseConverter() {
    }

    public BaseConverter(double temp, int from, int to) {
        this.setTemp(temp);
        this.getFrom(from);
        this.setTo(to);
    }

    @Override
    public double convert(double c, int from, int to) {
        double rez = 0;
        if (from == 1 && to == 2) {
            rez += (c * 9 / 5) - 32;
        } else if (from == 1 && to == 3) {
            rez += c + 273.15;
        } else if (from == 2 && to == 1) {
            rez += (c - 32) * 5 / 9;
        } else if (from == 2 && to == 3) {
            rez += (c + 459.67) * 5 / 9;
        } else if (from == 3 && to == 1) {
            rez += c - 273.15;
        } else if (from == 3 && to == 2){
            rez += 1.8*(c-273) + 32;
        }
        return rez;
    }


}
