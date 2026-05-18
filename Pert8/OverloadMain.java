public class OverloadMain {
    
    // 1. Method main standar (Entry Point)
    public static void main(String[] args) {
        System.out.println("Running main standar dengan String[] args");
        
        // Memanggil overload method main
        main("Yona"); 
        main(20, 2026);
    }

    // 2. Overload main dengan 1 parameter String
    public static void main(String user) {
        System.out.println("Hello, " + user + "! Ini main overload pertama.");
    }

    // 3. Overload main dengan 2 parameter int
    public static void main(int umur, int tahun) {
        System.out.println("Umur: " + umur + " di tahun " + tahun);
    }
}