import java.util.Locale;

public class OutputDemo {
    public static void main(String[] args) {
        // Escape character
        // \" -> "
        // \' -> '
        // \\ -> \
        // \n -> xuống dòng
        // \t -> tab

        // System.out.print không tự động xuống dòng
        System.out.print("\"Java\" Core\n");
        System.out.print("\"Java\" Core");

        // System.out.println
        System.out.println("\"Java\" Core");

        // System.out.printf
        // %d: số nguyên (byte,short,int,long)
        // %f: số thực (float,double)
        // %s: string
        // %c: kí tự (char)
        String name ="Nam";
        int age = 24;
        System.out.printf("Tên của bạn là: %s, tuổi của bạn là: %d%n", name, age);
        // Căn lề
        System.out.printf("| %8s |%n", "abc");
        System.out.printf("| %-8s |%n", "abc");
        System.out.printf("| %-8s |%n", "abcdefght");
        // Làm tròn số
        System.out.printf("PI = %.3f%n", 3.1415);
        // Nhóm 3 số
        System.out.printf("Money = %,f%n", 1234560000.78);
        System.out.printf(Locale.CHINA, "Money = %,d%n", 1234560000);
        System.out.printf(Locale.JAPAN, "Money = %,d%n", 1234560000);
        System.out.printf(new Locale("vi"), "Money = %,d%n", 1234560000);
        // In hoa: %S, %C
        System.out.printf("Tên: %S%n","nam");
    }
}
