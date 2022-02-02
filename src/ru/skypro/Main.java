package ru.skypro;

public class Main {

    public static void main(String[] args) {
        byte clientOS2 = 1;
        int clientDeviceYear = 2014;
        if ( clientOS2 == 0 && clientDeviceYear <= 2014) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS2 == 1 && clientDeviceYear <= 2014) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите обычную версию");
        }
        }

    }

