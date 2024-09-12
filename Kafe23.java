import java.util.Scanner;

public class Kafe23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 / 100f;
        double totalHarga, nominalBayar; 

        System.out.print("Masukkan Keanggotaan (True/Fakse): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan Jumlah Pembelian Kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("Masukkan Jumlah Pembelian Teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukkan Jumlah Pembelian Roti: ");
        jmlRoti = input.nextInt();

        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Keanggotaan Pelanggan: " +keanggotaan);
        System.out.println("Item Pembelian: " + jmlKopi + " Kopi, " + jmlTeh + " Teh, " + jmlRoti + " Roti");
        System.out.println("Nominal Bayar Rp " +nominalBayar);

    }
}
