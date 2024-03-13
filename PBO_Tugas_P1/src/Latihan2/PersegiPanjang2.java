package Latihan2;

	import java.util.Scanner;

	public class PersegiPanjang2 {
	    private double panjang;
	    private double lebar;

	    // Konstruktor
	    public PersegiPanjang2(double panjang, double lebar) {
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

	    // Method untuk menampilkan nilai atribut panjang, lebar, luas, dan keliling
	    public void tampil() {
	        System.out.println("Panjang : " + panjang);
	        System.out.println("Lebar : " + lebar);
	        System.out.println("Luas : " + hitungLuas());
	        System.out.println("Keliling : " + hitungKeliling());
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
	        PersegiPanjang2 persegi = new PersegiPanjang2(panjang, lebar);

	        // Menampilkan nilai atribut panjang, lebar, luas, dan keliling
	        persegi.tampil();

	        scanner.close();
	    }
	}

