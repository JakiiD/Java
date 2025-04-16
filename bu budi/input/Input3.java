import javax.swing.*;

public class Input3 {
    public static void main(String args[]) {
        //inputan dengan JOptionPane
        String nama;
        nama = JOptionPane.showInputDialog("Masukan Nama : ");
        System.out.println("Nama Anda : " + nama);
        JOptionPane.showMessageDialog(null, "Nama Anda : " + nama);
        System.exit(0);
    }
}
