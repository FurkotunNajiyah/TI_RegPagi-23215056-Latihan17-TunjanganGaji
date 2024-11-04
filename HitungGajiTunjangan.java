/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;

public class HitungGajiTunjangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok (dalam rupiah): ");
        double gajiPokok = scanner.nextDouble();

        System.out.print("Sudah menikah? (ya/tidak): ");
        String statusMenikah = scanner.next();

        double tunjangan = 0;
        if (statusMenikah.equalsIgnoreCase("ya")) {
            tunjangan = gajiPokok * 0.35;
        }

        double gajiTotal = gajiPokok + tunjangan;

        System.out.println("Gaji pokok: Rp " + gajiPokok);
        System.out.println("Tunjangan: Rp " + tunjangan);
        System.out.println("Gaji total: Rp " + gajiTotal);
    }
}
