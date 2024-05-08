import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt();
        System.out.println("a = " + a);

        // 0<= random.nextInt(max) < max
        int b = random.nextInt(100);
        System.out.println("b = " + b);

        // min<= min + random.nextInt(max +1 -min) <= max
        int min = 100;
        int max =999;
        int c = min + random.nextInt(max -min +1);
        System.out.println("c = " + c);

        // random 1 phần tử trong mảng
        String[] fruits = {"cam", "táo","ổi","lê","dứa"};
        int Index = random.nextInt(fruits.length);
        String fruit = fruits[Index];
        System.out.println("fruit = " + fruit);
    }
}
