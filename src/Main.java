public class Main {
    public static void main(String[] args) {
        ///////Task1////
        System.out.println("///////Task1////");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        ///////Task2////
        System.out.println("///////Task2////");
        int clientsOS = 0;
        int clientDeviceAge = 2022;

        if (clientsOS == 0) {
            if (clientDeviceAge < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceAge < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");

            }
        }
        ///////Task3////
        System.out.println("///////Task3////");
        int year = 2021;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }
        ///////Task4////
        System.out.println("///////Task4////");
        int deliveryDis = 95;

        int deliveryDays = 1;

        if (deliveryDis > 20) {
            deliveryDays++;
        }

        if (deliveryDis > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней: " + deliveryDays);
    }
}





















