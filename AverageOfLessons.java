import java.util.Scanner;

public class AverageOfLessons {
        public static void main(String[] args) {

            int mat, fizik, kimya, turkce, tarih, müzik;

            Scanner inp = new Scanner(System.in);

            System.out.print("Matematik Notunuz:");
            mat = inp.nextInt();

            System.out.print("Fizik Notunuz:");
            fizik = inp.nextInt();

            System.out.print("Kimya Notunuz:");
            kimya = inp.nextInt();

            System.out.print("Türkçe Notunuz:");
            turkce = inp.nextInt();

            System.out.print("Tarih Notunuz:");
            tarih = inp.nextInt();

            System.out.print("Müzik Notunuz:");
            müzik = inp.nextInt();

            int sum = (mat + fizik + kimya + turkce + tarih + müzik);
            double result = sum / 6.0;
            System.out.println("Ortalamanız:" + result);

            String condition = (result < 60) ? "Sınıfta Kaldı" : "Sınıfı Geçti";
            System.out.println(condition);

        }
}