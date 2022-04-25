package pregunta5;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main {
    public static void main(String[] args) {
        JFrame MainFrame = new JFrame("Escribir nombre");
        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainFrame.setSize(500, 500);

        JLabel Texto1 = new JLabel("Hola mundo c:");
        Texto1.setBounds(10, 10, 1000, 20);

        JLabel Texto2 = new JLabel("Escribe tu nombre");
        Texto2.setBounds(10, 50, 1000, 20);

        JTextField Nombre = new JTextField();
        Nombre.setBounds(10, 70, 200, 20);

        JButton boton1 = new JButton("Saludar");
        boton1.setBounds(10, 90, 80, 20);
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Texto1.setText("Hola " + Nombre.getText());
            }
        });

        MainFrame.add(Texto1);
        MainFrame.add(Texto2);
        MainFrame.add(Nombre);
        MainFrame.add(boton1);
        MainFrame.setLayout(null);
        MainFrame.setVisible(true);

    }

}
