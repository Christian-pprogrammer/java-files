import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("newFile.txt");
        file.delete();
        System.out.println("file deleted successfully");
    }
}
