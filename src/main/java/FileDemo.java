import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        String path = "src/main/resources/abc.txt";

        boolean createnewFile = FileManager.createFlie(path);
        System.out.println("createnewFile = " + createnewFile);

        boolean delete = FileManager.delete("G:/abc.txt");
        System.out.println("delete = " + delete);

        String[] names = FileManager.list("C:/");
        for (String name : names){
            System.out.println("name = " + name);
        }

        boolean mkdirs = FileManager.mkdirs("G:/ra-85");
        System.out.println("mkdirs = " + mkdirs);
    }
}
