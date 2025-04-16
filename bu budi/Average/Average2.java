//Average1.java
//menggunakan counter-controlled repetition
import javax.swing.*;

public class Average2 {
    public static void main(String args[]) {
        int total;
        int nilaiCounter;
        int nilai;
        int average;
        String nilaiString;

        total = 0;
        nilaiCounter = 0;

        
        nilaiString = JOptionPane.showInputDialog
        ("Masukkan Nilainya atau -1 untuk berhenti : ");
        //nilaiString nya berbentuk string
        nilai = Integer.parseInt(nilaiString);
        while (nilai != -1) {
            total = total + nilai;
            nilaiCounter = nilaiCounter + 1;

            nilaiString = JOptionPane.showInputDialog
            ("Masukkan Nilainya: ");
            //nilaiString nya berbentuk string

            nilai = Integer.parseInt(nilaiString);
            //mengubah string ke integer --> ada di java.lang
        }
        if (nilaiCounter != 0) //kalau ada nilai yg dimasukkan
        {
            average = total / nilaiCounter;
            JOptionPane.showMessageDialog(null,
            "Nilai Rata? Kelas: " + average, "Hasil",
            JOptionPane.INFORMATION_MESSAGE);
        } 
        else //kalau tidak ada nilai yg dimasukkan
            JOptionPane.showMessageDialog(null,
                    "Tidak ada nilai yg dimasukkan", "Hasil",
                    JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    } //akhir dari main
}//akhir dari class Average2