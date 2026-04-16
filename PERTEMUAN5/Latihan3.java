import java.util.*;

public class Latihan3 {
    public static void main(String[] args) {
        Map<String, String> dataDev = new HashMap<>();
        
        dataDev.put("Microsoft", "Bill Gates");
        dataDev.put("Apple", "Steven Paul Jobs");
        dataDev.put("Linux", "Linux Benedict Torvalds");
        dataDev.put("Facebook", "Mark Zuckerberg");
        dataDev.put("Twitter", "Jack Dorsey");
        dataDev.put("Instagram", "Kevin Systrom");

        System.out.println("Laporan Data Pengembang:");
        
        for (String key : dataDev.keySet()) {

            String keyUpper = key.toUpperCase();
            
            String value = dataDev.get(key);
            
            System.out.println("PERUSAHAAN: " + keyUpper);
            System.out.println("FOUNDER   : " + value);
            System.out.println("---------------------------");
        }
    }
}