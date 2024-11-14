//import java.util.Scanner;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
////public class Main {
////    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("Masukan Nama Anda: ");
////        String nama = scanner.nextLine();
////
////        System.out.println("Hallo, " + nama + "!");
////        if(nama.equals("Risa")) {
////            System.out.println("Apa Kabar!");
////        }else {
////            System.out.println("Kenalan Yuuk!");
////        }
////
////        scanner.close();
//
////        int kurang = a - b;
////        int kali = a * b;
////        int bagi = a / b;
////        int tambah = a + b;
////
////        System.out.println(kurang);
////        System.out.println(kali);
////        System.out.println(bagi);
////        System.out.println(tambah);
////
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("Hitungin Doongs: ");
////        String Hasil = scanner.nextLine();
////
////        System.out.println();
////
////        scanner.close();
//
//
//
//
////        System.out.println("Selamat Pagi Dunia Tipu-Tipu");
////            String nama = "Adi Dolmi";
////
////            System.out.println("Nama Saya " + nama);
//
////            int a = 24;
////            int b = 16;
////
////            int kurang = a - b;
////            int kali = a * b;
////            int bagi = a / b;
////
////            System.out.println(a + b);
////            System.out.println(a % b);
////            System.out.println(kurang);
////            System.out.println(kali);
////            System.out.println(bagi);
//
//        // Operator Logika Atau, Dan, & Bukan
////        System.out.println(true || true);
////        System.out.println(true || false);
////        System.out.println(false || true);
////        System.out.println(false || false);
////
////        System.out.println(true && true);
////        System.out.println(true && false);
////        System.out.println(false && true);
////        System.out.println(false && false);
////
////        System.out.println(!false);
////        System.out.println(!true);
////
////        System.out.println(true && !(true || false));
//
////        boolean aturan = makan || minum;
////        System.out.println(makan && minum);
////        System.out.println(aturan);
//
//        // < > == <= >=
//
////        int a = 30;
////        int b = 31;
////
////        System.out.println(a <= b);
//
////        int saldo = 500;
////        int tarik = 700;
////
////        if (tarik <= saldo)
////        {
////            System.out.println("saldo berhasil ditarik, tapi bayar upeti");
////        } else if (tarik > 1000 && tarik <= saldo) {
////            System.out.println("Saldo berhasil ditarik");
////        }
////        }else {
////        System.out.println("Kerja Lagi Gaaan");
//
//
////        int saldo = 2000;
////        int tarik = 900;
////
////        if (tarik <= saldo) {
////            if (tarik > 1000) {
////                System.out.println("Saldo berhasil ditarik");
////            } else {
////                System.out.println("saldo berhasil ditarik, tapi bayar upeti");
////            }
////        } else {
////            System.out.println("Kerja Lagi Gaaan");
////        }
//
//
////        int cek = 1;
////        while (cek <=10){
////            System.out.println("looping");
////
////            cek = cek + 1;
////        }
////
////        for (int i = 1; i <= 10; i++){
////            System.out.println("looping" + i);
////        }
////    }
//
//
//
//public class Main {
//    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////
////        System.out.print("Masukkan angka pertama Cooy: ");
////        int a = scanner.nextInt();
////
////        System.out.print("Masukkan angka kedua Cuuuy!): ");
////        int b = scanner.nextInt();
////
////
////        System.out.print(a + b);
////
////        int kurang = a - b;
////        int kali = a * b;
////        int bagi = a / b;
////        int tambah = a + b;
////
////        System.out.println("Hasil pengurangan: " + kurang);
////        System.out.println("Hasil perkalian: " + kali);
////        System.out.println("Hasil pembagian: " + bagi);
////        System.out.println("Hasil penjumlahan: " + tambah);
////
////        scanner.close();
//
//        Scanner scanner = new Scanner(System.in);
//        boolean kondisi = true;
//        while (kondisi) {
//            System.out.print("Masukkan angka pertama Cooy: ");
//            int a = Integer.parseInt(scanner.nextLine());
//            System.out.print("Masukkan angka kedua Cuuuy!): ");
//            int b = Integer.parseInt(scanner.nextLine());
//            System.out.print("Masukan Operator: ");
//            String op = scanner.nextLine();
//
//            if (op.equals("+")) {
//                System.out.print(a + b);
//            } else if (op.equals("-")) {
//                System.out.print(a - b);
//            } else if (op.equals("x")) {
//                System.out.print(a * b);
//            } else if (op.equals(":")) {
//                System.out.print(a / b);
//            } else if (op.equals("%")) {
//                System.out.print(a % b);
//            } else {
//                System.out.print("Input Tidak Valid");
//            }
//            System.out.print("Lanjut?");
//            String tanya = scanner.nextLine();
//            if (tanya.equals("ya")) {
//                kondisi = true;
//            } else {
//                kondisi = false;
//            }
//        }
//        scanner.close();


import java.util.Scanner;

     class Biodata {
        String nama;
        String hobi;
        int umur;

        Biodata (String nama, String hobi, int umur) {
            this.nama = nama;
            this.hobi = hobi;
            this.umur = umur;
        }

        public static int test(){
            return 100;
        }

        public static void coba (int a){
            if (a == 7){
                System.out.println("Oke");
            }
        }
        void menyapa(){
            System.out.println("Hallo saya " + nama);
        }
    }

    public class Main {
        public static void calc(int a, int b, String op){
            if (op.equals("+")) {
                System.out.println("Hasil: " + (a + b));
            } else if (op.equals("-")) {
                System.out.println("Hasil: " + (a - b));
            } else if (op.equals("x")) {
                System.out.println("Hasil: " + (a * b));
            } else if (op.equals(":")) {
                if (b != 0) {
                    System.out.println("Hasil: " + (a / b));
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                }
            } else if (op.equals("%")) {
                if (b != 0) {
                    System.out.println("Hasil: " + (a % b));
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                }
            } else {
                System.out.println("Input Tidak Valid");
            }
        }
        public static void main(String[] args) {
            Biodata datasaya = new Biodata("risa", "Makan", 70);

            datasaya.menyapa();
            System.out.println(datasaya.hobi);
            System.out.println(datasaya.test());


//                Scanner scanner = new Scanner(System.in);
//                boolean kondisi = true;
//                while (kondisi) {
//                    System.out.print("Masukkan angka pertama Cooy: ");
//                    int a = Integer.parseInt(scanner.nextLine());
//                    System.out.print("Masukkan angka kedua Cuuuy!: ");
//                    int b = Integer.parseInt(scanner.nextLine());
//                    System.out.print("Masukkan Operator (+, -, x, :, %): ");
//                    String op = scanner.nextLine();
//
//                    calc(a,b, op);
//
//                    System.out.print("Lanjut? (ya/tidak): ");
//                    String tanya = scanner.nextLine();
//                    if (tanya.equalsIgnoreCase("ya")) {
//                        kondisi = true;
//                    } else {
//                        kondisi = false;
//                    }
//                }
//                scanner.close();
            }
        }













