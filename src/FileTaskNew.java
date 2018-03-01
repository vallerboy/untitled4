import org.omg.CORBA.portable.InputStream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileTaskNew {
    public static void main(String[] args) {
        File file = new File("C:\\asd\\krk.txt");
        File file1 = new File("C:\\asd\\krk1.txt");

        if(!file1.exists()){
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        byte[] byteArray = null;
        try {
            byteArray = Files.readAllBytes(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Files.write(file1.toPath(), byteArray, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
