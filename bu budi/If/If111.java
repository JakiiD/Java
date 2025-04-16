import javax.swing.*;

public class If111 {
    public static void main(String args[]) {
        String a = JOptionPane.showInputDialog("Masukkan Nilaimu!");
        int nilai = Integer.parseInt(a);
        JOptionPane.showMessageDialog(null, nilai > 60 ? "Selamat!" : "Maaf", "Hasil", 
        JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}