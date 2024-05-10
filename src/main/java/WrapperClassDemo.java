public class WrapperClassDemo {
    public static void main(String[] args) {
        // byte     ->      Byte
        // short    ->      Short
        // int      ->      Interger
        // long     ->      Long
        // float    ->      Float
        // double   ->      Double
        // boolean  ->      Boolean
        // char     ->      Character

        // boxing: primive -> wrapper class
        Integer a = Integer.valueOf(100);

        // unboxing: wrapper class -> primive
        int b = a.intValue();

        // Bài toán: String -> Number
        int c = Integer.parseInt("123");
        System.out.println("c = " + c);
    }
}
