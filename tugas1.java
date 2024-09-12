import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tarifListrik = 1500;
        boolean penggunaanListrik;
        double totalTagihan, jumlahPenggunaan;

        System.out.print("Masukkan Jumlah Penggunaan Listrik: ");
        jumlahPenggunaan = input.nextDouble();

        penggunaanListrik = jumlahPenggunaan > 500;
        totalTagihan = tarifListrik * jumlahPenggunaan;

        System.out.println("Jumlah Tagihan: " +totalTagihan);
        System.out.println("Apakah Tagihan Melebihi 500 kWh? " +penggunaanListrik);
    }
}
