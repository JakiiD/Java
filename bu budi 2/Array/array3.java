public class array3 {
    public static void main(String args[]) {
        int a[] = {10, 20, 30, 40, 50};  // Mendeklarasikan array dengan nilai langsung
        int total = 0;  // Variabel untuk menyimpan total jumlah

        System.out.println("Index\tNilai");

        // Loop untuk menampilkan index dan nilai array, serta menghitung total jumlah
        for (int i = 0; i < a.length; i++) {
            total += a[i];  // Menambahkan nilai array ke total
            System.out.println(i + "\t" + a[i]);  // Menampilkan index dan nilai array
        }

        System.out.println("Total jumlah isi array: " + total);  // Menampilkan total jumlah
    }
}
