package ru.skypro;

public class Main {

    public static void main(String[] args) {
        byte clientOS2 = 1;
        int clientDeviceYear = 2014;
        if (clientOS2 == 0 && clientDeviceYear <= 2014) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS2 == 1 && clientDeviceYear <= 2014) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите обычную версию");
        }

        int year = 2001;
        if (( year % 4 == 0) && ((year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println( year + " не является високосным годом");
        }

        int deliveryDistance = 99;
        if (deliveryDistance < 20) {
        System.out.println("Потребуется дней: 1 день");
    } else {
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2 день");
        } else {
            if (deliveryDistance >= 60 && deliveryDistance < 100) {
                System.out.println("Потребуется дней: 3 дня");
            }
        }
    }
    }
    }





