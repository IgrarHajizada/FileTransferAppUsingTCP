import util.MenuUtil;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class FileInfoReader {
    public static void readMessage() throws Exception {

        String fileLocation = MenuUtil.fileLocation();

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream
                (new FileInputStream(fileLocation))) {
            int i;
            try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream
                    (new FileOutputStream("lib/Text.txt"))) {
                while ((i = bufferedInputStream.read()) != -1) {
                    bufferedOutputStream.write((char) i);
                }
            }
        }
    }
}
