import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Degiskenleri tanımlayalım
        int r;
        double pi = 3.14;
        double alpha;

        Scanner input = new Scanner(System.in); // Kullanıcıdan veri alma tanımlandı.

        System.out.print("Yarı çap giriniz : ");
        r = input.nextInt();
        System.out.print("Merkez açı ölçüsünü giriniz : ");
        alpha = input.nextDouble();;

        double formul = (pi * (r*r)* alpha ) / 360;

        System.out.println("Daire dilimini alanı : " + formul);



    }
}