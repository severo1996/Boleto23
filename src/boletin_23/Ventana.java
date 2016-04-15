package boletin_23;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana {
    public void MetodoBOLETO(){
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JFrame frame = new JFrame();           
    
    String[] strings = { "objeto1", "objeto2", "objeto3"};
    JList lista = new JList(strings);
    JButton boton3 = new JButton("botonera");
    JTextArea area = new JTextArea("area de escritura");
    
    //panel.setLayout(new GridLayout(3,2));
    JLabel etiqueta = new JLabel("nombre     ");
    JLabel etiqueta2 = new JLabel("contraseña");
    JTextField nombre = new JTextField(6);
    JPasswordField contraseña = new JPasswordField(6);
    JButton botonera1 = new JButton("clickea");
    JButton botonera2 = new JButton("limpiar");
    FlowLayout dis = new FlowLayout(FlowLayout.CENTER,3,2);
    dis.setHgap(100);
    dis.setVgap(100);
    
    panel.setBounds(0,0,400,400);
    panel.setBackground(Color.white);
    panel.add(etiqueta);
    panel.add(nombre);
    panel.add(etiqueta2);
    panel.add(contraseña);
    panel.add(botonera1);
    panel.add(botonera2);
    
    panel2.setBackground(Color.blue);
    panel2.setBounds(0,450,400,400);
    panel2.add(lista);
    panel2.add(boton3);
    panel2.add(area);
    
    panel.setLayout(dis);
    
    frame.setSize(400,800);
    frame.add(panel2);
    frame.add(panel);       
    
    frame.setLayout(null);
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}