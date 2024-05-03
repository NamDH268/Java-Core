public class DataType {
    public static void main(String[] args) {
        // cú pháp khởi tạo biến
        // [kieu_du_lieu] [ten_bien] = [gia_tri_khoi_tao];
        // kiểu số nguyên : byte (1), short (2), int (4), long (8)
        int age = 18;
        System.out.println("age = " + age);

        // kiểu số thực float (4), double (8)
        float pi = 3.141592653589793f;
        double PI = 3.141592653589793;
        System.out.println("PI = " + PI);
        System.out.println("pi = " + pi);

        // kiểu logic boolean
        boolean isloading = true;
        System.out.println("isloading = " + isloading);

        // kiểu kí tự: char (2)
        char c = 'a';
        System.out.println("c = " + c);

        // kiểu xâu kí tự: String
        String name = "Nam";
        System.out.println("name = " + name);

        //kiểu enum
        Gender gender = Gender.MALE;
        System.out.println("gender = " + gender);

        // class & object
        Dog dog1 = new Dog();
        dog1.name = "chihuahua";
        dog1.age = 5;
        dog1.gender = Gender.FEMALE;
        dog1.bark();
        int sum = dog1.sum(1, 10);
        System.out.println("sum = " + sum);

        Dog dog2 = new Dog();
        dog2.name = "shiba";
        dog2.age = 3;
        dog2.gender = Gender.MALE;
        dog2.bark();
    }
}
