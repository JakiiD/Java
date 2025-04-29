public class kapasitas {
    public static void main(String args[]) {
        StringBuffer c = new StringBuffer("");

        System.out.println("Isi c adalah: " + c);
        System.out.println("Kapasitas StringBuffer c: " + c.capacity());

        System.out.println("Setelah dikenai append(\"Halo\"), c menjadi:");
        System.out.println(c.append("Halo"));
        System.out.println("Kapasitas StringBuffer c: " + c.capacity());
        System.out.println("Panjang c adalah: " + c.length());

        System.out.println("c ditambah dengan \", minggu depan libur\"");
        System.out.println("Isi c adalah: " + c.append(", minggu depan libur"));
        System.out.println("Kapasitas StringBuffer c: " + c.capacity());
        System.out.println("Panjang c adalah: " + c.length());

        System.out.println("c ditambah dengan \". Bener lho.\"");
        System.out.println("Isi c adalah: " + c.append(". Bener lho."));
        System.out.println("Kapasitas StringBuffer c: " + c.capacity());
        System.out.println("Panjang c adalah: " + c.length());
    }
}