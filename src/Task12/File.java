package Task12;

import java.io.*;

class FileCopy {


    public static void main(String[] args) {
        try (FileReader fr = new FileReader("C:/foto/javadev/ws/JavaItAcadem/src/Task12/first");
             FileWriter fw = new FileWriter("C:/foto/javadev/ws/JavaItAcadem/src/Task12/sucond")) {
            int c = fr.read();
            while (c != -1) {
                fw.write(c);
                c = fr.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
