public class ArrayDemo {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 3, 9, 7, 8};
        String[] names = new String[]{"Nam","Huy","Long"};
        int[] Array = new int[5];

        // Kích thước của mảng
        System.out.println("numbers.length = " + numbers.length);
        System.out.println("names.length = " + names.length);
        System.out.println("Array.length = " + Array.length);

        //Truy cập dựa theo chỉ số (Index)
        System.out.println("names[1] = " + names[1]); // chỉ số của mảng bắt đầu từ số 0
        int lastIndex = numbers.length - 1;
        System.out.println("numbers[lastIndex] = " + numbers[lastIndex]);

        // Lặp các phần tử trong mảng
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers["+ i + "] = " + numbers[i]);
        }

        // Lặp các phần tử trong mảng (phải qua trái)
        for (int i = numbers.length-1; i >=0; i--) {
            System.out.println("numbers["+ (numbers.length-1-i) + "] = " + numbers[i]);
        }
    }
}
