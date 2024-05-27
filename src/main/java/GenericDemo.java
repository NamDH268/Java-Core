public class GenericDemo {
    public static void main(String[] args) {
        // T : Type
        // E : Element
        // N : Number
        // K : Key
        // V : Value
        Circle<Integer> c1 = new Circle<>(10, "Red");
        System.out.println("c1 = " + c1);
        Circle<Double> c2 = new Circle<>(5.5 , "white");
        System.out.println("c2 = " + c2);
    }
}
