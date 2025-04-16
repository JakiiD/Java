//Average3.java
//menggunakan counter-controlled repetition
import javax.swing.*;

public class Average3 {
    public static void main(String args[]) {
        int total;
        int nilaiCounter;
        int nilai;
        int average;
        String nilaiString;

        total = 0;
        for (nilaiCounter = 1; nilaiCounter <= 5; nilaiCounter++) {
            nilaiString = JOptionPane.showInputDialog("Masukkan Nilainya : ");
            //nilaiString nya berbentuk string
            nilai = Integer.parseInt(nilaiString);
            //mengubah string ke integer --> ada di paket java.lang
            total = total + nilai;
        }

        average = total / 5;

        JOptionPane.showMessageDialog(null, "Nilai Rata2 Kelas : " + average, "Hasil", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    } //akhir dari main
}
//akhir dari class Average3