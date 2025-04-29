public class array {
    public static void main(String args[]) {
        int a[] = new int[5];  // Mendeklarasikan array dengan 5 elemen

        System.out.println("Index\tNilai");

        // Mengisi array dengan nilai dan menampilkan index dan nilai array
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 2;  // Menetapkan nilai array
            System.out.println(i + "\t" + a[i]);  // Menampilkan index dan nilai array
        }
    }
}