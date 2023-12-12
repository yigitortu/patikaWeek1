import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenleri atayalım
        double a,b,hipotenus;

        Scanner deger= new Scanner(System.in);

        // Kenar uzunluklarını istemek için oluşturulan sorgu
        System.out.print("Kenar 1'in uzunluğunu giriniz : ");
        a = deger.nextDouble();
        System.out.print("Kenar 2'nin uzunluğunu giriniz : ");
        b = deger.nextDouble();

        //Hipotenusu hesaplamak için
        hipotenus = (a*a) + (b*b);

        System.out.println("Hipotenüsün uzunluğu : " + hipotenus + " cm'dir.");
    }
}