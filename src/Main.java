import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import org.apache.commons.lang3.StringUtils;
public class Main {
    public static void main(String[] args) {
        //Задача1
        System.out.println("Задача1");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите возраст");
        int age = in.nextInt();

        if (age>=18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        else if (age<18 && age>0) {
            System.out.println("Если возраст человека равен " + age + ", то он несовершеннолетний");
        }
        else {
            System.out.println("Некорректно введен возраст");
        }
        System.out.println();

        //Задача2
        System.out.println("Задача2");
        System.out.println("Введите температуру");
        int temperature = in.nextInt();
        if (temperature<5) {
            System.out.println("На улице " +temperature+ " градусов. На улице холодно, нужно надеть шапку");
        }
        else {
            System.out.println("На улице " +temperature+ " градусов. Сегодня тепло, можно идти без шапки");
        }
        System.out.println();

        //Задача3
        System.out.println("Задача3");
        System.out.println("Введите скорость");
        int speed = in.nextInt();
        if (speed<60 && speed>0) {
            System.out.println("Если скорость " +speed+ "км/ч, можно ездить спокойно.");
        }
        else if (speed>60) {
            System.out.println("Если скорость " +speed+ "км/ч, то придется заплатить штраф.");
        }
        else {
            System.out.println("Некорректно введена скорость");
        }
        System.out.println();

        //Задача4
        System.out.println("Задача4");
        System.out.println("Используем возраст с 1й задачи");
        if (age<6 && age>2) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        else if (age<17 && age>7) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        else if (age<=24 && age>=18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        else if (age>24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в на работу");
        }
        else {
            System.out.println("Некорректно введен возраст");
        }
        System.out.println();

        //Задача5
        System.out.println("Задача5");
        System.out.println("Используем возраст с 1й задачи");
        if (age<5) {
            System.out.println("Если возраст человека равен " + age + ", то нельзя кататься на аттракционе");
        }
        else if (age<14 && age>=5) {
            System.out.println("Если возраст человека равен " + age + ", то можно кататься на аттракционе в сопровождении");
        }
        else if (age>=14) {
            System.out.println("Если возраст человека равен " + age + ", то без сопровождения взрослого");
        }
        else {
            System.out.println("Некорректно введен возраст");
        }
        System.out.println();

        //Задача6
        System.out.println("Задача6");
        var carCapacity = 120;
        var carSeats = 60;
        System.out.println("Введите число пассажиров");
        int passengers = in.nextInt();
        if (passengers<=carCapacity  && passengers>0) {
            if (passengers < carSeats) {
                System.out.println("В вагоне " + passengers + " пассажиров. Сидячие места есть");
            } else {
                System.out.println("В вагоне " + passengers + " пассажиров. Сидячих мест нет");
            }
        }
        else if (passengers>carCapacity){
            System.out.println("Мест нет. Вагон полный. " + (passengers%carCapacity)+ " пассажиров не пеместились в вагон");
        }
        else {
            System.out.println("Некорректно введено число пассажиров");
        }
        System.out.println();
        //Задача7
        System.out.println("Задача7");
        int one = in.nextInt();
        int two = in.nextInt();
        int three = in.nextInt();
        var max=0;
        if (one>two && one>three) {
            max = one;
        }
        else if (two>one && two>three) {
            max = two;
        }
        else {
            max = three;
        }
        System.out.println("Max = "+max);
        System.out.println();
    }
}