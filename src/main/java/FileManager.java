import java.io.File;
import java.io.IOException;

public class FileManager {
    // kiểm tra file có tô tại hay không
    public static boolean exsists(String path){
        File file = new File(path);
        return file.exists();
    }
    // tạo mới file
    public static boolean createFlie(String path) throws IOException {
        if (exsists(path)) {
            throw new IllegalStateException("Error! File Exist.");
        }
        File file = new File(path);
        return file.createNewFile();
    }
    // xóa file
    public static boolean delete(String path){
        if (!exsists(path)) {
            throw new IllegalStateException("Error! File Not Exist.");
        }
        File file = new File(path);
        return file.delete();
    }
    // kiểm tra file
    public static boolean isFile(String path){
        File file = new File(path);
        return file.isFile();
    }
    // Kiểm tra folder
    public static boolean isFolder(String path){
        File file = new File(path);
        return file.isDirectory();
    }
    // lấy ra danh sách file có trong folder
    public static String[] list(String path){
        File file = new File(path);
        return file.list();
    }
    public static boolean mkdirs(String path){
        File file = new File(path);
        return file.mkdir();//make directories
    }
}
