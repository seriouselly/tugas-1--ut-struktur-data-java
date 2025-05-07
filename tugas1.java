
import java.util.LinkedList;

public class tugas1 {
    public static void main(String[] args) {
        //? Soal nomor 1
        int jumlahBaris;
        jumlahBaris = 20;

        System.out.println("1. Jumlah baris: " + jumlahBaris);

        //? Soal nomor 2
        String kalimatBaru;
        kalimatBaru = "Deklarasi tipe data String";

        System.out.println("2. Kalimat baru: " + kalimatBaru);

        //? Soal nomor 3
        int[] empatAngka = { 07, 10, 20, 23 };
        
        System.out.println(empatAngka[0]);
        System.out.println(empatAngka[1]);
        System.out.println(empatAngka[2]);
        System.out.println(empatAngka[3]);

        int[] empatAngka1 = new int[4];
        empatAngka1[0] = 07;
        empatAngka1[1] = 10;
        empatAngka1[2] = 20;
        empatAngka1[3] = 23;

        System.out.println(empatAngka1[0]);
        System.out.println(empatAngka1[1]);
        System.out.println(empatAngka1[2]);
        System.out.println(empatAngka1[3]);

        //? Soal nomor 4
        String[][] alfabet = {
            {
                "p", "s", "n"
            },
            {
                "w", "l", "b"
            },
            {
                "f", "r", "e"
            }
        };

        System.out.println(alfabet[0][1]);
        System.out.println(alfabet[2][1]);
        System.out.println(alfabet[1][1]);

        //? Soal nomor 5
        LinkedList<Integer> listAngka = new LinkedList<>();
        listAngka.add(26);
        listAngka.add(8);
        listAngka.add(23);
        listAngka.add(24);
        listAngka.add(16);

        System.out.println("5. List Angka: " + listAngka);
        System.out.println("Jumlah Angka: " + listAngka.size());

    }
}