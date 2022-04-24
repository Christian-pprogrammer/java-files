import java.io.FileWriter;

public class WriteFile {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("output.txt");
            String output = "this is from the code";
            writer.write(output);
            System.out.println("Written to file");
            writer.flush();
            writer.close();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
