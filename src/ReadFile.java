import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    private String line = "";
    private String filePath;
    private String delimiter = ",";
    private int targetID;

    public ReadFile(String filePath, int targetID) {
        this.filePath = filePath;
        this.targetID = targetID;
    }

    public String findAndReturnTarget() {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine(); // Skip header

            while ((line = br.readLine()) != null) {
                String[] fields = line.split(delimiter);

                String searchStr = String.valueOf(targetID);
                if (fields.length > 0 && fields[0].trim().equals(searchStr)) {
                    return line;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            // You can return null or a specific error string here
            return null;
        }

        // IMPORTANT: This handles the case where the ID was never found
        return null;
    }
}