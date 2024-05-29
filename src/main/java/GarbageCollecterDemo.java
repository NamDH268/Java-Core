public class GarbageCollecterDemo {
    public static void main(String[] args) {
        class Animal{
            private String name;

            public Animal(String name) {
                this.name = name;
            }
        }
        Animal animal = new Animal("Dog");
        animal = null;
        System.gc();
    }
}
