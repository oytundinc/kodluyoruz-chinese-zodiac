import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Doğum Yılınızı Giriniz : ");
        int year = input.nextInt();

        if (year % 12 == 0) {
            System.out.println("Çin Zodyağı Burcunuz : Maymun");
        } else if (year % 12 == 1) {
            System.out.println("Çin Zodyağı Burcunuz : Horoz");
        } else if (year % 12 == 2) {
            System.out.println("Çin Zodyağı Burcunuz : Horoz");
        } else if (year % 12 == 3) {
            System.out.println("Çin Zodyağı Burcunuz : Köpek");
        } else if (year % 12 == 4) {
            System.out.println("Çin Zodyağı Burcunuz : Domuz");
        } else if (year % 12 == 5) {
            System.out.println("Çin Zodyağı Burcunuz : Fare");
        } else if (year % 12 == 6) {
            System.out.println("Çin Zodyağı Burcunuz : Öküz");
        } else if (year % 12 == 7) {
            System.out.println("Çin Zodyağı Burcunuz : Kaplan");
        } else if (year % 12 == 8) {
            System.out.println("Çin Zodyağı Burcunuz : Ejderha");
        } else if (year % 12 == 9) {
            System.out.println("Çin Zodyağı Burcunuz : Yılan");
        } else if (year % 12 == 10) {
            System.out.println("Çin Zodyağı Burcunuz : At");
        } else if (year % 12 == 11) {
            System.out.println("Çin Zodyağı Burcunuz : Koyun");
        }
    }
}
