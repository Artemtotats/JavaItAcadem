package Task12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class File {
    private static void CopyFileBufferedRW() {
        String test = "12 hello smit";
        try (FileWriter fw = new FileWriter("text12.txt");
             BufferedWriter bw = new BufferedWriter(new FileWriter("newText12.txt"))) {
            for (int i = 0; i < test.length(); i++) {
                fw.write(test.charAt(i));
                bw.write(test.charAt(i));

            }

        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

    }


    public static void main(String[] args) {
        CopyFileBufferedRW();
    }
}


