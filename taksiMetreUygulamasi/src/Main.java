import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Degiskenleri tanımlayalım

        double km, perKm = 2.20, total = 10;

        Scanner input = new Scanner(System.in); // Scanner class'ını çağıralım.

        System.out.print("Lütfen Mesafeyi (KM) Cinsinden giriniz : ");
        km = input.nextDouble(); // Kullanıcıdan KM 'yi istedik.

        total += (km * perKm); // Katedilen KM ile Km başına olan ücreti çarptık ve başlangıç ücretini ekledik

        total = (total < 20) ? 20 : total; //Tutar Minimum 20TL olucak şekilde ayarlı.

        System.out.print("Toplam tutar : " +total);





    }
}