import java.util.Scanner;

public class Siakad23{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama,nim;
        String Kelas;
        byte absen;
        int nilaiKuis, nilaiTugas, nilaiUjian, nilaiUAS, nilaiAkhir;

        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = input.nextLine();
        System.out.print("Masukkan Kelas: ");
        Kelas = input.nextLine();
        System.out.print("Masukkan Nomor Absen: ");
        absen = input.nextByte();

        System.out.println("-----Masukkan Komponen Nilai-----");
        System.out.print("Nilai Kuis: ");
        nilaiKuis = input.nextInt();
        System.out.print("Nilai Tugas: ");
        nilaiTugas = input.nextInt();
        System.out.print("Nilai Ujian: ");
        nilaiUjian = input.nextInt();
        System.out.print("Nilai UAS: ");
        nilaiUAS = input.nextInt();
        
        nilaiAkhir = (int) ((nilaiKuis*0.2) + (nilaiTugas*0.15) + (nilaiUjian*0.3) + (nilaiUAS*0.35));
        double totalnilaiakhir = nilaiAkhir / 4;

        System.out.println("Mahasiswa dengan nama " + nama + " NIM " + nim + " Kelas " + Kelas + " Absen " + absen);
        System.out.println("Nilai Akhir: " +totalnilaiakhir);
    }
}