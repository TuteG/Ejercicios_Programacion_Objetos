package ejercicio18;

import javax.swing.*;
import java.awt.event.*;

public class Formulario2 extends JFrame {

    private JLabel Mensaje;
    private JButton boton1;

    public Formulario2() {

        setLayout(null);
        Mensaje = new JLabel("Hola");
        Mensaje.setBounds(60, 20, 100, 100);
        add(Mensaje);
        boton1 = new JButton("1");
        boton1.setBounds(20, 110, 90, 30);
        add(boton1);
        //boton1.addActionListener(this);

    }

}
