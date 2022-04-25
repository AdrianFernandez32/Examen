package pregunta1;

import java.util.ArrayList;
import java.util.Scanner;

public class carrito {
    Scanner leer = new Scanner(System.in);
    int id;
    ArrayList<String> articulos = new ArrayList<String>();

    private carrito() {
        id = leer.nextInt();
    }

    public void adding(String element) {
        articulos.add(element);
    }

    public void removing(String element) {
        articulos.remove(element);
    }

    public void displaying() {
        for (String articulo : articulos) {
            System.out.println(articulo);
        }
    }
}
