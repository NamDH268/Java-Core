public class Department {
    int id;
    String name;

    Department(){
        System.out.println("constructor 0 tham số");
        this.id = 0;
        this.name = "phòng chờ";
    }
    Department(String name){
        System.out.println("constructor 1 tham số");
        this.id = 99;
        this.name = name;
    }

    Department(int id, String name){
        System.out.println("constructor có 2 tham số");
        this.id = id;
        this.name = name;
    }
}
