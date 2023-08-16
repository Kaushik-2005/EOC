import java.io.*;

public class no_whitespace {
    public static void main(String[] args) {
        String sourceFileName = "Rect.asm";
        String destFileName = "no_whitespace.asm";
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
            PrintWriter writer = new PrintWriter(new FileWriter(destFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if(line.indexOf("/")!=-1){
                    line = line.substring(0,line.indexOf("/"));
                }
                line =line.replace(" ", "");
                line =line.replace("\n", "");
                line =line.replace("\t", "");
                if(line.length()!=0){
                    System.out.println(line.getClass());
                    writer.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}