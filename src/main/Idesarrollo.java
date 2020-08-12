
package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fr4nk
 */
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import sqlite.Sqlite;
public class Idesarrollo extends javax.swing.JInternalFrame {

    /**
     * Creates new form Idesarrollo
     */
    private Sqlite db;
    private principal fmain;
    private String idClase;
    private String idTema;
    
    public Idesarrollo(Sqlite db, principal fmain) {
        this.db = db;
        this.fmain = fmain;
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtfNombreClase = new javax.swing.JTextField();
        addClase = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panSubtema = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtfConcepto = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAddImgConcepto = new javax.swing.JButton();
        txtfPathImgConcepto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtfSubtema = new javax.swing.JTextField();
        panEvaluacion = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtfPregunta = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnAddImgPregunta = new javax.swing.JButton();
        txtfPathImgPregunta = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        txtfOpt1 = new javax.swing.JTextField();
        txtfOpt2 = new javax.swing.JTextField();
        jRadioButton2 = new javax.swing.JRadioButton();
        txtfOpt3 = new javax.swing.JTextField();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnAñadirTema = new javax.swing.JButton();
        btnEditarClase = new javax.swing.JButton();
        btnAddTema = new javax.swing.JButton();
        btnEditarTema = new javax.swing.JButton();
        txtfTema = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jLabel1.setText("Nombre de la Clase");

        addClase.setText("+");
        addClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClaseActionPerformed(evt);
            }
        });

        txtfConcepto.setColumns(20);
        txtfConcepto.setRows(5);
        jScrollPane1.setViewportView(txtfConcepto);

        jLabel2.setText("Concepto");

        btnAddImgConcepto.setText("Añadir Imagen");
        btnAddImgConcepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddImgConceptoActionPerformed(evt);
            }
        });

        txtfPathImgConcepto.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnAddImgConcepto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtfPathImgConcepto, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfPathImgConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddImgConcepto))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jLabel5.setText("Titulo");

        javax.swing.GroupLayout panSubtemaLayout = new javax.swing.GroupLayout(panSubtema);
        panSubtema.setLayout(panSubtemaLayout);
        panSubtemaLayout.setHorizontalGroup(
            panSubtemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSubtemaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panSubtemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panSubtemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panSubtemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                        .addComponent(txtfSubtema)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panSubtemaLayout.setVerticalGroup(
            panSubtemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSubtemaLayout.createSequentialGroup()
                .addGroup(panSubtemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panSubtemaLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(panSubtemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtfSubtema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panSubtemaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(43, 43, 43))
        );

        jTabbedPane1.addTab("Subtema", panSubtema);

        txtfPregunta.setColumns(20);
        txtfPregunta.setRows(5);
        jScrollPane2.setViewportView(txtfPregunta);

        jLabel3.setText("Pregunta");

        btnAddImgPregunta.setText("Añadir Imagen");
        btnAddImgPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddImgPreguntaActionPerformed(evt);
            }
        });

        txtfPathImgPregunta.setEditable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAddImgPregunta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfPathImgPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddImgPregunta)
                    .addComponent(txtfPathImgPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jButton4.setText("jButton3");

        jRadioButton1.setText("Opcion1");

        jRadioButton2.setText("Opcion2");

        jRadioButton3.setText("Opcion3");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtfOpt1))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtfOpt2, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtfOpt3, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(txtfOpt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(txtfOpt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(txtfOpt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("Imagen");

        jLabel6.setText("Respuesta");

        javax.swing.GroupLayout panEvaluacionLayout = new javax.swing.GroupLayout(panEvaluacion);
        panEvaluacion.setLayout(panEvaluacionLayout);
        panEvaluacionLayout.setHorizontalGroup(
            panEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEvaluacionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
            .addGroup(panEvaluacionLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(panEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(panEvaluacionLayout.createSequentialGroup()
                        .addGroup(panEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        panEvaluacionLayout.setVerticalGroup(
            panEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEvaluacionLayout.createSequentialGroup()
                .addGroup(panEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panEvaluacionLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panEvaluacionLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel3)))
                .addGroup(panEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panEvaluacionLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel4))
                    .addGroup(panEvaluacionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panEvaluacionLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(77, 77, 77)
                .addComponent(jButton4)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Evaluación", panEvaluacion);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 874, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("+", jPanel7);

        btnAñadirTema.setText("Añadir Tema");
        btnAñadirTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirTemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAñadirTema)
                .addGap(90, 90, 90))
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAñadirTema)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnEditarClase.setText("Editar");
        btnEditarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClaseActionPerformed(evt);
            }
        });

        btnAddTema.setText("+");
        btnAddTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTemaActionPerformed(evt);
            }
        });

        btnEditarTema.setText("Editar");
        btnEditarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTemaActionPerformed(evt);
            }
        });

        jLabel7.setText("Tema");

        jMenu1.setText("Crear");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtfNombreClase)
                .addGap(18, 18, 18)
                .addComponent(addClase)
                .addGap(18, 18, 18)
                .addComponent(btnEditarClase)
                .addGap(71, 71, 71))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtfTema, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddTema)
                .addGap(18, 18, 18)
                .addComponent(btnEditarTema)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtfNombreClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addClase)
                    .addComponent(btnEditarClase))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(btnAddTema)
                    .addComponent(btnEditarTema))
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirTemaActionPerformed
        File pathImg = new File("src/main/images");
        String path = pathImg.getAbsolutePath();
        
        String subtema= this.txtfSubtema.getText();
        String concepto= this.txtfConcepto.getText();
        String pregunta= this.txtfPregunta.getText();
        String imgConcepto= this.txtfPathImgConcepto.getText();
        String imgPregunta= this.txtfPathImgPregunta.getText();
        int idSubtema= Integer.valueOf(fmain.extractColumn("subtemas","id_tema","WHERE id_subtema= (SELECT max(id_subtema) FROM subtemas)"));
        
        //Formatear cadena para extraer la extension de imgConcepto e imgPregunta
        String cImgExt= imgConcepto.substring(imgConcepto.lastIndexOf("."));
        String pImgExt=imgPregunta.substring(imgPregunta.lastIndexOf("."));
        
        //Importar imagenes
        
        File destinoC= new File(path+"c"+String.valueOf(idSubtema+1)+cImgExt);
        File origenC= new File(imgConcepto);
        
        File destinoP= new File(path+"r"+imgPregunta+ pImgExt);
        File origenP= new File(imgConcepto);
        
        fmain.copy(origenC,destinoC);
        fmain.copy(origenP, destinoP);
        
        //Path de la imagen accesible desde recursos
        imgConcepto="images/c"+String.valueOf(idSubtema+1)+cImgExt;
        imgPregunta="images/p"+String.valueOf(idSubtema+1)+pImgExt;
        
        if(subtema.equals("") || concepto.equals("") || pregunta.equals("")){
            JOptionPane.showMessageDialog(null, "Campos Obligatorios Incompletos");
        }else{
            String preQuery="insert into subtemas ( id_tema, id_clase, titulo, concepto, pregunta, img_concepto, img_pregunta) values (\'%s\',\'%s\', \'%s\', \'%s\', \'%s\', \'%s\', \'%s\');";
            String query= String.format(preQuery,idTema, idClase, subtema, concepto, pregunta, imgConcepto, imgPregunta);
            db.setQuery(query );
        }
            
        
            

    }//GEN-LAST:event_btnAñadirTemaActionPerformed

    private void btnAddImgConceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddImgConceptoActionPerformed
        String imagen;
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        imagen = f.getAbsolutePath();
        System.out.println(imagen);
        this.txtfPathImgConcepto.setText(imagen);
    }//GEN-LAST:event_btnAddImgConceptoActionPerformed

    private void addClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClaseActionPerformed
        String addClase="insert into clases (nombre_clase) values ('"+ txtfNombreClase.getText() +"')";
        db.setQuery(addClase);
        idClase=fmain.extractColumn("clases","id_clase","WHERE id_clase= (SELECT max(id_clase) FROM clases)");
        this.addClase.setEnabled(false);
        this.txtfNombreClase.setEditable(false);
    }//GEN-LAST:event_addClaseActionPerformed

    private void btnEditarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarClaseActionPerformed

    private void btnAddTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTemaActionPerformed
        String tema= this.txtfTema.getText();
        db.setQuery("insert into temas (nombre_tema, id_clase) values('"+ tema +"', "+ idClase+")");
        idTema=fmain.extractColumn("temas","id_tema","WHERE id_tema= (SELECT max(id_tema) FROM temas)");
        this.btnAddTema.setEnabled(false);
        this.txtfTema.setEditable(false);
    }//GEN-LAST:event_btnAddTemaActionPerformed

    private void btnEditarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarTemaActionPerformed

    private void btnAddImgPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddImgPreguntaActionPerformed
        String imagen;
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        imagen = f.getAbsolutePath();
        System.out.println(imagen);
        this.txtfPathImgPregunta.setText(imagen);
    }//GEN-LAST:event_btnAddImgPreguntaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addClase;
    private javax.swing.JButton btnAddImgConcepto;
    private javax.swing.JButton btnAddImgPregunta;
    private javax.swing.JButton btnAddTema;
    private javax.swing.JButton btnAñadirTema;
    private javax.swing.JButton btnEditarClase;
    private javax.swing.JButton btnEditarTema;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panEvaluacion;
    private javax.swing.JPanel panSubtema;
    private javax.swing.JTextArea txtfConcepto;
    private javax.swing.JTextField txtfNombreClase;
    private javax.swing.JTextField txtfOpt1;
    private javax.swing.JTextField txtfOpt2;
    private javax.swing.JTextField txtfOpt3;
    private javax.swing.JTextField txtfPathImgConcepto;
    private javax.swing.JTextField txtfPathImgPregunta;
    private javax.swing.JTextArea txtfPregunta;
    private javax.swing.JTextField txtfSubtema;
    private javax.swing.JTextField txtfTema;
    // End of variables declaration//GEN-END:variables

    void setMaximun(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
