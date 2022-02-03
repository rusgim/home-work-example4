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
        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь - это зима");
                break;
            case 2:
                System.out.println("Февраль - это зима");
                break;
            case 3:
                System.out.println("Март - это весна");
                break;
            case 4:
                System.out.println("Апрель - это весна");
                break;
            case 5:
                System.out.println("Май - это весна");
                break;
            case 6:
                System.out.println("Июнь - это лето");
                break;
            case 7:
                System.out.println("Июль - это лето");
                break;
            case 8:
                System.out.println("Август - это лето");
                break;
            case 9:
                System.out.println("Сентябрь - это осень");
                break;
            case 10:
                System.out.println("Октябрь - это осень");
                break;
            case 11:
                System.out.println("Ноябрь - это осень");
                break;
            case 12:
                System.out.println("Декабрь - это зима");
                break;
            default:
                System.out.println("Такого дня не существует");
        }
    }
    }





