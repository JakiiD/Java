public class CharAt1 {
    public static void main(String args[]) {
        String a = "Java";
        // Bisa diganti dengan: String a = new String("Java");

        for (int i = 0; i < a.length(); i++) {
            System.out.println("Karakter ke-" + i + " adalah " + a.charAt(i));
        }
    }
}