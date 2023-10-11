import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Bir dizi tanımlayalım
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //Kullanıcıdan indis değerini isteyelim
        Scanner input = new Scanner(System.in);
        System.out.print(" Lütfen Bir İndis Giriniz : ");
        int i = input.nextInt();
        //Try-Catch içerisinde girilen verinin, dizi sınırları içinde olup olmadığını kontrol edelim
        try {
        //Girilen indis değeri, dizi içerisinde ise ekrana karşılık gelen veriyi bastıralım
            System.out.println("Girdiğiniz veri :" + list[i]);
        } catch (Exception e) {
        //Girilen indis değeri ,dizi dahilinde değil ise ekrana hata mesajı basalım
            System.out.println("Girdiğiniz İndisin Dizide Bir Karşılığı Yok !");
        //Programın tamamlandığını bildirelim
        } finally {
            System.out.println("Program tamamlandı!");
        }
    }
}