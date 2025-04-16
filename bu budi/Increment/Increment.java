public class Increment {
    public static void main(String args[]) {
        int a = 4;
        System.out.println("Nilai a = " + a);

        System.out.println("Nilai a menjadi = " + (a++));
        System.out.println("Nilai a menjadi = " + (a++));

        System.out.println();

        System.out.println("Nilai a menjadi = " + (a--));
        System.out.println("Nilai a menjadi = " + (--a));
    }
}
