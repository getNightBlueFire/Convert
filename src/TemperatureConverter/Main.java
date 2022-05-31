package TemperatureConverter;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ShapeFrame of = new ShapeFrame();
        // Задаем правидо, по которому приложение завершиться при
        // закрытии этой формы
        of.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Делаем окно видимым
        of.setVisible(true);
        AbstractBaseConverter celsius = new CelsiusConverterAbstract();
        AbstractBaseConverter kelvin = new KelvinConverterAbstract();
        AbstractBaseConverter fahrenheit = new FahrenheitConverterAbstract();
        fahrenheit.setTemperature(50);
        fahrenheit.convert(fahrenheit).convert(kelvin).convert(fahrenheit).showTemperature();
        fahrenheit.convert(celsius).convert(kelvin).convert(fahrenheit).showTemperature();
        celsius.setTemperature(273);
        celsius.convert(kelvin).convert(celsius).showTemperature();
        celsius.convert(kelvin).convert(fahrenheit).showTemperature();

    }
}


