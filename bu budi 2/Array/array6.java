public class array6 {
    public static void main(String args[]) {
        int array2[][] = {{1, 2}, {3}, {4, 5, 6}};  // Mendeklarasikan array 2D dengan ukuran berbeda per baris
        int total = 0;  // Variabel untuk menyimpan jumlah total elemen array

        System.out.println("Isi Array2:");

        // Loop untuk mencetak elemen-elemen array 2D
        for (int baris = 0; baris < array2.length; baris++) {
            for (int kolom = 0; kolom < array2[baris].length; kolom++) {
                System.out.print(array2[baris][kolom] + " ");  // Menampilkan elemen pada baris dan kolom
                total = total + array2[baris][kolom];  // Menambah nilai elemen ke total
            }
            System.out.print("\n");  // Pindah ke baris baru setelah mencetak seluruh elemen dalam satu baris
        }

        // Menampilkan jumlah seluruh elemen dalam array
        System.out.println("\nJumlah seluruh elemen: " + total);
    }
}