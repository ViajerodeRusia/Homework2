import java.util.Scanner;
public class hw2 {
    public static void main(String[] args) {
        System.out.println("Задачи по теме Условный оператор ч2");

        //Задача1
        System.out.println("Задача1");
        Scanner in = new Scanner (System.in);
        System.out.println("Операционная система iOS - 0, Android - 1");
        int clientOS = in.nextInt();
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Некорректное название");
        }
        System.out.println();

        //Задача2
        System.out.println("Задача2");
        System.out.println("Год выпуска");
        int clientDeviceYear = in.nextInt();
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else if (clientDeviceYear > 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientDeviceYear > 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Некорректное название");
        }
        System.out.println();

        //Задача3
        System.out.println("Задача3");
        System.out.println("Введите год");
        int year = in.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Год високосный");
        }
        else {
            System.out.println("Год не високосный");
        }
        System.out.println();

        //Задача4
        System.out.println("Задача4");
        System.out.println("Введите расстояние");
        int deliveryDistance = in.nextInt();
        int days;
        if (deliveryDistance<=20) {
            days=1;
            System.out.println("Потребуется дней:" + days);
        }
        else if (deliveryDistance>20 && deliveryDistance<=60) {
            days=2;
            System.out.println("Потребуется дней:" + days);
        }
        else if (deliveryDistance>60 && deliveryDistance<=100) {
            days=3;
            System.out.println("Потребуется дней:" + days);
        }
        else if (deliveryDistance>100) {
            System.out.println("Доставки нет");
        }
        System.out.println();

        //Задача5
        System.out.println("Задача5");
        System.out.println("Введите месяц");
        int monthNumber = in.nextInt();
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Некорректные данные");
        }
        }
    }
