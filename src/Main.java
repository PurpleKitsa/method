import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1");
        printYear(2022);
    }
    public static boolean year(int currentYear) {
        return currentYear % 4 == 0 && currentYear % 100 != 0 || currentYear % 400 == 0;
    }
    public static void printYear(int currentYear) {
        if (year(currentYear)) {
            System.out.println(currentYear + " год является високосным");
        } else {
            System.out.println(currentYear + " год не является високосным");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        appVersionAndOs(0, 2022);
    }
    public static void appVersionAndOs(int mobileOs, int mobileYear) {
        String os = osName(mobileOs);
        String versionApp = appVersion(mobileYear);

        System.out.println(" Установите версию " + versionApp + " для " + os);
    }
    public static String osName(int mobileOS) {
        if (mobileOS == 0) {
            return "IOS";
        } else {
            return "Android";
        }
    }
    public static String appVersion(int mobileYear) {
        int currentYear = LocalDate.now().getYear();

        if (currentYear < 2015) {
            return "облегченную";
        } else {
            return "обычную";
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        cardDeliveryDays(95);
    }
    public static int cardDeliveryDays(int deliveryDistance) {

        if (deliveryDistance <= 19) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance <= 59) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }

        return deliveryDistance;
    }
}

