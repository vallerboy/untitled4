import java.io.*;

public class FileTask {
    public static void main(String[] args) {
       File file = new File("C:\\asd\\krk.txt");

        StringBuilder stringBuilder = new StringBuilder();
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            int read;
            while ((read = fileInputStream.read()) != -1){
                stringBuilder.append((char)read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {

            }
        }

        System.out.println(stringBuilder.toString());
        ///////////////////////////ZAPIS//////////////////////////////////
        String cos = "Hello!";
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file, true);
            fileOutputStream.write(cos.getBytes());

            fileOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
