import java.io.IOError;
import java.io.IOException;

public class TestException {
    public static void main(String[] args) {
        //System.out.println(checkFile("zakupy.txt"));
    }

    ///////////////
    //TO CO POD TYM ZNAJDUJE SIE W JAKIM API
    private static boolean checkFile(String s) throws IOException {
        if(s.contains(".txt")){
            openFile(s);
            return true;
        }
        return false;
    }

    private static void openFile(String s) throws IOException {
        throw new IOException();
    }


}
