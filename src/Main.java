public class Main {

    public static void defineLeapYear (int year) {

            if ((year % 4 == 0 && (year % 100 != 0)) ||(year % 400 == 0)) {
                    System.out.println(year + "yearIsLeapYear");
            } else
            System.out.println(year + "yearIsNotLeapYear");}


            public static void main(String[] args) {
            defineLeapYear (2000);}}