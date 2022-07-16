package trabajofinal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ArchivoAlta {

    File ArchivoAlta;
    Alta A = new Alta();

    public void CrearArchivo() {
        try {
            
            ArchivoAlta = new File("AltaClientes.txt");
            if (ArchivoAlta.createNewFile()) {
                JOptionPane.showMessageDialog(null, "El archivo fue creado con exito");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void Escribir(Clientes clientes) {
        Alta A = new Alta();

        try {
            FileWriter escribir = new FileWriter(ArchivoAlta, true);

            escribir.write(clientes.getCuil() + ";" + clientes.getNombre() + ";" + clientes.getApellido() + ";" + clientes.getFdnac() + ";" + clientes.getGenero() + ";" + clientes.getDomicilio() + ";" + clientes.getLocalidad() + ";" + clientes.getProvincia() + ";" + clientes.getEmail() + ";" + clientes.getEcivil() + ";" + clientes.getHijos() + "\r\n");

            escribir.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }

}