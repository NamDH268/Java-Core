public class EncapsulationDemo {
    public static void main(String[] args) {
        // Tính đóng gói
        // 1. Thêm private cho tất cả các thuộc tính
        // 2. Truy cập thông qua getter / setter

        Student student = new Student("Nam");
        System.out.println("student = " + student);
        System.out.println("student.getName() = " + student.getName());
        student.setName("Đào");
        System.out.println("student.getName() = " + student.getName());
    }
}
