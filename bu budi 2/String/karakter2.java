public class karakter2 {
    public static void main(String args[]) {
        String str = "Bahasa";
        String output = "Ada di posisi: ";
        int panjangStr = str.length();
        int jumlah_a = 0;

        // Loop untuk memeriksa setiap karakter dalam string
        for (int i = 0; i < panjangStr; i++) {
            char kar = str.charAt(i);  // Mengambil karakter di indeks ke-i

            if (kar == 'a') {  // Mengecek apakah karakter adalah 'a'
                jumlah_a++;  // Menambah jumlah 'a'
                output += i + " ";  // Menambahkan posisi ke output
            }
        }

        // Menampilkan hasil
        System.out.println("Kalimat yang akan dicek adalah: " + str);
        System.out.println("Jumlah huruf 'a' = " + jumlah_a);
        System.out.println(output);
    }
}