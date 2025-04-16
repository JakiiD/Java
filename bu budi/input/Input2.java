import java.io.*;

public class Input2 {
    public static void main(String args[]) throws IOException {
        //menginput dengan DataInputStream
        System.out.print("Input bilangan : ");
        DataInputStream masukan = new DataInputStream(System.in);
        int bilangan = Integer.parseInt(masukan.readLine());
        System.out.println("Bilangan yang Anda masukan : " + bilangan);
    }
}
