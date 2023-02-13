import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class FileInfoReader {
    public static List<Character> readMessage() throws Exception {

        String fileLocation = MenuUtil.fileLocation();

        List<Character> list = new ArrayList<>();
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream
                (new FileInputStream(fileLocation))) {
            int i;
            while ((i = bufferedInputStream.read()) != -1) {
                list.add((char) i);
            }
        }
        return list;
    }
}
