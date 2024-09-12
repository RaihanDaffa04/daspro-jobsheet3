import java.util.Scanner;

public class Tugas1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tarifListrik = 1500;
        double jmlPenggunaan, tagihanListrik;
        boolean batasPenggunaan;
        System.out.println("Masukkan jumlah penggunaan listrik dalam kWh");
        jmlPenggunaan = input.nextDouble();
        batasPenggunaan = jmlPenggunaan > 500;
        tagihanListrik = tarifListrik * jmlPenggunaan;
        System.out.println("Jumlah tagihan listrik anda adalah : " + tagihanListrik);
        System.out.println("apakah penggunaan listrik melebihi 500 kWh : " + batasPenggunaan);

        
    }
}
