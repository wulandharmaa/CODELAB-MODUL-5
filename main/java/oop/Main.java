package oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nama ke- (input 'selesai' untuk mengakhiri):");

        while (true) {
            String inputNama = scanner.nextLine();

            if (inputNama.equalsIgnoreCase("selesai")) {
                break;
            }
            try {
                mahasiswa.tambahNama(inputNama);
                System.out.println("Nama " + inputNama + " ditambahkan ke dalam list.");
            } catch (IllegalArgumentException e) { // nunjukin eror lewat throwzacky new
                System.out.println("Error: " + e.getMessage());
            }
        }

        mahasiswa.tampilkanDaftarNama();
}
}