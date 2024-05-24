import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class IOStreamDemo {
    public static void main(String[] args) throws IOException {
        String path = "src/main/resources/abc.txt";
        String text ="";
        byte [] bytes = text.getBytes(StandardCharsets.UTF_8);
        IOManager.writeBytes(path,bytes, true);
        IOManager.writeBytes(path,bytes, true);
        IOManager.writeBytes(path,bytes, true);

        byte[] result =IOManager.readBytes(path);

    }
}
