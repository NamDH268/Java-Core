public class Exercise01 {
    void question01() {
        Department department = new Department();
        department.name = "Bảo vệ";

        Account account = new Account();
        account.department = department;

        if (account.department == null) {
            System.out.println("Nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là: " + account.department.name);
        }
    }

    void question03() {
        Department department = new Department();
        department.name = "Bảo vệ";

        Account account = new Account();
        account.department = department;

        String message = (account.department == null)
                ? "Nhân viên này chưa có phòng ban"
                : "Phòng ban của nhân viên này là: " + account.department.name;
        System.out.println(message);
    }

     void question04(){
        Position position = new Position();
        position.name = PositionName.DEV;

        String message = (position.name == PositionName.DEV)
                ? "Đây là deverloper"
                : "Người này không phải là Developer" ;
        System.out.println(message);
    }
    void question07(){
        Position position = new Position();
        position.name = PositionName.DEV;

        Account account = new Account();
        account.position = position;

        switch (account.position.name){
            case DEV:
                System.out.println("Đây là deverloper");
                break;
            default:
                System.out.println("Người này không phải là Developer");
                break;
        }

    }
    void question15(){
        for (int i = 2; i <= 20; i +=2) {
            System.out.println(i);
        }
    }
}