public class karakter1 {
    public static void main(String args[]) {
        Character kar = 'a';

        System.out.println("Apakah " + kar + " itu Digit? " + Character.isDigit(kar));
        System.out.println("Apakah " + kar + " itu Letter (Huruf)? " + Character.isLetter(kar));
        System.out.println("Apakah " + kar + " itu LowerCase (Huruf Kecil)? " + Character.isLowerCase(kar));
        System.out.println("Apakah " + kar + " itu UpperCase (Huruf Besar)? " + Character.isUpperCase(kar));
        System.out.println("Apakah " + kar + " itu Whitespace? " + Character.isWhitespace(kar));

        Character karl = new Character('A');
        System.out.println("Apakah " + kar + " itu equals (sama) dengan " + karl + "? " + kar.equals(karl));
    }
}