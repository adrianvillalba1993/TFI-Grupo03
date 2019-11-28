package LAB2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by adrian on 18/11/2019.
 */
public class Ventana extends JFrame {

    public Ventana(){
        setSize(800,600);
        setLocationRelativeTo(null);
        setResizable(false);

        setTitle("Don car");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        JPanel panel = new JPanel();
        JButton boton = new JButton("agregar");
        panel.add(boton);
        add(panel);
        //botones + escuchadores
    }

}





