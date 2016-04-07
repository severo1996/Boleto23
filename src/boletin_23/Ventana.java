/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    public void MetodoPorQueSi(){
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JFrame frame = new JFrame();
    
   
    
    
    String[] strings = { "elemento1", "elemento2", "elemento3"};
    JList lista = new JList(strings);
    JButton boton3 = new JButton("boton");
    JTextArea area = new JTextArea("area de texto");
    
    //panel.setLayout(new GridLayout(3,2));
    JLabel etiqueta = new JLabel("nome          ");
    JLabel etiqueta2 = new JLabel("password");
    JTextField nome = new JTextField(6);
    JPasswordField contrasinal = new JPasswordField(6);
    JButton boton1 = new JButton("premer");
    JButton boton2 = new JButton("limpar");
    FlowLayout dis = new FlowLayout(FlowLayout.CENTER,3,2);
    dis.setHgap(100);
    dis.setVgap(100);
    
    panel.setBounds(0,0,400,400);
    panel.setBackground(Color.red);
    panel.add(etiqueta);
    panel.add(nome);
    panel.add(etiqueta2);
    panel.add(contrasinal);
    panel.add(boton1);
    panel.add(boton2);
    
    panel2.setBackground(Color.green);
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