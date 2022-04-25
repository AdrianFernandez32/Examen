package pregunta2.core;

import pregunta2.data.data;

public class usuario extends data {
    private String nombre;
    private String nombreUsuario;
    private String password;

    void login(String username, String password) {
        nombreUsuario = retrieveData("username");
        password = retrieveData("password");
    }

    public String getUsername() {
        return nombreUsuario;
    }
}
