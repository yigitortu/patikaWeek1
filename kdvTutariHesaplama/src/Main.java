import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    //değişken oluşturalım

        double tutar,kdvOran = 0.18, kdvTutar, kdvliTutar, yeniKdvTutar, sonTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Ücret tutarını giriniz :");
        tutar = input.nextDouble();
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        yeniKdvTutar = tutar <= 1000 ? ( tutar * 0.18) : (tutar * 0.08);
        sonTutar = tutar + yeniKdvTutar;


        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("Normal KDV Tutarı : " + kdvTutar);
        System.out.println("İndirimli Yeni KDV tutarı : " +yeniKdvTutar);

        System.out.println("Normal KDV'li Tutarı : " + kdvliTutar);
        System.out.println("Son KDV'li tutar : " + sonTutar);




    }
}