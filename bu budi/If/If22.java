import javax.swing.*;

public class If22 {
    public static void main(String args[]) {
        String a = JOptionPane.showInputDialog("Masukkan Nilaimu!");
        int nilai = Integer.parseInt(a);
        if (nilai > 60) {
            JOptionPane.showMessageDialog(null, "Selamat Anda Lulus", "Hasil", 
            JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Maaf Anda belum beruntung", "Hasil", 
            JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}
