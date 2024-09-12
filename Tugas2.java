import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int jmlJamKerja, UpahPerJam;
       double bonus = 0.1, pajak = 0.05, totalBonus, totalGaji, totalPajak, gaji;
       System.out.println("Masukkan jumlah jam kerja");
       jmlJamKerja = input.nextInt();
       System.out.println("Masukkan jumlah upah per jam");
       UpahPerJam = input.nextInt();
       gaji = jmlJamKerja * UpahPerJam;
       totalBonus =  gaji * bonus;
       totalPajak = (gaji + totalBonus) * pajak;
       totalGaji =  gaji + totalBonus - totalPajak;
       System.out.println("Jumlah gaji anda adalah : " + totalGaji);
       System.out.println("Jumlah bonus anda adalah : " + totalBonus);
       System.out.println("Jumlah pajak anda adalah : " + totalPajak);

    }
}
