
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class Menus extends javax.swing.JFrame {

    /**
     * Creates new form Menus
     */
    public Menus() {
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

        barraMenus = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuitemAbrir = new javax.swing.JMenuItem();
        menuitemGuardar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuitemSalir = new javax.swing.JMenuItem();
        menuEdicion = new javax.swing.JMenu();
        menuColores = new javax.swing.JMenu();
        menuitemRojo = new javax.swing.JMenuItem();
        menuitemVerde = new javax.swing.JMenuItem();
        menuitemAzul = new javax.swing.JMenuItem();
        menuInsertar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuArchivo.setText("Archivo");

        menuitemAbrir.setText("Abrir");
        menuArchivo.add(menuitemAbrir);

        menuitemGuardar.setText("Guardar");
        menuArchivo.add(menuitemGuardar);
        menuArchivo.add(jSeparator1);

        menuitemSalir.setText("Salir");
        menuArchivo.add(menuitemSalir);

        barraMenus.add(menuArchivo);

        menuEdicion.setText("Edicion\n");

        menuColores.setText("Colores");

        menuitemRojo.setText("Rojo");
        menuitemRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemRojoActionPerformed(evt);
            }
        });
        menuColores.add(menuitemRojo);

        menuitemVerde.setText("Verde");
        menuitemVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemVerdeActionPerformed(evt);
            }
        });
        menuColores.add(menuitemVerde);

        menuitemAzul.setText("Azul");
        menuitemAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemAzulActionPerformed(evt);
            }
        });
        menuColores.add(menuitemAzul);

        menuEdicion.add(menuColores);

        barraMenus.add(menuEdicion);

        menuInsertar.setText("Insertar");
        barraMenus.add(menuInsertar);

        setJMenuBar(barraMenus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuitemRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemRojoActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.RED);
    }//GEN-LAST:event_menuitemRojoActionPerformed

    private void menuitemVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemVerdeActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.GREEN);
    }//GEN-LAST:event_menuitemVerdeActionPerformed

    private void menuitemAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemAzulActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.BLUE);
    }//GEN-LAST:event_menuitemAzulActionPerformed

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
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenus;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuColores;
    private javax.swing.JMenu menuEdicion;
    private javax.swing.JMenu menuInsertar;
    private javax.swing.JMenuItem menuitemAbrir;
    private javax.swing.JMenuItem menuitemAzul;
    private javax.swing.JMenuItem menuitemGuardar;
    private javax.swing.JMenuItem menuitemRojo;
    private javax.swing.JMenuItem menuitemSalir;
    private javax.swing.JMenuItem menuitemVerde;
    // End of variables declaration//GEN-END:variables
}
