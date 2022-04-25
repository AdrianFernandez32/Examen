package pregunta1;

import java.util.Scanner;

public class productos {
    Scanner leer = new Scanner(System.in);
    int id;
    String nombre;
    int precio;

    private productos() {
        id = leer.nextInt();
    }

    private void setPrecio(int costo) {
        this.precio = costo;
    }

    private void setNombre(String name) {
        this.nombre = name;
    }

    public int getPrecio() {
        if (precio > 0) {
            return precio;
        } else {
            System.out.println("Precio no válido");
            return (Integer) null;
        }
    }
}