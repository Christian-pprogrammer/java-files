import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) {
        char [] array = new char[100];
        try{
            FileReader input = new FileReader("newFile.txt");
            input.read(array);
            System.out.println(array);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
