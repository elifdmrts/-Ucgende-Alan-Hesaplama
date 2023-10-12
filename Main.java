import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double cevre, alan, a, b, c, u;
        Scanner untıl = new Scanner(System.in);
        System.out.print("1. kenar uzunluğunu giriniz: ");
        a = untıl.nextInt();
        System.out.print("2. kenar uzunluğunu giriniz: ");
        b = untıl.nextInt();
        System.out.print("3 kenar uzunluğunu giriniz: ");
        c = untıl.nextInt();

        u = (a + b + c) / 2;
        cevre = 2 * u;
        System.out.println("Üçgenin Çevresi: " + cevre);
        alan = Math.sqrt(u * (u - a) * (u - a) * (u - c));

        System.out.println("Üçgenin Alanı: " + alan);

    }
}