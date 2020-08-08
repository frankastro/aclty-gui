/*
    Clase para agregar una imagen como fondo de un panel
    Para agregar a un jframe 
    1) Crear un objeto background con un parametro de constructor "<ruta imagen>"
    2) En el constructor antes de initComponents() agregar this.setContentPane(<objeto background>);

    Para agregar a un panel
    1) Acceder a customize code, seleccionar custom creation y crear el panel como new background("<ruta de la imagen>");
 */
 package main;


import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class background  extends javax.swing.JPanel{
    private Image img ;
    private String resource;
    
    public background(String resource){
        this.resource= resource;
    }
    public void paint(Graphics g){
        img = new ImageIcon(getClass().getResource(resource)).getImage();
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }

}
