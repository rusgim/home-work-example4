package ru.skypro;

public class Main {

    public static void main(String[] args) {
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Андроид по ссылке");
        }

        byte clientOS2 = 1;
        int clientDeviceYear = 2014;
        if (clientOS2 == 0 && clientDeviceYear <= 2014) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS2 == 1 && clientDeviceYear <= 2014) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите обычную версию");
        }

        int year = 1000;
        if ((year % 4 == 0) && ((year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " не является високосным годом");
        }

        int deliveryDistance = 99;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1 день");
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2 дня");
        } else if (deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3 дня");
        }

        int monthNumber = 8;
        switch (monthNumber) {
            case 1:
            case 2:
            System.out.println("Сезон - зима");
                break;
            case 3:
            case 4:
            case 5:
            System.out.println("Сезон - весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон - это лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон - это осень");
                break;
            case 12:
                System.out.println("Сезон - это зима");
                break;
            default:
                System.out.println("Такого месяца не сущесвует");
        }
    }
}





