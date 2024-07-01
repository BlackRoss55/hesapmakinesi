import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, islem, sonuc;

        System.out.println("a sayısını giriniz");
        a = sc.nextInt();
        System.out.println("b sayısını giriniz");
        b = sc.nextInt();

        System.out.println("Yapmak istediğiniz işlemi seçiniz\n1)Toplama\n2)Çıkarma\n3)Çarpma\n4)Bölme");
        islem = sc.nextInt();

        switch(islem){
            case 1:System.out.println("İşlem sonucu: "+(a+b));break;
            case 2:System.out.println("İşlem sonucu: "+(a-b));break;
            case 3:System.out.println("İşlem sonucu: "+(a*b));break;
            case 4:System.out.println("İşlem sonucu: "+(a/b));break;
            default:
                System.out.println("Geçersiz işlem seçimi");break;

        }

    }
}