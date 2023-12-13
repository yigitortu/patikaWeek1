import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    // degiskenleri tanımlayalım
        int a, b ,c;

        Scanner inp = new Scanner(System.in);

        System.out.print("A sayısını giriniz : ");
        a = inp.nextInt();
        System.out.print("B sayısını giriniz : ");
        b = inp.nextInt();
        System.out.print("C sayısını giriniz : ");
        c = inp.nextInt();

        double total = a + b * c - b;

        System.out.println("İşlem sonucu : " + total);

    }
}