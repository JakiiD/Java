// Average4.java
// Menggunakan sentinel-controlled repetition
import javax.swing.*;

public class Average4 {
    public static void main(String args[]) {
        int total;
        int nilaiCounter;
        int nilai;
        int average;
        String nilaiString;

        total = 0;
        nilaiCounter = 0;

        nilaiString = JOptionPane.showInputDialog(
            "Masukkan Nilainya atau -1 untuk berhenti : ");
        nilai = Integer.parseInt(nilaiString);

        for (nilaiCounter = 0; nilai != -1; nilaiCounter++) {
            total = total + nilai;

            nilaiString = JOptionPane.showInputDialog("Masukkan Nilainya: ");
            // nilaiString-nya berbentuk string

            nilai = Integer.parseInt(nilaiString);
            // mengubah string ke integer --> ada di paket java.lang
        }

        if (nilaiCounter != 0) // jika ada nilai yang dimasukkan
        {
            average = total / nilaiCounter;

            JOptionPane.showMessageDialog(
                null,
                "Nilai Rata2 Kelas: " + average,
                "Hasil",
                JOptionPane.INFORMATION_MESSAGE);
        } else {
            // jika tidak ada nilai yang dimasukkan
            JOptionPane.showMessageDialog(
                null,
                "Tidak ada nilai yg dimasukkan",
                "Hasil",
                JOptionPane.INFORMATION_MESSAGE);
        }

        System.exit(0);
    }
}
