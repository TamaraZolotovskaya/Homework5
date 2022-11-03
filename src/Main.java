public class Main {
    public static void main(String[] args) {
//Задача 1
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 1) System.out.println("Установите версию приложения для Android по ссылке");
        if (clientOS == 0) System.out.println("Установите версию приложения для iOS по ссылке");
        //Задача 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2015;
        if (clientOS == 1) {
            if (clientDeviceYear < 2015)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            else System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 0) {
            if (clientDeviceYear < 2015)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            else System.out.println("Установите версию приложения для iOS по ссылке");
        }
        //Задача 3
        System.out.println("Задание 3");
        int year = 2021;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println(year + " год является високосным");
        else System.out.println(year + " год не является високосным");
        //Задача 4
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int distanse1 = 20;
        int time1 = 1;
        int distanse2 = 60;
        int time2 = 2;
        int distanse3 = 100;
        int time3 = 3;
        if (deliveryDistance <= distanse1) System.out.println("Потребуется дней " + time1);
        else if (deliveryDistance <= distanse2) System.out.println("Потребуется дней " + time2);
        else if (deliveryDistance <= distanse3) System.out.println("Потребуется дней " + time3);
        else System.out.println("Вы слишком далеко живёте. Мы не сможем доставить вам карту");
        //Задача 5
        System.out.println("Задание 5");
        int monthNumber = 12;
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
                System.out.println("Такого месяца не существует");
        }
    }
}