package TemperatureConverter;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        while(true){
            System.out.println("Введите из какой единицы переводим: \n" +
                    "1 - Цельсий, 2- Фаренгейт, 3 - Кельвин");

            Scanner scanner = new Scanner(System.in);
            int c = scanner.nextInt();
            System.out.println("Введите температуру: (Например 20.0)");
            double temp = scanner.nextDouble();
            System.out.println("В какие единицы переводим: \n" +
                    "1 - Цельсий, 2- Фаренгейт, 3 - Кельвин");
            int to = scanner.nextInt();


            IBaseConverter iBaseConverter = new BaseConverter();
            BaseConverter baseConverter = new BaseConverter(temp, c, to);
            double result = iBaseConverter.convert(temp, c, to);
            System.out.print(result);
            if (to == 1) System.out.print(" C");
            if (to == 2) System.out.print(" F");
            if (to == 3) System.out.print(" K");

            System.out.println("Желаете продолжить? (y/n)");
            char question = (char)System.in.read();
            if (question == 'n') break;
        }



    }
}
