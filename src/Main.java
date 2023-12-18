import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static Scanner universal = new Scanner(System.in);

    public static int a, b, z;
    public static void main(String[] args) {
        Scanner utama = new Scanner(System.in);
        String title = "Calculator Program";
        int titleLength = title.length();

        System.out.println(title);
        for (int i = 0; i <= titleLength; i++) {
            System.out.print("=");
        }
        int bahasa = 0;

        System.out.println();
        System.out.println();
        do {
            try{
                System.out.println("Pilih Bahasa\nChoose a Language");
                System.out.println();
                System.out.println("1. Bahasa Indonesia");
                System.out.println("2. English");
                System.out.println("3. Keluar");
                System.out.print("1/2 : ");
                bahasa = utama.nextInt();

                switch (bahasa){
                    case 1:
                        System.out.println("Selamat Datang!");
                        System.out.println();
                        indo();
                        break;

                    case 2:
                        System.out.println("Welcome!");
                        english();
                        break;

                    case 3:
                        System.out.println("Terima kasih!");
                        System.exit(0);

                    default:
                        System.out.println("Pilihan yang anda masukkan salah silahkan coba lagi");
                        System.out.println("Your input is wrong please try again");
                        System.out.println();
                        break;
                }
            } catch (InputMismatchException e){
                System.out.println("Tolong masukkan data berupa angka.");
                System.out.println();
                utama.next();
            }
        }while (bahasa != 3);


    }
    static void indo(){
        Scanner masukkan = new Scanner(System.in);
        String judul = "Pilih operasi penghitungan yang akan anda lakukan";
        int pilihan = 0;
        int panjangJudul = judul.length();
        do {
            try{
                System.out.println(judul);
                for (int i = 0; i <= panjangJudul; i++) {
                    System.out.print("=");
                }
                System.out.println();
                System.out.println();
                System.out.println("1. [+]");
                System.out.println("2. [-]");
                System.out.println("3. [÷]");
                System.out.println("4. [*]");
                System.out.println();
                System.out.print("Masukkan pilihan anda dalam bentuk angka : ");
                pilihan = masukkan.nextInt();
                try {
                    switch (pilihan){
                        case 1:
                            System.out.println("Anda memilih operasi penjumlahan");
                            System.out.println();
                            System.out.print("Masukkan angka pertama : ");
                            a = universal.nextInt();
                            System.out.print("Masukkan angka kedua   : ");
                            b = universal.nextInt();
                            addition(a, b);
                            System.out.println("Hasil dari penjumlahan " + a + " dan " + b + " adalah = " + z);
                    }
                }catch (InputMismatchException e){
                    System.out.println("Tolong masukkan data berupa angka.");
                    System.out.println();
                    masukkan.next();
                }

            }catch (InputMismatchException e){
                System.out.println("Tolong masukkan data berupa angka.");
                System.out.println();
                masukkan.next();
            }

        }while (pilihan != 4);
    }
    static void english(){

    }
    private static void addition(int a, int b){
        z = a + b;

    }
}