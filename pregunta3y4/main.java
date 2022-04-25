package pregunta3y4;

import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException {
        archivo.WriteTextInFile("datos.txt", "hola");

        System.out.println('\n');
        System.out.println("Los datos del archivo son:");
        archivo.OpenFile("datos.txt");
    }

}
