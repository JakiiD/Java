public class array5 {
    public static void main(String args[]) {
        // Mendeklarasikan array 2D dengan ukuran yang berbeda di setiap baris
        int array2[][] = {{1, 2}, {3}, {4, 5, 6}};

        System.out.println("Isi Array2:");

        // Loop untuk mencetak array 2D
        for (int baris = 0; baris < array2.length; baris++) {
            for (int kolom = 0; kolom < array2[baris].length; kolom++) {
                System.out.print(array2[baris][kolom] + " ");  // Menampilkan elemen baris dan kolom
            }
            System.out.print("\n");  // Pindah baris setelah mencetak satu baris array
        }
    }
}