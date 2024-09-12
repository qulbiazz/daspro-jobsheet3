import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jamKerja, upahPerJam;
        double bonus = 0.1, pajak = 0.05, jmlGaji, gaji;

        System.out.print("Jumlah Jam Kerja: ");
        jamKerja = input.nextInt();
        System.out.print("Upah Per Jam: ");
        upahPerJam = input.nextInt();

        gaji = jamKerja * upahPerJam;
        jmlGaji = gaji * bonus + gaji;
        jmlGaji = jmlGaji - (jmlGaji*pajak)  ;
        

        System.out.println("Jumlah gaji: " +jmlGaji);
        
        
    }
}
