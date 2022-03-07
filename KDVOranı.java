
import java.util.Scanner;

public class KDVOranı {
    public static void main(String[] args) {


        double Tutar, KdvOrani = 0.18;

        Scanner inp = new Scanner(System.in);

        System.out.print("Tutar giriniz:");
        Tutar=inp.nextInt();

        KdvOrani=(0<Tutar && Tutar<1000? 0.18:0.08 );

        Tutar=Tutar+(Tutar*KdvOrani);

        System.out.println("Toplam değer:"+Tutar);


    }
}
