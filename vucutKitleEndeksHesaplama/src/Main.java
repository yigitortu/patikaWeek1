import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Degiskenleri tanımlayalım
        double kilo, boy;

        Scanner inp = new Scanner(System.in); // Scanner tanımlandı

        System.out.print("Lütfen boyunuzu (m) türünde giriniz : "); // Kullanıcıdan boy istenildi
        boy = inp.nextDouble();
        System.out.print("Lütfen kilonuzu (kg) türünde giriniz : ");    // Kullanıcıdan kilo istenildi
        kilo = inp.nextDouble();

         double vucutKitle = kilo / (boy*boy); // Kitle indeksi formulu

        System.out.println("Vücut kitle İndeksiniz : " + vucutKitle); // Son çıktı

    }
}