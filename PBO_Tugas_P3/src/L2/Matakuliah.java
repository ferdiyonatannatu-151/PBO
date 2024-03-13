package L2;

public class Matakuliah {
    private String kode;
    private String nama;
    private String index;
    private int sks;

    // Konstruktor
    public Matakuliah(String kode, String nama, String index, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.index = index;
        this.sks = sks;
    }

    // Method untuk menghitung nilai indeks
    public double nilaiIndex() {
        // Berdasarkan index matakuliah
        // A = 4, AB = 3.5, B = 3, BC = 2.5, C = 2, D = 1, E = 0
        switch (index) {
            case "A":
                return 4.0;
            case "AB":
                return 3.5;
            case "B":
                return 3.0;
            case "BC":
                return 2.5;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            case "E":
                return 0.0;
            default:
                return -1.0; // Jika index tidak valid, kembalikan nilai negatif
        }
    }

    public String display() {
        return kode + " - " + nama + ", Indeks: " + index;
    }
}