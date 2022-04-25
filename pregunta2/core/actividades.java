package pregunta2.core;

import java.util.ArrayList;

public class actividades {
    private ArrayList<String> actividades = new ArrayList<String>();
    private String user;

    public void addActividad(String actividad) {
        actividades.add(actividad);
    }

    public void removeActividad(String actividad) {
        actividades.remove(actividad);
    }

    public void printActividades() {
        for (String actividad : actividades) {
            System.out.println(actividad);
        }
    }
}
