import java.util.*;

public class Latihan1 {
    public static void main(String[] args) {

        Set<String> daftarBuku = new TreeSet<>();
        
        daftarBuku.add("Dilan 1990");
        daftarBuku.add("Laskar Pelangi");
        daftarBuku.add("Mahaguru");
        daftarBuku.add("Mengejar Matahari");
        daftarBuku.add("Dilan 1991");
        daftarBuku.add("Milea");
        daftarBuku.add("Perahu Kertas");
        
        daftarBuku.add("Laskar Pelangi"); 
        daftarBuku.add("Perahu Kertas");

        System.out.println("Daftar Buku (Urut Abjad & Tanpa Duplikat):");
        
        Iterator<String> it = daftarBuku.iterator();
        
        while(it.hasNext()){
            System.out.println("- " + it.next());
        }
    }
}