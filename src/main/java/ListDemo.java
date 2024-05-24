import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        // List<String> list = new ArrayList<>();
        List<String> list = new LinkedList<>();

        // thêm phần tử vào cuối
        list.add("A");
        list.add("C");

        // thêm vào vị trí bất kì
        list.add(1,"B");

        //kích thước
        System.out.println("list.size() = " + list.size());

        // kiểm tra rỗng
        System.out.println("list.isEmpty() = " + list.isEmpty());

        // Kiểm tra chứa phần tử
        System.out.println("list.contains(\"D\") = " + list.contains("D"));

        // lấy ra chỉ số
        System.out.println("list.indexOf(\"C\") = " + list.indexOf("C"));

        //truy cập theo chỉ số
        System.out.println("list.get(1) = " + list.get(1));

        // xóa theo chỉ số
        list.remove(2);

        // xóa theo đối tượng
        list.remove("A");

        //xóa theo điều kiện
        list.removeIf(animal -> animal.length() > 5);

        // xóa toàn bộ
        list.clear();

        System.out.println(list);
    }
}
