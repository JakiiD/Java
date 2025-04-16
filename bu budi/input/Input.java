import java.io.*;

public class Input {
    public static void main(String args[]) {
        //menginput dengan class BufferedReader
        try {
            String nama;
            System.out.print("Masukan Nama Anda : ");
            BufferedReader tulis = new BufferedReader(
                                   new InputStreamReader(System.in));
            nama = tulis.readLine();
            System.out.println("Nama Anda : " + nama);
        } catch (IOException ie) {
            System.out.println(ie.getMessage());
        }
    }
}
