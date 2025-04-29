public class array4 {
    public static void main(String args[]) {
        int array1[] = {1, 2, 3, 4, 5};  // Mendeklarasikan array dengan nilai langsung

        System.out.println("Array sebelum dilewatkan:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");  // Menampilkan elemen array
        }

        System.out.println("\nSesudah dilewatkan:");
        modifyarray(array1);  // Memodifikasi array dengan menambah 5 pada setiap elemen
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");  // Menampilkan elemen array setelah modifikasi
        }

        System.out.println("\n\nIngin melewatkan elemen array?");
        System.out.println("========================");
        System.out.println("\nSebelum elemen dilewatkan:");
        System.out.println(array1[2]);  // Menampilkan elemen ke-3 (index 2)
        modifyelemen(array1[2]);  // Memodifikasi nilai elemen ke-3, tetapi nilai asli tidak berubah
        System.out.println("Sesudah elemen dilewatkan:");
        System.out.println(array1[2]);  // Nilai elemen ke-3 setelah pemanggilan fungsi
    }

    // Fungsi untuk memodifikasi array (menambah 5 pada setiap elemen)
    public static void modifyarray(int b[]) {
        for (int y = 0; y < b.length; y++) {
            b[y] = b[y] + 5;  // Menambah 5 pada setiap elemen array
        }
    }

    // Fungsi untuk memodifikasi elemen array (tidak mengubah nilai array karena passed by value)
    public static void modifyelemen(int c) {
        c = c + 10;  // Menambah 10 pada elemen lokal 'c'
        // Namun, perubahan ini hanya berlaku pada parameter lokal 'c', bukan pada array asli
    }
}