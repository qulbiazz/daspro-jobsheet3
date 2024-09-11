import java.util.Scanner;

public class Siakad23{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama,nim;
        char Kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = input.nextLine();
        System.out.print("Masukkan Kelas: ");
        Kelas = input.nextLine().charAt(0);
        System.out.print("Masukkan Nomor Absen: ");
        absen = input.nextByte();

        System.out.println("-----Masukkan Komponen Nilai-----");
        System.out.print("Nilai Kuis: ");
        nilaiKuis = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        nilaiTugas = input.nextDouble();
        System.out.print("Nilai Ujian: ");
        nilaiUjian = input.nextDouble();
        
        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        System.out.println("Mahasiswa dengan nama " + nama + "NIM " + nim + "Kelas " + Kelas + "Absen " + absen);
        System.out.println("Nilai Akhir: " +nilaiAkhir);
    }
}