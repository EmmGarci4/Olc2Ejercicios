/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intefaz;

import Analizador.util.Archivo;
import Analizador.AnalizadorLenguaje;
import Analizador.util.MiError;
import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

/**
 *
 * @author Emely
 */
public class Principal extends javax.swing.JFrame {

    private final JFileChooser chooser;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.chooser = new JFileChooser();
        chooser.setFileFilter(new FileNameExtensionFilter("Archivo Lenguaje", "txt"));
        this.setSize(853, 705);
        this.setMinimumSize(new Dimension(448, 490));
        this.setTitle("Editor");
        nuevaPestaña();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jSplitPane1 = new javax.swing.JSplitPane();
        pestañas = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tx_consola = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ASA");

        jSplitPane1.setDividerLocation(200);
        jSplitPane1.setDividerSize(5);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane1.setLastDividerLocation((this.getSize().height*70)/100);
        jSplitPane1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                ResizeJS1(evt);
            }
        });
        jSplitPane1.setLeftComponent(pestañas);

        tx_consola.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(tx_consola);

        jSplitPane1.setRightComponent(jScrollPane1);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Archivo");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Abrir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Guardar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Guardar Como");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu5.setText("Pestañas");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Nueva Pestaña");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Cerrar Pestaña");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuBar1.add(jMenu5);

        jMenu2.setText("Herramientas");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Errores ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu6.setText("Ejecutar");

        jMenuItem4.setText("Ejercicio 1");
        jMenuItem4.setToolTipText("10 Palabras más usadas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem4);

        jMenuItem8.setText("Ejercicio 2");
        jMenuItem8.setToolTipText("Descomponer numero en unidades,decenas,etc");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        jMenuItem9.setText("Ejercicio 3");
        jMenuItem9.setToolTipText("Palabra más larga y más corta");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem9);

        jMenuItem10.setText("Ejercicio 5");
        jMenuItem10.setToolTipText("Eliminar Parentesis innecesarios");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //**ABRIR
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        AbrirArchivo();
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    //**GUARDAR
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        GuardarArchivo();
    }//GEN-LAST:event_jMenuItem5ActionPerformed
    //**GUARDARCOMO
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        GuardarComoArchivo();
    }//GEN-LAST:event_jMenuItem6ActionPerformed
    //**CERRARPESTAÑA
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        cerrarpestaña();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    //**NUEVAPESTAÑA XML  
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        nuevaPestaña();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void ResizeJS1(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ResizeJS1
        jSplitPane1.setDividerLocation((this.getSize().height * 70) / 100);
    }//GEN-LAST:event_ResizeJS1
    //**VER ERRORES
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (AnalizadorLenguaje.getErrores() != null) {
            //errores en ambos
            ArrayList<MiError> errores = new ArrayList<>();
            errores.addAll(AnalizadorLenguaje.getErrores());
            if (!errores.isEmpty()) {
                new TablaErrores(errores).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "No hay errores para mostrar");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay errores para mostrar");
        }


    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
         MyTab mytab = getCurrentTab();
        if (mytab != null) {
            System.out.println("ANALIZANDO......");
            if (AnalizadorLenguaje.Analizar(mytab.getText(),1)) {
                escribirInformacionExitoEnConsola("Finalizado con éxito");
            } else {
                escribirErrorEnConsola("Finalizado con errores");
                AnalizadorLenguaje.getErrores().stream().forEach((er) -> {
                    escribirErrorEnConsola(er.toString());
                });
            }
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
         MyTab mytab = getCurrentTab();
        if (mytab != null) {
            System.out.println("ANALIZANDO......");
            if (AnalizadorLenguaje.Analizar(mytab.getText(),2)) {
                escribirInformacionExitoEnConsola("Finalizado con éxito");
            } else {
                escribirErrorEnConsola("Finalizado con errores");
                AnalizadorLenguaje.getErrores().stream().forEach((er) -> {
                    escribirErrorEnConsola(er.toString());
                });
            }
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
         MyTab mytab = getCurrentTab();
        if (mytab != null) {
            System.out.println("ANALIZANDO......");
            if (AnalizadorLenguaje.Analizar(mytab.getText(),3)) {
                escribirInformacionExitoEnConsola("Finalizado con éxito");
            } else {
                escribirErrorEnConsola("Finalizado con errores");
                AnalizadorLenguaje.getErrores().stream().forEach((er) -> {
                    escribirErrorEnConsola(er.toString());
                });
            }
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
         MyTab mytab = getCurrentTab();
        if (mytab != null) {
            System.out.println("ANALIZANDO......");
            if (AnalizadorLenguaje.Analizar(mytab.getText(),5)) {
                escribirInformacionExitoEnConsola("Finalizado con éxito");
            } else {
                escribirErrorEnConsola("Finalizado con errores");
                AnalizadorLenguaje.getErrores().stream().forEach((er) -> {
                    escribirErrorEnConsola(er.toString());
                });
            }
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });

    }

    //<editor-fold defaultstate="collapsed" desc="Generated Code">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane pestañas;
    private static javax.swing.JTextPane tx_consola;
    // End of variables declaration//GEN-END:variables
    //</editor-fold> 

    //**************************************************************************
    private MyTab getCurrentTab() {
        MyTab mytab = ((MyTab) pestañas.getSelectedComponent());
        if (mytab.isEmptyText()) {
            JOptionPane.showMessageDialog(this, "No hay código para analizar");
            return null;
        }
        tx_consola.setText("");
        AnalizadorLenguaje.getInstancia();
        AnalizadorLenguaje.LimpiarInstancia();
        return mytab;
    }

    //PESTAÑAS
    private void nuevaPestaña(String texto, String titulo, String path) {
        pestañas.add(new MyTab(texto, path), titulo);
        pestañas.setSelectedIndex(pestañas.getTabCount() - 1);
    }

    private void cerrarpestaña() {
        if (pestañas.getTabCount() > 0) {
            MyTab t = (MyTab) pestañas.getSelectedComponent();
            if (t.isEmptyText()) {
                int a = pestañas.getSelectedIndex();
                pestañas.remove(a);
                if (a < pestañas.getTabCount()) {
                    pestañas.setSelectedIndex(a);
                } else {
                    pestañas.setSelectedIndex(pestañas.getTabCount() - 1);
                }
                if (pestañas.getTabCount() == 0) {
                    nuevaPestaña();
                }
                return;
            }
            int r = JOptionPane.showConfirmDialog(this, "¿Desea guardar el archivo?");
            switch (r) {
                case 0:
                    if (t.getPath() == null) {
                        GuardarArchivo();
                    } else {
                        Archivo.GuardarArchivo(t.getText(), t.getPath());
                    }
                case 1:
                    int a = pestañas.getSelectedIndex();
                    pestañas.remove(a);
                    if (a < pestañas.getTabCount()) {
                        pestañas.setSelectedIndex(a);
                    } else {
                        pestañas.setSelectedIndex(pestañas.getTabCount() - 1);
                    }
                    break;
            }
            if (pestañas.getTabCount() == 0) {
                nuevaPestaña();
            }
        }
    }

    private void nuevaPestaña() {
        pestañas.add(new MyTab(), "Nuevo " + (pestañas.getTabCount() + 1));
        pestañas.setSelectedIndex(pestañas.getTabCount() - 1);
    }

    //ARCHIVOS
    private void AbrirArchivo() {
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File archivo = chooser.getSelectedFile();
            String texto = Archivo.AbrirArchivo(archivo);
            System.out.println(archivo.getAbsolutePath());
            nuevaPestaña(texto, archivo.getName(), archivo.getAbsolutePath());
        }
    }

    private void GuardarArchivo() {
        MyTab t = (MyTab) pestañas.getSelectedComponent();
        if (t.getPath() != null) {
            Archivo.GuardarArchivo(t.getText(), t.getPath());
        } else {
            GuardarComoArchivo();
        }
    }

    private void GuardarComoArchivo() {
        if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            String ruta = chooser.getSelectedFile().toString();
            MyTab p = (MyTab) pestañas.getSelectedComponent();
            p.setPath(ruta);
            //colocar titulo
            pestañas.setTitleAt(pestañas.getSelectedIndex(), new File(ruta).getName());
            Archivo.GuardarArchivo(p.getText(), ruta);
        }
    }

    //CONTROL DE CONSOLA *******************************************************
    /**
     *
     * @param mensaje
     */
    public static void escribirMensajeEnConsola(String mensaje) {
        String separador = Pattern.quote("\\n");
        String[] mensajes = mensaje.split(separador);
        //config
        StyleContext sc = StyleContext.getDefaultStyleContext();
        AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, Color.BLACK);
        aset = sc.addAttribute(aset, StyleConstants.FontFamily, "Monospaced");
        aset = sc.addAttribute(aset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);

        for (String m : mensajes) {
            tx_consola.setCaretPosition(tx_consola.getDocument().getLength());
            tx_consola.setCharacterAttributes(aset, false);
            tx_consola.replaceSelection(m + "\n");
        }
    }

    public static void escribirInformacionEnConsola(String mensaje) {
        String separador = Pattern.quote("\\n");
        String[] mensajes = mensaje.split(separador);
        //config
        StyleContext sc = StyleContext.getDefaultStyleContext();
        AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, Color.BLUE);
        aset = sc.addAttribute(aset, StyleConstants.FontFamily, "Monospaced");
        aset = sc.addAttribute(aset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);

        for (String m : mensajes) {
            tx_consola.setCaretPosition(tx_consola.getDocument().getLength());
            tx_consola.setCharacterAttributes(aset, false);
            tx_consola.replaceSelection(m + "\n");
        }

    }

    public static void escribirInformacionExitoEnConsola(String mensaje) {
        String separador = Pattern.quote("\\n");
        String[] mensajes = mensaje.split(separador);
        //config
        StyleContext sc = StyleContext.getDefaultStyleContext();
        AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, Color.GREEN);
        aset = sc.addAttribute(aset, StyleConstants.FontFamily, "Monospaced");
        aset = sc.addAttribute(aset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);

        for (String m : mensajes) {
            tx_consola.setCaretPosition(tx_consola.getDocument().getLength());
            tx_consola.setCharacterAttributes(aset, false);
            tx_consola.replaceSelection(m + "\n");
        }

    }

    public static void escribirErrorEnConsola(String mensaje) {
        String separador = Pattern.quote("\\n");
        String[] mensajes = mensaje.split(separador);
        //config
        StyleContext sc = StyleContext.getDefaultStyleContext();
        AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, Color.RED);
        aset = sc.addAttribute(aset, StyleConstants.FontFamily, "Monospaced");
        aset = sc.addAttribute(aset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);

        for (String m : mensajes) {
            tx_consola.setCaretPosition(tx_consola.getDocument().getLength());
            tx_consola.setCharacterAttributes(aset, false);
            tx_consola.replaceSelection(m + "\n");
        }
    }

}
