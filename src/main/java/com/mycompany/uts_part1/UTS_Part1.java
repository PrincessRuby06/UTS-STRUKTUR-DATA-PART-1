package com.mycompany.uts_part1;
/**
 *
 * @author RUBY
 */
import java.util.ArrayList;

public class UTS_Part1 {

    // ===== TAMPILAN + RANKING =====
    static void tampil(ArrayList<String> nama, ArrayList<String> nim, ArrayList<Integer> nilai) {
        System.out.println("No\tNama\t\tNIM\t\tNilai\tPeringkat");

        for (int i = 0; i < nama.size(); i++) {
            int rank = 1;
            for (int j = 0; j < nilai.size(); j++) {
                if (nilai.get(j) > nilai.get(i)) {
                    rank++;
                }
            }
            System.out.println((i+1) + "\t" + nama.get(i) + "\t" + nim.get(i) + "\t" + nilai.get(i) + "\t" + rank);
        }
        System.out.println();
    }

    // =============== BUBBLE ================
    static void bubble() {
        System.out.println("=============== BUBBLE SORT ===============");

        ArrayList<String> nama = new ArrayList<>();
        ArrayList<String> nim = new ArrayList<>();
        ArrayList<Integer> nilai = new ArrayList<>();

        // DATA AWAL
        nama.add("Andi Pratama"); nim.add("25171562005"); nilai.add(85);
        nama.add("Apip Yulistian"); nim.add("25171562006"); nilai.add(92);
        nama.add("Budi Santoso"); nim.add("25171562009"); nilai.add(78);
        nama.add("Rina Ayu Putri"); nim.add("25171562004"); nilai.add(88);
        nama.add("Eko Wijaya"); nim.add("25171562001"); nilai.add(65);
        nama.add("Maya Sari"); nim.add("25171562002"); nilai.add(95);
        nama.add("Dimas Prakoso"); nim.add("25171562007"); nilai.add(72);
        nama.add("Nadila Safira"); nim.add("25171562011"); nilai.add(81);
        nama.add("Rizky Aditya"); nim.add("25171562003"); nilai.add(90);
        nama.add("Putri Nirmala"); nim.add("25171562010"); nilai.add(76);
        nama.add("Princess Ruby"); nim.add("25171562008"); nilai.add(98);
        nama.add("Dewi Yunilla"); nim.add("25171562015"); nilai.add(70);
        nama.add("Regy Purnomo"); nim.add("25171562012"); nilai.add(50);
        nama.add("Kenzo oberon"); nim.add("25171562014"); nilai.add(82);
        nama.add("Aldean Tegar"); nim.add("25171562013"); nilai.add(87);
        

        tampil(nama, nim, nilai);

        for (int i = 0; i < nilai.size() - 1; i++) {
            System.out.println("Iterasi ke-" + (i+1));

            for (int j = 0; j < nilai.size() - i - 1; j++) {
                if (nilai.get(j) < nilai.get(j+1)) {

                    int temp = nilai.get(j);
                    nilai.set(j, nilai.get(j+1));
                    nilai.set(j+1, temp);

                    String tNama = nama.get(j);
                    nama.set(j, nama.get(j+1));
                    nama.set(j+1, tNama);

                    String tNim = nim.get(j);
                    nim.set(j, nim.get(j+1));
                    nim.set(j+1, tNim);
                }
            }

            tampil(nama, nim, nilai);
        }
    }

