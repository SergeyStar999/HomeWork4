public class Main {
    public static void main(String[] args) {

        // Задание 1

        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" " + i);
        }

        System.out.println();

        for (int b = 10; b > 0; b--) {
            System.out.print(" " + b);
        }

        System.out.println();

        // Задание 2

        for (int a = 2; a <= 31; a = a + 7) {
            System.out.println("Сегодня пятница, " + a + "-е число. Необходимо подготовить отчет");
        }

        // Задание 3

        int start = 1822;
        for (int year = 1822; year <= 2122; year++) {
            if (year %79 == 0) {
                System.out.println(year);
            }
        }
    }
}