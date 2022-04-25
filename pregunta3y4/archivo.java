package pregunta3y4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class archivo {
    File file;
    FileWriter writer;
    public String textoInicial;

    public static void OpenFile(String Filename) throws FileNotFoundException {
        File file = new File(Filename);
        if (file.exists()) {
            Scanner read = new Scanner(file);
            while (read.hasNextLine()) {
                System.out.println(read.nextLine());
            }
            read.close();
        }

    }

    public static void WriteTextInFile(String Filename) throws IOException {
        Scanner read = new Scanner(System.in);
        File file = new File(Filename);
        FileWriter write = new FileWriter(file, false);
        System.out.println("Ingresa Nombre");
        write.write(read.nextLine());
        write.write('\n');
        System.out.println("Ingresa Edad");
        write.write(read.nextLine());
        write.close();
    }

    public static void leer(File file) {

    }
}
