import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {
        int km;
        double perKm=2.20,total,startPrice=10;

        Scanner girdi=new Scanner(System.in);
        System.out.print("Mesafeyi Km cinsinden giriniz:");
        km= girdi.nextInt();

        total=(km*perKm);
        total+=startPrice;


        total=(total<20)? 20:total;
        System.out.println("Ödenmesi gereken ücret:"+total);
    }
}
