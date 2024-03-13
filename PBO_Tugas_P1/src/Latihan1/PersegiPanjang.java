package Latihan1;

import java.util.Scanner;

public class PersegiPanjang {
	    private double panjang;
	    private double lebar;

	    // Konstruktor
	    public PersegiPanjang(double panjang, double lebar) {
	        this.panjang = panjang;
	        this.lebar = lebar;
	    }

	    // Method untuk menghitung luas persegi panjang
	    public double hitungLuas() {
	        return panjang * lebar;
	    }

	    // Method untuk menghitung keliling persegi panjang
	    public double hitungKeliling() {
	        return 2 * (panjang + lebar);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Meminta input panjang dari pengguna
	        System.out.print("Panjang : ");
	        double panjang = scanner.nextDouble();

	        // Meminta input lebar dari pengguna
	        System.out.print("Lebar : ");
	        double lebar = scanner.nextDouble();

	        // Membuat objek PersegiPanjang dengan input yang diberikan
	        PersegiPanjang persegi = new PersegiPanjang(panjang, lebar);

	        // Menghitung dan menampilkan luas persegi panjang
	        System.out.println("Luas : " + persegi.hitungLuas());

	        // Menghitung dan menampilkan keliling persegi panjang
	        System.out.println("Keliling : " + persegi.hitungKeliling());

	        scanner.close();
	    }
	}


