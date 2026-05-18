package polymorphism;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		BangunDatar bd;
		Scanner inputan = new Scanner(System.in);
		
		SegiEmpat persegiPanjang = new SegiEmpat();
		bd = persegiPanjang;

		System.out.print("Masukkan Panjang: ");
		bd.panjang = inputan.nextDouble();

		System.out.print("Masukkan Lebar: ");
		bd.lebar = inputan.nextDouble();
		bd.cetakLuas("Persegi panjang", bd.luas());
		
		Segitiga sikusiku = new Segitiga();
		bd = sikusiku;

		System.out.print("Masukkan Panjang (Alas): ");
		bd.panjang = inputan.nextDouble();

		System.out.print("Masukkan Tinggi: ");
		bd.tinggi = inputan.nextDouble();
		bd.cetakLuas("Segitiga siku-siku", bd.luas(bd.panjang, bd.tinggi));
		
		SegiEmpat persegi = new SegiEmpat();

		System.out.print("Masukkan Sisi: ");

		int sisi = inputan.nextInt();
		persegi.cetakLuas("Persegi", persegi.luas(sisi));

		System.out.print("Masukkan Jari-jari: ");
		double r = inputan.nextDouble();
        
		Lingkaran bdl = new Lingkaran();
		bdl.cetakLuas("Lingkaran", bdl.luas(r));
		
		inputan.close();
	}
}