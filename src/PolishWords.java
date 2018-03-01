import java.io.*;

public class PolishWords {
    public static void main(String[] args) {
        File file = new File("jakis_path");

        try {
            InputStreamReader inputStreamReader =
                    new InputStreamReader(new FileInputStream(file), "UTF-8")



        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
