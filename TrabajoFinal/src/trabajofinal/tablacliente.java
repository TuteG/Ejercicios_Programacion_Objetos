package trabajofinal;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

public class tablacliente extends javax.swing.JInternalFrame {

    DefaultTableModel Cli = new DefaultTableModel();

    public tablacliente() {
        initComponents();
        cargarTabla();

    }

    private void cargarTabla() {
        try {
            Cli.addColumn("CUIL/CUIT");
            Cli.addColumn("NOMBRE");
            Cli.addColumn("APELLIDO");
            Cli.addColumn("FECHA DE NACIMIENTO");
            Cli.addColumn("LOCALIDAD");
            Cli.addColumn("DOMICILIO");
            Cli.addColumn("GENERO");
            Cli.addColumn("PROVINCIA");
            Cli.addColumn("EMAIL");
            Cli.addColumn("ESTADO CIVIL");
            Cli.addColumn("HIJOS");
            TablaC.setModel(Cli);

            cargarArchivo();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private void cargarArchivo() throws IOException {
        String fila[];

        try {
            FileReader archivo = new FileReader("AltaClientes.txt");
            BufferedReader leer = new BufferedReader(archivo);

            String linea = leer.readLine();

            while (linea != null) {
                fila = linea.split(";");
                Cli.addRow(fila);
                linea = leer.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaC = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setTitle("BANCORP - Clientes");

        TablaC.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        TablaC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaC);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setText("INFORME DE CLIENTES");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BANCORP");

        jButton1.setText("Ver Archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(jLabel5)
                .addContainerGap(333, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void abrirarchivo(String AltaClientes) {

        try {

            File abrir = new File(AltaClientes);
            Desktop.getDesktop().open(abrir);

        } catch (IOException ex) {

            System.out.println(ex);

        }

    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        abrirarchivo("C:\\Users\\User\\Documents\\GitHub\\Ejercicios_Programacion_Objetos\\TrabajoFinal\\AltaClientes.txt");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaC;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
