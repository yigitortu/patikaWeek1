import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Degiskenleri tanimlayalim.

        double armut, elma, domates, muz, patlican ;
        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.00;

        Scanner inp = new Scanner(System.in);

        System.out.print("Armut KG bilgisini giriniz : ");
        armut = inp.nextDouble();
        System.out.print("Elma KG bilgisini giriniz : ");
        elma = inp.nextDouble();
        System.out.print("Domates KG bilgisini giriniz : ");        // Kaç KG bilgisini kullanıcıdan isteyelim.
        domates = inp.nextDouble();
        System.out.print("Muz KG bilgisini giriniz : ");
        muz = inp.nextDouble();
        System.out.print("Patlıcan KG bilgisini giriniz : ");
        patlican = inp.nextDouble();

        //Sistemde kayıtlı olan Fiyatlar ile kullanıcıdan aldığımız KG bilgisini hesaplayalım.
        double total = ((armut*armutFiyat) + (elma*elmaFiyat) + (domates*domatesFiyat) + (muz*muzFiyat) + (patlican*patlicanFiyat));


        System.out.println("Kasa toplamı : " + total + " TL.");


    }
}