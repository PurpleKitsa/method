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

    public static boolean defineYear(int currentYear) {
        return currentYear % 4 == 0 && currentYear % 100 != 0 || currentYear % 400 == 0;
    }

    public static void printYear(int currentYear) {
        if (defineYear(currentYear)) {
            System.out.println(currentYear + " год является високосным");
        } else {
            System.out.println(currentYear + " год не является високосным");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        defineAppVersionAndOs(0, 2022);
    }

    public static void defineAppVersionAndOs(int mobileOs, int mobileYear) {
        String os = defineOsName(mobileOs);
        String versionApp = defineAppVersion(mobileYear);

        System.out.println(" Установите версию " + versionApp + " для " + os);
    }

    public static String defineOsName(int mobileOS) {
        if (mobileOS == 0) {
            return "IOS";
        } else {
            return "Android";
        }
    }

    public static String defineAppVersion(int mobileYear) {
        int currentYear = LocalDate.now().getYear();

        if (currentYear != mobileYear) {
            return "облегченную";
        } else {
            return "обычную";
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        printDefineCardDeliveryDays(deliveryDistance);
    }

    public static int defineCardDeliveryDays(int deliveryDistance) {
        int deliveryDays;
        if (deliveryDistance <= 19) {
            deliveryDays = 1;
        } else if (deliveryDistance <= 59) {
            deliveryDays = 2;
        } else if (deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = 0;
        }
        return deliveryDays;
    }
    public static void printDefineCardDeliveryDays(int deliveryDistance) {
        System.out.println("Потребуется дней " + defineCardDeliveryDays(deliveryDistance));
    }
}
