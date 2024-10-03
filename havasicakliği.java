import java.util.Scanner;
/*Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
Ödev */

public class havasicakliği {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Bir Sicaklik Derecesi Giriniz:");
        double degree;
        degree = scan.nextDouble();

        if (degree < 5) {
            System.out.println("Kayak Yapmak İcin Uygun Hava Kosulu :)");
        } else if (degree >= 5 && degree <= 15) {
            System.out.println("Sinema icin Güzel Hava");
        } else if (degree >= 15 && degree <= 25) {
            System.out.println("Piknik İcin Mükemmel Hava");
        }
        else if (degree < 40){
            System.out.println("Yüzmek İcin Harika Zaman");
        }
        else {
            System.out.println("Disarisi Cok Sicak Bu Senin icin Ölümcül ve Tehlikeli Olabilir");
        }
    }
}
