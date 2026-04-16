import java.util.*;

public class Latihan2 {
    public static void main(String[] args) {
        Set<String> daftarBuku = new TreeSet<>();
        // (Asumsikan data sudah terisi seperti Latihan 1)
        daftarBuku.add("Dilan 1990");
        daftarBuku.add("Laskar Pelangi");
        daftarBuku.add("Mahaguru");

        String target = "Mahaguru";
        if (daftarBuku.contains(target)) {
            System.out.println("Hasil: Buku '" + target + "' tersedia di perpustakaan.");
        } else {
            System.out.println("Hasil: Maaf, buku tidak ditemukan.");
        }

        System.out.println("\nIsi Koleksi (Cetak dengan For-Each):");
        for (String buku : daftarBuku) {
            System.out.println("> " + buku);
        }
    }
}