import java.util.Scanner;

public class kasirMakanan {
    public static void main(String[] args) {
        
        System.out.println("Menu Makanan");
        System.out.println("1. Soto Ayam (15.000)");
        System.out.println("2. Rawon Daging (17.000)");
        System.out.println("3. Mie Goreng (5.000)");
        System.out.println("4. Tahu Telor (8.000)");
        System.out.println("5. Sate Kambing (20.000)");

        int soto, rawon, mie, tahu, sate;

        soto = 15000;
        rawon = 17000;
        mie = 5000;
        tahu = 8000;
        sate = 20000;

        int jumlahBeliSoto, jumlahBeliRawon, totalSoto, totalRawon, total, kembali, bayar;

        Scanner inputJumlahSoto = new Scanner(System.in);
        System.out.print("Jumlah Beli Soto: ");
        jumlahBeliSoto = inputJumlahSoto.nextInt();
        
        Scanner inputJumlahRawon = new Scanner(System.in);
        System.out.print("Jumlah Beli Rawon: ");
        jumlahBeliRawon = inputJumlahRawon.nextInt();

        totalSoto = jumlahBeliSoto * soto;
        totalRawon = jumlahBeliRawon * rawon;

        total = totalSoto + totalRawon;

        System.out.println("Total Pembelian: " + total);
        System.out.print("Masukkan Pembayaran: ");
        
        Scanner inputBayar = new Scanner(System.in); 
        bayar = inputBayar.nextInt();
        kembali = bayar - total;

        System.out.println("Jumlah Kembali: " + kembali);
    }
}





