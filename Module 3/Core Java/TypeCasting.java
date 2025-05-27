public class TypeCasting {
    public static void main(String[] args) {
        double d = 9.7;
        int i = (int) d; // Narrowing
        System.out.println("Double to Int: " + i);

        int x = 5;
        double y = x; // Widening
        System.out.println("Int to Double: " + y);
    }
}