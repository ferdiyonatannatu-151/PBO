package Latihan3;

import java.util.Scanner;

public class IndeksNilaiMatkul {

    // Method untuk menghitung indeks nilai berdasarkan nilai akhir
    public static String hitungIndeksNilai(double nilai) {
        if (nilai >= 81 && nilai <= 100) {
            return "A";
        } else if (nilai >= 76 && nilai <= 80) {
            return "AB";
        } else if (nilai >= 56 && nilai <= 75) {
            return "B";
        } else if (nilai >= 51 && nilai <= 55) {
            return "BC";
        } else if (nilai >= 41 && nilai <= 50) {
            return "C";
        } else if (nilai >= 21 && nilai <= 40) {
            return "D";
        } else if (nilai >= 0 && nilai <= 20) {
            return "E";
        } else {
            return "Nilai di luar jangkauan";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Input: ");
        String input = scanner.nextLine();
        String[] inputValues = input.split(",");

        // Output
        System.out.print("Output: ");
        for (int i = 0; i < inputValues.length; i++) {
            double nilai;
            try {
                nilai = Double.parseDouble(inputValues[i]);
            } catch (NumberFormatException e) {
                System.out.print("Nilai harus diisi, ");
                continue;
            }
            System.out.print(hitungIndeksNilai(nilai));
            if (i < inputValues.length - 1) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}