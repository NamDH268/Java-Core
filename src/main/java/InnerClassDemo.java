public class InnerClassDemo {
    public static void main(String[] args) {
        // Inner Class : class trong class
        Student student = new Student(1,"nam");
        Student.Gender gender = student.new Gender("male");
        gender.showInfo();
        // Có thể truy cập private của lớp ngoài
        gender.showPrivateOuterClass();
        // Class trong method
        demoClassInMethod();
    }

    public static void demoClassInMethod(){
        class Dog{
            private String name;
            private String color;

            public Dog(String name, String color) {
                this.name = name;
                this.color = color;
            }

            @Override
            public String toString() {
                return "Dog{" +
                        "name='" + name + '\'' +
                        ", color='" + color + '\'' +
                        '}';
            }
        }

        Dog dog =new Dog("shiba", "yellow");
        System.out.println("dog = " + dog);
    }
}
