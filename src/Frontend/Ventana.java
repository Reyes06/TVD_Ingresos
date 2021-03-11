
package Frontend;

import DB.ApolloBR;
import DB.ApolloBR.serviciosBR;
import DB.Cobro;
import HumbertoChitay.Acumulador;
import HumbertoChitay.Analizador;
import HumbertoChitay.Analizador.paises;
import HumbertoChitay.ServiciosSV.SV;
import HumbertoChitay.ServiciosCR.CR;
import HumbertoChitay.ServiciosGT.GT;
import HumbertoChitay.ServiciosHN.HN;
import HumbertoChitay.ServiciosNI.NI;
import java.text.DecimalFormat;
import java.util.HashMap;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
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
        jTable6.setCellSelectionEnabled(true);
        jTable7.setCellSelectionEnabled(true);
        jTable8.setCellSelectionEnabled(true);
        jTable10.setCellSelectionEnabled(true);
        setLocationRelativeTo(null);
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analisis reporte de ingresos - Televida");

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

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Nombre", "Amount", "Conteo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable6.setRowSelectionAllowed(false);
        jScrollPane6.setViewportView(jTable6);

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Nombre", "Conteo", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable7.setRowSelectionAllowed(false);
        jScrollPane7.setViewportView(jTable7);

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Nombre", "Amount", "Conteo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable8.setRowSelectionAllowed(false);
        jScrollPane8.setViewportView(jTable8);

        jLabel3.setText("Panama:");

        jLabel4.setText("Peru:");

        jLabel5.setText("Africa:");

        jLabel6.setText("Bolivia:");

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Nombre", "Conteo", "Ingresos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable10.setRowSelectionAllowed(false);
        jScrollPane9.setViewportView(jTable10);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                    .addComponent(jScrollPane7)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                    .addComponent(jScrollPane6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("ApolloBR", jPanel1);

        jButton1.setText("Procesar cobros Humberto Chitay");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Fecha/Hora:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(502, 502, 502))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton1)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fileChooser = new JFileChooser("C:\\Users\\ADMReina\\Downloads");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Zip files", "zip", "rar"));
        int seleccion = fileChooser.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            
            HashMap<Analizador.paises, HashMap> cobrosPaises = Analizador.procesarCobros(fileChooser.getSelectedFile());
            
            Acumulador temp;
            
            /*GT = jTable1*/
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
            jLabel2.setText(guatemala.get(GT.FECHA).getFecha());
            
            /*SV = jTable2*/
            DefaultTableModel modeloSV = (DefaultTableModel) jTable2.getModel();
            HashMap<SV, Acumulador> salvador = cobrosPaises.get(paises.SV);
            temp = salvador.get(SV.CLUBDORADO);
            modeloSV.addRow(new Object[]{"CLUB DORADO", temp.getConteo(), temp.getSuma()});
            temp = salvador.get(SV.YOMILLONARIO);
            modeloSV.addRow(new Object[]{"YO MILLONARIO", temp.getConteo(), temp.getSuma()});
            temp = salvador.get(SV.MIDOCTOR);
            modeloSV.addRow(new Object[]{"CLUB DORADO PREMIUM", temp.getConteo(), temp.getSuma()});
            temp = salvador.get(SV.ELCUPONAZO);
            modeloSV.addRow(new Object[]{"EL CUPONAZO", temp.getConteo(), temp.getSuma()});
            temp = salvador.get(SV.GUIASALUD);
            modeloSV.addRow(new Object[]{"CLARO SALUD", temp.getConteo(), temp.getSuma()});
            temp = salvador.get(SV.MEGAPROMO);
            modeloSV.addRow(new Object[]{"SUEÑOS DE NAVIDAD", temp.getConteo(), temp.getSuma()});
            
            /*HN = jTable3*/
            DefaultTableModel modeloHN = (DefaultTableModel) jTable3.getModel();
            HashMap<HN, Acumulador> honduras = cobrosPaises.get(paises.HN);
            temp = honduras.get(HN.CLUBDORADO1);
            modeloHN.addRow(new Object[]{"CLUB DORADO 1", temp.getConteo(), temp.getSuma()});
            temp = honduras.get(HN.CLUBDORADO2);
            modeloHN.addRow(new Object[]{"CLUB DORADO 2", temp.getConteo(), temp.getSuma()});
            temp = honduras.get(HN.CLUBDORADO3);
            modeloHN.addRow(new Object[]{"CLUB DORADO 3", temp.getConteo(), temp.getSuma()});
            temp = honduras.get(HN.YOMILLONARIO);
            modeloHN.addRow(new Object[]{"YO MILLONARIO", temp.getConteo(), temp.getSuma()});
            temp = honduras.get(HN.CLUBDORADOPREMIUM);
            modeloHN.addRow(new Object[]{"CLUB DORADO PREMIUM", temp.getConteo(), temp.getSuma()});
            temp = honduras.get(HN.GANAMANIA);
            modeloHN.addRow(new Object[]{"GANAMANIA", temp.getConteo(), temp.getSuma()});
            temp = honduras.get(HN.GUIASALUD);
            modeloHN.addRow(new Object[]{"CLARO SALUD", temp.getConteo(), temp.getSuma()});
            temp = honduras.get(HN.LAPROMO);
            modeloHN.addRow(new Object[]{"RASPICLARO", temp.getConteo(), temp.getSuma()});
            temp = honduras.get(HN.MEGAPROMO);
            modeloHN.addRow(new Object[]{"RUTA 3114", temp.getConteo(), temp.getSuma()});
            temp = honduras.get(HN.ELCUPONAZO);
            modeloHN.addRow(new Object[]{"EL CUPONAZO", temp.getConteo(), temp.getSuma()});
            temp = honduras.get(HN.MIDOCTOR);
            modeloHN.addRow(new Object[]{"SUMMER PARTY", temp.getConteo(), temp.getSuma()});
            temp = honduras.get(HN.PROMOVERANO);
            modeloHN.addRow(new Object[]{"RUTA 3671", temp.getConteo(), temp.getSuma()});
            
            /*HN = jTable3*/
            DefaultTableModel modeloNI = (DefaultTableModel) jTable4.getModel();
            HashMap<NI, Acumulador> nicaragua = cobrosPaises.get(paises.NI);
            temp = nicaragua.get(NI.CLUBDORADO1);
            modeloNI.addRow(new Object[]{"CLUB DORADO 1", temp.getConteo(), temp.getSuma()});
            temp = nicaragua.get(NI.MIDOCTOR);
            modeloNI.addRow(new Object[]{"CLUB DORADO 2", temp.getConteo(), temp.getSuma()});
            temp = nicaragua.get(NI.CLUBDORADO3);
            modeloNI.addRow(new Object[]{"CLUB DORADO 3", temp.getConteo(), temp.getSuma()});
            temp = nicaragua.get(NI.CLUBDORADOPREMIUM);
            modeloNI.addRow(new Object[]{"CLUB DORADO PREMIUM", temp.getConteo(), temp.getSuma()});
            temp = nicaragua.get(NI.YOMILLONARIO);
            modeloNI.addRow(new Object[]{"YO MILLONARIO", temp.getConteo(), temp.getSuma()});
            temp = nicaragua.get(NI.CLUBDORADO4);
            modeloNI.addRow(new Object[]{"CLUB DORADO 4", temp.getConteo(), temp.getSuma()});
            temp = nicaragua.get(NI.GUIASALUD);
            modeloNI.addRow(new Object[]{"CLARO SALUD", temp.getConteo(), temp.getSuma()});
            
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
            
            /*ApolloBR = jTable6*/
            DefaultTableModel modeloBR = (DefaultTableModel) jTable6.getModel();
            modeloBR.addRow(new Object[]{"-----", "Club dorado - Claro PA", "-----", "-----"});
            modeloBR.addRow(new Object[]{"-----", "Guia salud  - Claro PA", "-----", "-----"});
            modeloBR.addRow(new Object[]{"-----", "Miximania   - Claro PA", "-----", "-----"});
            
            /*ApolloBR = jTable7*/
            ApolloBR br = new ApolloBR();
            modeloBR = (DefaultTableModel) jTable7.getModel();
            HashMap<serviciosBR, Cobro> tabla2 = br.obtenerCobrosPeru();
            Cobro tempC = tabla2.get(serviciosBR.ClaroPE);
            modeloBR.addRow(new Object[]{tempC.getFecha(), "Doctor y salud  - Claro Peru", tempC.getCantidad(), tempC.getAmount()});
            
            /*ApolloBR = jTable8 y jTable10*/
            HashMap<serviciosBR, Cobro> tabla = br.obtenerCobrosAfrica();
            tempC = tabla.get(serviciosBR.GoFitness);
            DecimalFormat df = new DecimalFormat("#");
            modeloBR.addRow(new Object[]{tempC.getFecha(), "GoFitness - Entel Peru", tempC.getCantidad(), df.format(tempC.getAmount())});
            modeloBR = (DefaultTableModel) jTable8.getModel();
            modeloBR.addRow(new Object[]{tempC.getFecha(), "Doctor & Salud - VivaBo", "-----", "-----"});
            tempC = tabla.get(serviciosBR.Telkom);
            modeloBR = (DefaultTableModel) jTable10.getModel();
            modeloBR.addRow(new Object[]{tempC.getFecha(), "Mobiafya - Telkom Kenya", tempC.getCantidad(), tempC.getAmount()});
            tempC = tabla.get(serviciosBR.Safaricom);
            modeloBR.addRow(new Object[]{tempC.getFecha(), "Mobiafya - Safaricom Kenya", tempC.getCantidad(), tempC.getAmount()});
            
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    // End of variables declaration//GEN-END:variables
}
