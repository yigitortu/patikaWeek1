import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    // Degiskenleri olustur
    int mat, fizik, kimya, turkce, tarih, muzik;

    //Scanner sınıfımızı tanımladık
    Scanner inp = new Scanner(System.in);

    //Kullanıcıdan değeri al
        System.out.print("Matematik notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6.0;
        System.out.println("Ortalamanız : " + ortalama);

        String kosul = ortalama > 60 ? "Sınıfı başarıyla geçtiniz" : "Sınıfta kaldınız";

        System.out.print("Mevcut durumunuz : " + kosul);
    }
}