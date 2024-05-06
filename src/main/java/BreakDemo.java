public class BreakDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (i==5){
                break; //thoát ra khỏi vòng lặp ngay lập tức
            }
            System.out.println(i);
        }
        System.out.println("xong");
    }
}
