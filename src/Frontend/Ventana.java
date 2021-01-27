
package Frontend;

import HumbertoChitay.Acumulador;
import HumbertoChitay.Analizador;
import HumbertoChitay.Analizador.paises;
import HumbertoChitay.ServiciosCR.CR;
import HumbertoChitay.ServiciosGT.GT;
import java.util.HashMap;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eddy Reyes
 */
public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        jTable1.setCellSelectionEnabled(true);
        jTable2.setCellSelectionEnabled(true);
        jTable3.setCellSelectionEnabled(true);
        jTable4.setCellSelectionEnabled(true);
        jTable5.setCellSelectionEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Conteo", "Suma"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowSelectionAllowed(false);
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        jTabbedPane1.addTab("Guatemala", jScrollPane1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Conteo", "Suma"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setRowSelectionAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        jTabbedPane1.addTab("El Salvador", jScrollPane2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Conteo", "Suma"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setRowSelectionAllowed(false);
        jScrollPane3.setViewportView(jTable3);

        jTabbedPane1.addTab("Honduras", jScrollPane3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Conteo", "Suma"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setRowSelectionAllowed(false);
        jScrollPane4.setViewportView(jTable4);

        jTabbedPane1.addTab("Nicaragua", jScrollPane4);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Conteo", "Suma"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable5.setRowSelectionAllowed(false);
        jScrollPane5.setViewportView(jTable5);

        jTabbedPane1.addTab("Costa Rica", jScrollPane5);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton1)
                .addGap(26, 26, 26)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            
            HashMap<Analizador.paises, HashMap> cobrosPaises = Analizador.procesarCobros(fileChooser.getSelectedFile());
            
            Acumulador temp;
            
            /*GT = jTable5*/
            DefaultTableModel modeloGT = (DefaultTableModel) jTable1.getModel();
            HashMap<GT, Acumulador> guatemala = cobrosPaises.get(paises.GT);
            temp = guatemala.get(GT.CLUBDORADO1);
            modeloGT.addRow(new Object[]{"CLUB DORADO 1", temp.getConteo(), temp.getSuma()});
            temp = guatemala.get(GT.CLUBDORADO2);
            modeloGT.addRow(new Object[]{"CLUB DORADO 2", temp.getConteo(), temp.getSuma()});
            temp = guatemala.get(GT.CLUBDORADO3);
            modeloGT.addRow(new Object[]{"CLUB DORADO 3", temp.getConteo(), temp.getSuma()});
            temp = guatemala.get(GT.YOMILLONARIO);
            modeloGT.addRow(new Object[]{"YO MILLONARIO", temp.getConteo(), temp.getSuma()});
            temp = guatemala.get(GT.GANAMANIA);
            modeloGT.addRow(new Object[]{"GANAMANIA", temp.getConteo(), temp.getSuma()});
            temp = guatemala.get(GT.LAPROMO);
            modeloGT.addRow(new Object[]{"PROMO 13X12", temp.getConteo(), temp.getSuma()});
            temp = guatemala.get(GT.ELCUPONAZO);
            modeloGT.addRow(new Object[]{"EL CUPONAZO", temp.getConteo(), temp.getSuma()});
            temp = guatemala.get(GT.CLAROSALUD);
            modeloGT.addRow(new Object[]{"CLARO SALUD", temp.getConteo(), temp.getSuma()});
            temp = guatemala.get(GT.MEGAPROMO);
            modeloGT.addRow(new Object[]{"RUTA 14", temp.getConteo(), temp.getSuma()});
            temp = guatemala.get(GT.RECARGAYGANA);
            modeloGT.addRow(new Object[]{"RECARGA Y GANA", temp.getConteo(), temp.getSuma()});
            temp = guatemala.get(GT.MIDOCTOR);
            modeloGT.addRow(new Object[]{"MI DOCTOR", temp.getConteo(), temp.getSuma()});
            
            /*CR = jTable5*/
            DefaultTableModel modeloCR = (DefaultTableModel) jTable5.getModel();
            HashMap<CR, Acumulador> costaRica = cobrosPaises.get(paises.CR);
            temp = costaRica.get(CR.CLUBDORADO);
            modeloCR.addRow(new Object[]{"CLUB DORADO", temp.getConteo(), temp.getSuma()});
            temp = costaRica.get(CR.MIDOCTOR);
            modeloCR.addRow(new Object[]{"CLUB DORADO PREMIUM", temp.getConteo(), temp.getSuma()});
            temp = costaRica.get(CR.SANTAREGALON);
            modeloCR.addRow(new Object[]{"PROMO MEGANAVIDAD", temp.getConteo(), temp.getSuma()});
            temp = costaRica.get(CR.GRADUADOSVERANO);
            modeloCR.addRow(new Object[]{"GRADUADOS DE VERANO", temp.getConteo(), temp.getSuma()});
            temp = costaRica.get(CR.GUIASALUD);
            modeloCR.addRow(new Object[]{"CLARO SALUD", temp.getConteo(), temp.getSuma()});
            
            
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    // End of variables declaration//GEN-END:variables
}
