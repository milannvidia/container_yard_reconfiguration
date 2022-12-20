import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File folder=new File("initial");
        for (File filentry: folder.listFiles()){
            Yard yard=new Yard(filentry.getPath());
        }
    }

}