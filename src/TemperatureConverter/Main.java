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
        AbstractBaseConverter fahrenheit = new FahrenheitConverterAbstract(10);

        celsius.setTemperature(50);
        celsius.convert(kelvin).warmUp(50).convert(fahrenheit).warmUp(-50)
                .convert(celsius).warmUp(-50).showTemperature();

    }
}


