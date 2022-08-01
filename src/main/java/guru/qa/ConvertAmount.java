package guru.qa;

import java.util.Scanner;


public class ConvertAmount {

    static int[] frankArray;
    static double[] roublesArray;
    static int n;
    static int i;
    static int ROUB_PER_FRAN;


    static void first() {
        Scanner input = new Scanner(System.in);


        do {
            System.out.print("Введите корректный курс покупки швейцарского франка за рубли: ");
            ROUB_PER_FRAN = input.nextInt();
        } while (ROUB_PER_FRAN <= 0);

        instruct();

        do {
            System.out.print("Введите корректное число конвертаций: ");
            n = input.nextInt();
        } while (n <= 0);

        System.out.print("Введите " + n + " сумм денег в швейцарских франках: ");
        frankArray = new int[n];
        for (i = 0; i < n; i++) {
            frankArray[i] = input.nextInt();
        }

        roublesArray = find_rubles(frankArray, n);

        System.out.println("\n    Сумма, R   Сумма, F");
        for (i = 0; i < n; i++) {
            System.out.println("\t   " + frankArray[i] + "   \t  " + (int) (roublesArray[i] * 100) / 100.0);
        }
    }

    public static void instruct() {
        System.out.println("Эта программа конвертирует сумму денег "
                + "из швейцарских франков в российские рубли.");
        System.out.println("Курс покупки равен " + ROUB_PER_FRAN + "рубля.\n");
    }

    public static double[] find_rubles(int[] frankArray, int n) {
        double[] rublessArray = new double[n];
        int i;

        for (i = 0; i < n; i++) {
            rublessArray[i] = ROUB_PER_FRAN * frankArray[i];
        }

        return rublessArray;
    }
}