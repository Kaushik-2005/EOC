import java.io.*;

public class SymbolandVariables {
    public static void main(String[] args) {
        String sourceFileName = "no_whitespace.asm";           
        String destFileName = "SymbolsAndVariables.asm";       
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
            PrintWriter writer = new PrintWriter(new FileWriter(destFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("@")) {
                    String extractedData = line.substring(1);     
                    writer.println(extractedData);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
