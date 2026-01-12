import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {

    public static String fetchData(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            br.readLine();

            while((line = br.readLine())!=null){
                String[] fields = line.split


            }
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