    // =============== INSERTION ===============
    static void insertion() {
        System.out.println("=============== INSERTION SORT ===============");

        ArrayList<String> nama = new ArrayList<>();
        ArrayList<String> nim = new ArrayList<>();
        ArrayList<Integer> nilai = new ArrayList<>();

        // DATA AWAL
         nama.add("Andi Pratama"); nim.add("25171562005"); nilai.add(85);
        nama.add("Apip Yulistian"); nim.add("25171562006"); nilai.add(92);
        nama.add("Budi Santoso"); nim.add("25171562009"); nilai.add(78);
        nama.add("Rina Ayu Putri"); nim.add("25171562004"); nilai.add(88);
        nama.add("Eko Wijaya"); nim.add("25171562001"); nilai.add(65);
        nama.add("Maya Sari"); nim.add("25171562002"); nilai.add(95);
        nama.add("Dimas Prakoso"); nim.add("25171562007"); nilai.add(72);
        nama.add("Nadila Safira"); nim.add("25171562011"); nilai.add(81);
        nama.add("Rizky Aditya"); nim.add("25171562003"); nilai.add(90);
        nama.add("Putri Nirmala"); nim.add("25171562010"); nilai.add(76);
        nama.add("Princess Ruby"); nim.add("25171562008"); nilai.add(98);
        nama.add("Dewi Yunilla"); nim.add("25171562015"); nilai.add(70);
        nama.add("Regy Purnomo"); nim.add("25171562012"); nilai.add(50);
        nama.add("Kenzo oberon"); nim.add("25171562014"); nilai.add(82);
        nama.add("Aldean Tegar"); nim.add("25171562013"); nilai.add(87);
        
        
        tampil(nama, nim, nilai);

        for (int i = 1; i < nilai.size(); i++) {
            System.out.println("Iterasi ke-" + i);

            int keyNilai = nilai.get(i);
            String keyNama = nama.get(i);
            String keyNim = nim.get(i);
            int j = i - 1;

            while (j >= 0 && nilai.get(j) < keyNilai) {
                nilai.set(j+1, nilai.get(j));
                nama.set(j+1, nama.get(j));
                nim.set(j+1, nim.get(j));
                j--;
            }

            nilai.set(j+1, keyNilai);
            nama.set(j+1, keyNama);
            nim.set(j+1, keyNim);

            tampil(nama, nim, nilai);
        }
    }

    // =============== SELECTION ===============
    static void selection() {
        System.out.println("=============== SELECTION SORT ===============");

        ArrayList<String> nama = new ArrayList<>();
        ArrayList<String> nim = new ArrayList<>();
        ArrayList<Integer> nilai = new ArrayList<>();

        // DATA AWAL
        nama.add("Andi Pratama"); nim.add("25171562005"); nilai.add(85);
        nama.add("Apip Yulistian"); nim.add("25171562006"); nilai.add(92);
        nama.add("Budi Santoso"); nim.add("25171562009"); nilai.add(78);
        nama.add("Rina Ayu Putri"); nim.add("25171562004"); nilai.add(88);
        nama.add("Eko Wijaya"); nim.add("25171562001"); nilai.add(65);
        nama.add("Maya Sari"); nim.add("25171562002"); nilai.add(95);
        nama.add("Dimas Prakoso"); nim.add("25171562007"); nilai.add(72);
        nama.add("Nadila Safira"); nim.add("25171562011"); nilai.add(81);
        nama.add("Rizky Aditya"); nim.add("25171562003"); nilai.add(90);
        nama.add("Putri Nirmala"); nim.add("25171562010"); nilai.add(76);
        nama.add("Princess Ruby"); nim.add("25171562008"); nilai.add(98);
        nama.add("Dewi Yunilla"); nim.add("25171562015"); nilai.add(70);
        nama.add("Regy Purnomo"); nim.add("25171562012"); nilai.add(50);
        nama.add("Kenzo oberon"); nim.add("25171562014"); nilai.add(82);
        nama.add("Aldean Tegar"); nim.add("25171562013"); nilai.add(87);
       
        tampil(nama, nim, nilai);

        for (int i = 0; i < nilai.size() - 1; i++) {
            System.out.println("Iterasi ke-" + (i+1));

            int max = i;

            for (int j = i + 1; j < nilai.size(); j++) {
                if (nilai.get(j) > nilai.get(max)) {
                    max = j;
                }
            }

            int temp = nilai.get(i);
            nilai.set(i, nilai.get(max));
            nilai.set(max, temp);

            String tNama = nama.get(i);
            nama.set(i, nama.get(max));
            nama.set(max, tNama);

            String tNim = nim.get(i);
            nim.set(i, nim.get(max));
            nim.set(max, tNim);

            tampil(nama, nim, nilai);
        }
    }

    public static void main(String[] args) {
        bubble();
        insertion();
        selection();
    }
}