public class PolymorphismDemo {
    public static void main(String[] args) {
        // Tính đa hình
        Runnable cat = new Cat();
        callRun(cat);
        Runnable bird = new Bird();
        callRun(bird);
    }

    static void callRun(Runnable runnable) {
        runnable.run();
    }
}

