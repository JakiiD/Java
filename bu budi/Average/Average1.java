//Average1.java
//menggunakan counter-controlled repetition
import javax.swing.*;

public class Average1 {
    public static void main(String args[]) {
        int total;
        int nilaiCounter;
        int nilai;
        int average;
        String nilaiString;

        total = 0;
        nilaiCounter = 1;

        while (nilaiCounter <= 5) 
        {
            nilaiString = JOptionPane.showInputDialog("Masukkan Nilainya : ");
            //nilaiString nya berbentuk string
            nilai = Integer.parseInt(nilaiString);
            //mengubah string ke integer --> ada di paket java.lang
            total = total + nilai;
            nilaiCounter = nilaiCounter + 1;
        }

        average = total / 5;

        JOptionPane.showMessageDialog(null, "Nilai Rata Rata Kelas : " + average, "Hasil", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
