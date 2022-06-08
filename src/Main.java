public class Main {

    public static void defineLeapYear(int year) {

        if ((year % 4 == 0 && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + "yearIsLeapYear");
        } else
            System.out.println(year + "yearIsNotLeapYear");
    }

    public static void main(String[] args) {
        defineLeapYear(2000);
        defineOs(1);
        defineVersion(2017, 1);
        defineDeliveryTime(60);
        defineDouble("abcdefghijk");
    }

    public static void defineOs(int clientOs) {
        if (clientOs == 0) {
            System.out.println("Follow the link to install IOS app");
        }
        if (clientOs == 1) {
            System.out.println("Follow the link to install Android app");
        }
    }

    public static void defineVersion(int clientDeviceYear, int clientOs) {
        if (clientDeviceYear < 2015 && clientOs == 0) {
            System.out.println("Install the light version of the IOS app from the link");
        } else if (clientDeviceYear >= 2015 && clientOs == 0) {
            System.out.println("Install the Standard version of the IOS app from the link");
        }
        if (clientDeviceYear < 2015 && clientOs == 1) {
            System.out.println("Install the light version of the Android app from the link");
        } else if (clientDeviceYear >= 2015 && clientOs == 1) {
            System.out.println("Install the Standard version of the Android app from the link");
        }
    }

    public static void defineDeliveryTime(int deliveryDistance) {

        if (deliveryDistance < 20) {
            System.out.println("DeliveryTime  1 day");
        }
        if (deliveryDistance >= 20) {
            System.out.println("DeliveryTime  1 day +24 hours");
        } else if (deliveryDistance >= 60) {
            System.out.println("DeliveryTime  1 day +  48 hours");
        }
    }

    public static void defineDouble (String str) {
            for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                System.out.println("There is a double symbol" + str.charAt(i));
                break;
            }
            if (i == str.length()-2) {
                System.out.println("There are no doubles");
            }}}}
