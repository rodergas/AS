/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import PresentationLayer.CtrlVistaComprarEntrada;
import DomainModel.StructRepresentacio;
import Excepcions.seientsNoDisp;
import java.util.ArrayList;
import javax.swing.JList;

/**
 *
 * @author Alex
 */
public class LocalSessionFrame extends javax.swing.JFrame {
    private String[] r;
    private ArrayList<StructRepresentacio> aux;
    /**
     * Creates new form LocalSessionFrame
     */
    public LocalSessionFrame(ArrayList<StructRepresentacio> rep) {
        //initComponents();
        aux = rep;
        agafarRepresentacions(rep);
        initComponents2();
        
    }
    //Inicializa el form
 private void initComponents2() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jList1 = new JList(r);
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        jLabel1.setText("Representacio");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = r;
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });

        jLabel2.setText("Nombre espectadors");

        jSpinner1.setMinimumSize(new java.awt.Dimension(50, 20));
        jSpinner1.setPreferredSize(new java.awt.Dimension(50, 20));
        
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("");
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(66, 66, 66))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jList1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jList1)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
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
        jList1 = new javax.swing.JList<String>();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        jLabel1.setText("Representacio");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });

        jLabel2.setText("Nombre espectadors");

        jSpinner1.setMinimumSize(new java.awt.Dimension(50, 20));
        jSpinner1.setPreferredSize(new java.awt.Dimension(50, 20));

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Message area");
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(66, 66, 66))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jList1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jList1)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    int nEspc = (Integer) jSpinner1.getValue();
    if(nEspc < 1) this.jTextArea1.setText("El nombre d'espectadors no és vàlid");
    else{
        String rep = jList1.getSelectedValue();
        if(rep != null){
            Integer index = jList1.getSelectedIndex();
            CtrlVistaComprarEntrada CCDCE = new CtrlVistaComprarEntrada();
            try{
                CCDCE.PrOkAssignaOcupacio(aux.get(index).getNomLocal(), aux.get(index).getSessio().toString(), nEspc);
                 this.dispose();
            }catch(seientsNoDisp s){
                this.jTextArea1.setText(s.getMessage());
            }
           
        }else{
            this.jTextArea1.setText("No s'ha escollit una representació");
        }
    }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LocalSessionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LocalSessionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LocalSessionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LocalSessionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new LocalSessionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private static javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
//Es crea el string a mostrar per pantalla
public void agafarRepresentacions(ArrayList<StructRepresentacio> rep){
    r = new String[rep.size()];
    for(int i = 0; i < rep.size(); ++i) {
        String res = "";
        res += rep.get(i).getNomLocal() + ", ";
        res += rep.get(i).getSessio().toString()+ ", ";
        res += String.valueOf(rep.get(i).getNombreSeientsLliure()) +" seients lliures, ";
        if(rep.get(i).isEstrena()) res += "Estrena, ";
        else res += "No Estrena, ";
        res +=  String.valueOf(rep.get(i).getPreu()) + "€";
        r[i] = res;
    }
}

}
