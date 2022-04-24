import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("newFile.txt");
        try{
            boolean value = file.createNewFile();
            if(value) {
                System.out.println("File created successfully");
                return;
            }
            System.out.println("Unable to create file");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
