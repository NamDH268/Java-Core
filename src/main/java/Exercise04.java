import java.util.Scanner;

public class Exercise04 {
    void Question01(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi kí tự: ");
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        int count = 0;
        for (String s2 : s1){
            if (!s2.isEmpty()){
                count++;
            }
        }
        System.out.println("Số từ: " + count);

       /* int s2 = s.trim().split("\\s+").length;
        System.out.println("s2 = " + s2);*/
    }
    void Question03(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên: ");
        String ten = scanner.nextLine();
        String t1 = ten.substring(0,1).toUpperCase() + ten.substring(1).toLowerCase();
        System.out.println("t1 = " + t1);
    }
    void Question04(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên: ");
        String ten = scanner.nextLine();
        int length = ten.length();
        for (int i = 0; i < length; i++) {
            int n = i +1;
            int c = ten.charAt(i);
            System.out.printf("ký tự thứ %d la: %C%n", n,c);
        }
       /* String[] words = ten.split("");
        for (String word : words){
            System.out.println("word = " + word);
        }*/
    }
    void Question05(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào họ: ");
        String ho = scanner.nextLine();
        System.out.println("Nhập vào tên: ");
        String ten = scanner.nextLine();
        System.out.println("họ và tên là: " + ho +" "+ ten);
    }
    void Question06(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào họ và tên đầy đủ: ");
        String s = scanner.nextLine();
        int indexOfFirstWhiteSpace = s.indexOf(' ');
        int indexOfLastWhiteSpace = s.lastIndexOf(' ');
        String firstName = s.substring(0, indexOfFirstWhiteSpace);
        String lastName = s.substring(indexOfLastWhiteSpace +1 );
        String middleName = s.substring(indexOfFirstWhiteSpace +1,indexOfLastWhiteSpace);
        System.out.println("Họ là: " + firstName);
        System.out.println("Tên đệm là: " + middleName);
        System.out.println("Tên là: " + lastName);
    }
    void Question07(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào họ và tên đầy đủ: ");
        String name = scanner.nextLine();
        System.out.println("họ và tên = " + name.trim());


        System.out.println("Nhập vào tên: ");
        String ten = scanner.nextLine();
        String t1 = ten.substring(0,1).toUpperCase() + ten.substring(1).toLowerCase();
        System.out.println("t1 = " + t1);
    }
    int question11(String s){
        int length = s.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == 'a'){
                count++;
            }
        }
        return count;
    }
}
