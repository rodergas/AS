/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import PresentationLayer.CtrlVistaComprarEntrada;
import DomainModel.StructFilaColumna;
import Excepcions.seientsNoCoincideixen;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Alex
 */
public class TriaSeientsFrame extends javax.swing.JFrame {
    private Integer[] estado;
    private Integer seleccionados = 0;
    /**
     * Creates new form TriaSeientsFrame
     */
    public TriaSeientsFrame(ArrayList<StructFilaColumna> seients) {
        //initComponents();
        estado = new Integer[30];
        for (int i = 0; i < estado.length; ++i) estado[i] = 5;
        for (int i = 0; i < seients.size(); ++i){
            int fila = seients.get(i).getFila();
            int col = seients.get(i).getColumna();
            int pos = (fila-1) * 5;
            pos = pos + (col-1);
            estado[pos] = 0;   
        }
        initComponents2();
    }
    
    
    private void initComponents2() {
        
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        jLabel1.setText("Seients");

        jInternalFrame2.setClosable(true);
        jInternalFrame2.setIconifiable(true);
        jInternalFrame2.setMaximizable(true);
        jInternalFrame2.setResizable(true);
        jInternalFrame2.setTitle("Compra Entrada");

        jLabel2.setText("Seients");

        jButton1.setText("OK");

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        
        ImageIcon verde = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
        ImageIcon azul = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
        ImageIcon rojo = new ImageIcon(getClass().getResource("/Imagenes/red_transparent.png"));
        
        if (estado[0] == 0) jButton6 = new JButton(verde);
        else jButton6 = new JButton(rojo);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        
        if (estado[1] == 0) jButton7 = new JButton(verde);
        else jButton7 = new JButton(rojo);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        
        if (estado[2] == 0) jButton8 = new JButton(verde);
        else jButton8 = new JButton(rojo);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        
        if (estado[3] == 0) jButton9 = new JButton(verde);
        else jButton9 = new JButton(rojo);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        
        if (estado[4] == 0) jButton10 = new JButton(verde);
        else jButton10 = new JButton(rojo);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        
        if (estado[5] == 0) jButton11 = new JButton(verde);
        else jButton11 = new JButton(rojo);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        
        if (estado[6] == 0) jButton12 = new JButton(verde);
        else jButton12 = new JButton(rojo);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        
        if (estado[7] == 0) jButton13 = new JButton(verde);
        else jButton13 = new JButton(rojo);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        
        if (estado[8] == 0) jButton14 = new JButton(verde);
        else jButton14 = new JButton(rojo);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        
        if (estado[9] == 0) jButton15 = new JButton(verde);
        else jButton15 = new JButton(rojo);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        
        if (estado[10] == 0) jButton16 = new JButton(verde);
        else jButton16 = new JButton(rojo);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        
        if (estado[11] == 0) jButton17 = new JButton(verde);
        else jButton17 = new JButton(rojo);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        
        if (estado[12] == 0) jButton18 = new JButton(verde);
        else jButton18 = new JButton(rojo);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        
        if (estado[29] == 0) jButton35 = new JButton(verde);
        else jButton35 = new JButton(rojo);
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        
        if (estado[13] == 0) jButton19 = new JButton(verde);
        else jButton19 = new JButton(rojo);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        
        if (estado[14] == 0) jButton20 = new JButton(verde);
        else jButton20 = new JButton(rojo);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        
        if (estado[15] == 0) jButton21 = new JButton(verde);
        else jButton21 = new JButton(rojo);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        
        if (estado[16] == 0) jButton22 = new JButton(verde);
        else jButton22 = new JButton(rojo);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        
        if (estado[28] == 0) jButton34 = new JButton(verde);
        else jButton34 = new JButton(rojo);
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        
        if (estado[17] == 0) jButton23 = new JButton(verde);
        else jButton23 = new JButton(rojo);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        
        if (estado[18] == 0) jButton24 = new JButton(verde);
        else jButton24 = new JButton(rojo);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        
        if (estado[19] == 0) jButton25 = new JButton(verde);
        else jButton25 = new JButton(rojo);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        
        if (estado[20] == 0) jButton26 = new JButton(verde);
        else jButton26 = new JButton(rojo);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        
        if (estado[21] == 0) jButton27 = new JButton(verde);
        else jButton27 = new JButton(rojo);
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        
        if (estado[22] == 0) jButton28 = new JButton(verde);
        else jButton28 = new JButton(rojo);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        
        if (estado[23] == 0) jButton29 = new JButton(verde);
        else jButton29 = new JButton(rojo);
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        
        if (estado[24] == 0) jButton30 = new JButton(verde);
        else jButton30 = new JButton(rojo);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        
        if (estado[25] == 0) jButton31 = new JButton(verde);
        else jButton31 = new JButton(rojo);
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        
        if (estado[26] == 0) jButton32 = new JButton(verde);
        else jButton32 = new JButton(rojo);
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        
        if (estado[27] == 0) jButton33 = new JButton(verde);
        else jButton33 = new JButton(rojo);
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Message area");
        jScrollPane1.setViewportView(jTextArea1);

        jButton3.setText("OK");

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(70, 70, 70))))
            .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame2Layout.createSequentialGroup()
                    .addGap(160, 160, 160)
                    .addComponent(jButton3)
                    .addContainerGap(160, Short.MAX_VALUE)))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame2Layout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(jButton3)
                    .addContainerGap(65, Short.MAX_VALUE)))
        );

        jButton4.setText("OK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Cancel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("");
        jScrollPane2.setViewportView(jTextArea2);

        jButton6.setText("");
        //jButton6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/sillonazul.png"))); // NOI18N

        jButton7.setText("");

        jButton8.setText("");

        jButton9.setText("");

        jButton10.setText("");

        jButton11.setText("");

        jButton12.setText("");

        jButton13.setText("");

        jButton14.setText("");

        jButton15.setText("");

        jButton16.setText("");

        jButton17.setText("");

        jButton18.setText("");

        jButton19.setText("");

        jButton20.setText("");

        jButton21.setText("");

        jButton22.setText("");

        jButton23.setText("");

        jButton24.setText("");

        jButton25.setText("");

        jButton26.setText("");

        jButton27.setText("");

        jButton28.setText("");

        jButton29.setText("");

        jButton30.setText("");

        jButton31.setText("");

        jButton32.setText("");

        jButton33.setText("");

        jButton34.setText("");

        jButton35.setText("");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addGap(86, 86, 86))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jButton24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton10)
                    .addComponent(jButton11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(jButton13)
                    .addComponent(jButton14)
                    .addComponent(jButton15)
                    .addComponent(jButton16)
                    .addComponent(jButton17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18)
                    .addComponent(jButton19)
                    .addComponent(jButton20)
                    .addComponent(jButton21)
                    .addComponent(jButton22)
                    .addComponent(jButton23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton24)
                    .addComponent(jButton25)
                    .addComponent(jButton26)
                    .addComponent(jButton27)
                    .addComponent(jButton28)
                    .addComponent(jButton29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton30)
                    .addComponent(jButton31)
                    .addComponent(jButton32)
                    .addComponent(jButton33)
                    .addComponent(jButton34)
                    .addComponent(jButton35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1)
                .addContainerGap())
        );

        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        jLabel1.setText("Seients");

        jInternalFrame2.setClosable(true);
        jInternalFrame2.setIconifiable(true);
        jInternalFrame2.setMaximizable(true);
        jInternalFrame2.setResizable(true);
        jInternalFrame2.setTitle("Compra Entrada");

        jLabel2.setText("Seients");

        jButton1.setText("OK");

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Message area");
        jScrollPane1.setViewportView(jTextArea1);

        jButton3.setText("OK");

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(70, 70, 70))))
            .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame2Layout.createSequentialGroup()
                    .addGap(160, 160, 160)
                    .addComponent(jButton3)
                    .addContainerGap(160, Short.MAX_VALUE)))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame2Layout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(jButton3)
                    .addContainerGap(65, Short.MAX_VALUE)))
        );

        jButton4.setText("OK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Cancel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Message area");
        jScrollPane2.setViewportView(jTextArea2);

        jButton6.setText("jButton6");
        jButton6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/sillonazul.png"))); // NOI18N

        jButton7.setText("jButton7");

        jButton8.setText("jButton8");

        jButton9.setText("jButton9");

        jButton10.setText("jButton10");

        jButton11.setText("jButton11");

        jButton12.setText("jButton12");

        jButton13.setText("jButton13");

        jButton14.setText("jButton14");

        jButton15.setText("jButton15");

        jButton16.setText("jButton16");

        jButton17.setText("jButton17");

        jButton18.setText("jButton18");

        jButton19.setText("jButton19");

        jButton20.setText("jButton20");

        jButton21.setText("jButton21");

        jButton22.setText("jButton22");

        jButton23.setText("jButton23");

        jButton24.setText("jButton24");

        jButton25.setText("jButton25");

        jButton26.setText("jButton26");

        jButton27.setText("jButton27");

        jButton28.setText("jButton28");

        jButton29.setText("jButton29");

        jButton30.setText("jButton30");

        jButton31.setText("jButton31");

        jButton32.setText("jButton32");

        jButton33.setText("jButton33");

        jButton34.setText("jButton34");

        jButton35.setText("jButton35");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addGap(86, 86, 86))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jButton24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton10)
                    .addComponent(jButton11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(jButton13)
                    .addComponent(jButton14)
                    .addComponent(jButton15)
                    .addComponent(jButton16)
                    .addComponent(jButton17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18)
                    .addComponent(jButton19)
                    .addComponent(jButton20)
                    .addComponent(jButton21)
                    .addComponent(jButton22)
                    .addComponent(jButton23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton24)
                    .addComponent(jButton25)
                    .addComponent(jButton26)
                    .addComponent(jButton27)
                    .addComponent(jButton28)
                    .addComponent(jButton29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton30)
                    .addComponent(jButton31)
                    .addComponent(jButton32)
                    .addComponent(jButton33)
                    .addComponent(jButton34)
                    .addComponent(jButton35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
    Si es prem el botó "Cancel" s'acaba l'execució del programa
    */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed
    /*
    Quan es prem "Ok", obtenim una instància del CtrlVistaComprarEntrada que aquest 
    s'encargarà de cridar a domini per obtenir el preu dels seients seleccionats i els tipus de canvis disponibles.
    Si el nombre de seients seleccionats no correspon amb el nombre d'espectadors introduit anteriorment
    es mostrarà un missatge d'error
    */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
            ArrayList<StructFilaColumna> seientsseleccionats = new ArrayList<>();
            for (int i = 0; i < estado.length; ++i){
                if (estado[i] == 2){
                    int fila = (i/5) + 1;
                    int col = (i%5) + 1;
                    StructFilaColumna SFC = new StructFilaColumna(fila,col);
                    seientsseleccionats.add(SFC);
                }
            }
            CtrlVistaComprarEntrada CCDCE = new CtrlVistaComprarEntrada();
            CCDCE.PrOkSeleccionarSeients(seientsseleccionats);
            this.dispose();
        } catch(seientsNoCoincideixen e){
            this.jTextArea2.setText(e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (estado[0] == 0){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
            jButton6.setIcon(i);
            estado[0] = 2;
            ++seleccionados;
        }
        else if (estado[0] == 2){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
            jButton6.setIcon(i);
            estado[0] = 0;
            --seleccionados;
        }  
        // TODO add your handling code here:
    } 
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        if (estado[1] == 0){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
            jButton7.setIcon(i);
            estado[1] = 2;
            ++seleccionados;
        }
        else if (estado[1] == 2){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
            jButton7.setIcon(i);
            estado[1] = 0;
            --seleccionados;
        }  
    }
    
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        if (estado[2] == 0){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
            jButton8.setIcon(i);
            estado[2] = 2;
            ++seleccionados;
        }
        else if (estado[2] == 2){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
            jButton8.setIcon(i);
            estado[2] = 0;
            --seleccionados;
        }  
    }
    
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
        if (estado[3] == 0){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
            jButton9.setIcon(i);
            estado[3] = 2;
            ++seleccionados;
        }
        else if (estado[3] == 2){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
            jButton9.setIcon(i);
            estado[3] = 0;
            --seleccionados;
        }  
    }
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
        if (estado[4] == 0){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
            jButton10.setIcon(i);
            estado[4] = 2;
            ++seleccionados;
        }
        else if (estado[4] == 2){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
            jButton10.setIcon(i);
            estado[4] = 0;
            --seleccionados;
        }  
    }
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
        if (estado[5] == 0){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
            jButton11.setIcon(i);
            estado[5] = 2;
            ++seleccionados;
        }
        else if (estado[5] == 2){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
            jButton11.setIcon(i);
            estado[5] = 0;
            --seleccionados;
        }  
    }
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
        if (estado[6] == 0){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
            jButton12.setIcon(i);
            estado[6] = 2;
            ++seleccionados;
        }
        else if (estado[6] == 2){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
            jButton12.setIcon(i);
            estado[6] = 0;
            --seleccionados;
        }  
    }
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
        if (estado[7] == 0){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
            jButton13.setIcon(i);
            estado[7] = 2;
            ++seleccionados;
        }
        else if (estado[7] == 2){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
            jButton13.setIcon(i);
            estado[7] = 0;
            --seleccionados;
        }
    }
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
        if (estado[8] == 0){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
            jButton14.setIcon(i);
            estado[8] = 2;
            ++seleccionados;
        }
        else if (estado[8] == 2){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
            jButton14.setIcon(i);
            estado[8] = 0;
            --seleccionados;
        }
    }
    
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {
        if (estado[9] == 0){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
            jButton15.setIcon(i);
            estado[9] = 2;
            ++seleccionados;
        }
        else if (estado[9] == 2){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
            jButton15.setIcon(i);
            estado[9] = 0;
            --seleccionados;
        }
    }
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {
        if (estado[10] == 0){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
            jButton16.setIcon(i);
            estado[10] = 2;
            ++seleccionados;
        }
        else if (estado[10] == 2){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
            jButton16.setIcon(i);
            estado[10] = 0;
            --seleccionados;
        }
    }
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {
        if (estado[11] == 0){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
            jButton17.setIcon(i);
            estado[11] = 2;
            ++seleccionados;
        }
        else if (estado[11] == 2){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
            jButton17.setIcon(i);
            estado[11] = 0;
            --seleccionados;
        }
    }
    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {
        if (estado[12] == 0){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
            jButton18.setIcon(i);
            estado[12] = 2;
            ++seleccionados;
        }
        else if (estado[12] == 2){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
            jButton18.setIcon(i);
            estado[12] = 0;
            --seleccionados;
        }
    }
    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {
        if (estado[13] == 0){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
            jButton19.setIcon(i);
            estado[13] = 2;
            ++seleccionados;
        }
        else if (estado[13] == 2){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
            jButton19.setIcon(i);
            estado[13] = 0;
            --seleccionados;
        }
    }
    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {
        if (estado[14] == 0){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
            jButton20.setIcon(i);
            estado[14] = 2;
            ++seleccionados;
        }
        else if (estado[14] == 2){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
            jButton20.setIcon(i);
            estado[14] = 0;
            --seleccionados;
        }
    }
    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {
        if (estado[15] == 0){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
            jButton21.setIcon(i);
            estado[15] = 2;
            ++seleccionados;
        }
        else if (estado[15] == 2){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
            jButton21.setIcon(i);
            estado[15] = 0;
            --seleccionados;
        }
    }
    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {
        if (estado[16] == 0){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
            jButton22.setIcon(i);
            estado[16] = 2;
            ++seleccionados;
        }
        else if (estado[16] == 2){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
            jButton22.setIcon(i);
            estado[16] = 0;
            --seleccionados;
        }
    }
    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {
        if (estado[17] == 0){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
            jButton23.setIcon(i);
            estado[17] = 2;
            ++seleccionados;
        }
        else if (estado[17] == 2){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
            jButton23.setIcon(i);
            estado[17] = 0;
            --seleccionados;
        }
    }
    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {
        if (estado[18] == 0){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
            jButton24.setIcon(i);
            estado[18] = 2;
            ++seleccionados;
        }
        else if (estado[18] == 2){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
            jButton24.setIcon(i);
            estado[18] = 0;
            --seleccionados;
        }
    }
    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {
        if (estado[19] == 0){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
            jButton25.setIcon(i);
            estado[19] = 2;
            ++seleccionados;
        }
        else if (estado[19] == 2){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
            jButton25.setIcon(i);
            estado[19] = 0;
            --seleccionados;
        }
    }
    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {
        if (estado[20] == 0){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
            jButton26.setIcon(i);
            estado[20] = 2;
            ++seleccionados;
        }
        else if (estado[20] == 2){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
            jButton26.setIcon(i);
            estado[20] = 0;
            --seleccionados;
        }
    }
    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {
        if (estado[21] == 0){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
            jButton27.setIcon(i);
            estado[21] = 2;
            ++seleccionados;
        }
        else if (estado[21] == 2){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
            jButton27.setIcon(i);
            estado[21] = 0;
            --seleccionados;
        }
    }
    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {
        if (estado[22] == 0){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
            jButton28.setIcon(i);
            estado[22] = 2;
            ++seleccionados;
        }
        else if (estado[22] == 2){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
            jButton28.setIcon(i);
            estado[22] = 0;
            --seleccionados;
        }
    }
    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {
        if (estado[23] == 0){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
            jButton29.setIcon(i);
            estado[23] = 2;
            ++seleccionados;
        }
        else if (estado[23] == 2){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
            jButton29.setIcon(i);
            estado[23] = 0;
            --seleccionados;
        }
    }
    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {
        if (estado[24] == 0){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
            jButton30.setIcon(i);
            estado[24] = 2;
            ++seleccionados;
        }
        else if (estado[24] == 2){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
            jButton30.setIcon(i);
            estado[24] = 0;
            --seleccionados;
        }
    }
    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {
        if (estado[25] == 0){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
            jButton31.setIcon(i);
            estado[25] = 2;
            ++seleccionados;
        }
        else if (estado[25] == 2){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
            jButton31.setIcon(i);
            estado[25] = 0;
            --seleccionados;
        }
    }
    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {
        if (estado[26] == 0){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
            jButton32.setIcon(i);
            estado[26] = 2;
            ++seleccionados;
        }
        else if (estado[26] == 2){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
            jButton32.setIcon(i);
            estado[26] = 0;
            --seleccionados;
        }
    }
    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {
        if (estado[27] == 0){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
            jButton33.setIcon(i);
            estado[27] = 2;
            ++seleccionados;
        }
        else if (estado[27] == 2){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
            jButton33.setIcon(i);
            estado[27] = 0;
            --seleccionados;
        }
    }
    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {
        if (estado[28] == 0){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
            jButton34.setIcon(i);
            estado[28] = 2;
            ++seleccionados;
        }
        else if (estado[28] == 2){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
            jButton34.setIcon(i);
            estado[28] = 0;
            --seleccionados;
        }
    }
    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {
        if (estado[29] == 0){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/blue_transparent.png"));
            jButton35.setIcon(i);
            estado[29] = 2;
            ++seleccionados;
        }
        else if (estado[29] == 2){
            ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/green_transparent.png"));
            jButton35.setIcon(i);
            estado[29] = 0;
            --seleccionados;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TriaSeientsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TriaSeientsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TriaSeientsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TriaSeientsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new TriaSeientsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
