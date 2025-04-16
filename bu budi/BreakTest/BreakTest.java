// Nama file : BreakTest.java
// Program utk memberhentikan proses looping menggunakan break
import javax.swing.JOptionPane;

public class BreakTest {
    public static void main(String args[]) {
        String output = "";
        int count;

        for (count = 1; count <= 10; count++) {
            if (count == 5)
                break;

            output = output + count + " ";
            // perintah di atas bisa diganti menjadi
            // output += count + " ";
        }

        output = output + "\nBerhenti looping pada count = " + count;
        // perintah di atas bisa diganti menjadi
        // output += "\nBerhenti looping pada count = " + count;

        JOptionPane.showMessageDialog(null, output);

        System.exit(0);
    }
    // akhir dari main
}
// akhir dari class BreakTest
