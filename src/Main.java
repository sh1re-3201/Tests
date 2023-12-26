import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
//    Mendeklarasikan scanner yang dipakai di seluruh method
    public static Scanner universal = new Scanner(System.in);

/*
  mendeklarasi variabel yang dipakai dalam kalkulasi
  a = angka pertama
  b =  angka kedua
  z = hasil
  pil = pilihan di menu memilih penjumlahan
*/
    public static double a, b, z;
    public static int pil;

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
        // Menu utama menggunakan perulangan dan Java Exception agar dapat digunakan dengan nyaman
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
            } catch (InputMismatchException e){// InputMismatchException berfungsi jika terdapat Input Mismatch program akan tetap berjalan
                System.out.println("Tolong masukkan data berupa angka.");
                System.out.println();
                utama.next();
            }
        }while (bahasa != 3);


    }
    static void indo(){
        Scanner masukkan = new Scanner(System.in);
        String judul = "Pilih operasi penghitungan yang akan anda lakukan";
        int panjangJudul = judul.length();
        /*
        TODO Java exception masih rusak HARUS DIPERBAIKI
         */
        try {
            do {
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
                pil = masukkan.nextInt();
                    switch (pil){
                        case 1:
                            System.out.println("Anda memilih operasi penjumlahan");
                            System.out.println();
                            System.out.print("Silahkan Masukkan angka pertama : ");
                            a = universal.nextDouble();
                            System.out.print("Silahkan Masukkan angka kedua   : ");
                            b = universal.nextDouble();
                            addition(a, b);
                            System.out.println("Hasil dari penjumlahan " + a + " dan " + b + " adalah = " + z);
                            menuAkhir();
                            break;

                        case 2:
                            System.out.println("Anda memilih operasi pengurangan");
                            System.out.println();
                            System.out.print("Silahkan masukkan angka pertama : ");
                            a = universal.nextDouble();
                            System.out.print("Silahkan Masukkan angka kedua   : ");
                            b = universal.nextDouble();
                            subtract(a, b);
                            System.out.println("Hasil dari pengurangan " + a + " dan " + b + " adalah = " + z);
                            menuAkhir();
                            break;

                        case 3:
                            System.out.println("Anda memilih operasi pembagian");
                            System.out.println();
                            System.out.print("Silahkan masukkan angka pertama : ");
                            a = universal.nextDouble();
                            System.out.print("Silahkan Masukkan angka kedua   : ");
                            b = universal.nextDouble();
                            div(a, b);
                            System.out.println("Hasil dari pembagian " + a + " dan " + b + " adalah = " + z);
                            menuAkhir();
                            break;

                        case 4:
                            System.out.println("Anda memilih operasi perkalian");
                            System.out.println();
                            System.out.print("Silahkan masukkan angka pertama : ");
                            a = universal.nextDouble();
                            System.out.print("Silahkan Masukkan angka kedua   : ");
                            b = universal.nextDouble();
                            multiplication(a, b);
                            System.out.println("Hasil dari perkalian " + a + " dan " + b + " adalah = " + z);
                            menuAkhir();
                            break;

                        default :
                            System.out.println("Pilihan anda salah\nSilahkan coba lagi");
                            break;

                    }




            }while (pil != 4);
        }catch (InputMismatchException b){
        System.out.println("Tolong masukkan data berupa angka.");
        System.out.println();
        masukkan.next();
        }


    }
//    Method untuk pilihan berbahasa inggris
    static void english(){

    }
//    Method untuk penjumlahan
    private static void addition(double a, double b){
        z = a + b;

    }
//    Method untuk pengurangan
    private static void subtract(double a, double b){
        z = a - b;

    }
//    Method untujk pembagian
    private static void div(double a, double b){
        z = a / b;

    }
//    Method untuk perkalian
    private static void multiplication(double a, double b){
        z = a * b;

    }
//    Method untuk menu akhir bahasa Indonesia
    static void menuAkhir(){
        Scanner akhir = new Scanner(System.in);
        int akhirPil;
        System.out.println("==================================================");
        System.out.println("Operasi anda selesai");
        System.out.println("==================================================");
        System.out.println();
        System.out.println("1. Kembali ke menu utama ");
        System.out.println("2. Keluar");
        System.out.print("Pilihan anda : ");
        akhirPil = akhir.nextInt();

        switch (akhirPil){
            case 1:
                indo();
                break;
            case 2:
                System.exit(0);
                break;
        }
    }
//    Method untuk menu akhir bahasa Inggris
    static void finalMenu(){

    }

}