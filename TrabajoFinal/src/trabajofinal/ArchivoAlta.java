/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajofinal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 *
 * @author User
 */
public class ArchivoAlta {

    File ArchivoAlta;
    Alta A = new Alta();

    public void CrearArchivo() {
        try {
            //crear el archivo
            ArchivoAlta = new File("Alta de Clientes.txt");
            if (ArchivoAlta.createNewFile()) {
                JOptionPane.showMessageDialog(null, "El archivo fue creado con exito");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void Escribir(Clientes clientes) {
        Alta B = new Alta();

        try {
            FileWriter escribir = new FileWriter(ArchivoAlta, true);
            escribir.write(clientes.getCuil() + ";" + clientes.getNombre() + ";" + clientes.getApellido() + ";" + clientes.getFdnac() + ";" + clientes.getBox1() + ";" + clientes.getBox2() + ";" + clientes.getDomicilio() + ";" + clientes.getLocalidad() + ";" + clientes.getProvincia() + ";" + clientes.getEmail() + ";" + clientes.getBox3() + ";" + clientes.getBox4() + ";" + clientes.getBox5() + ";" + clientes.getHijos() + "\r\n");
            escribir.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
