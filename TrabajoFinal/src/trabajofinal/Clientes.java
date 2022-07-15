/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajofinal;

/**
 *
 * @author User
 */
public class Clientes {
    String Cuil, nombre, apellido, fdnac, domicilio, localidad, box1, box2, box3, box4, box5, provincia, email, hijos;
    
    public Clientes(String Cuil, String nombre, String apellido, String fdnac, String domicilio, String localidad, String box1, String box2, String box3, String box4, String box5, String provincia, String email, String hijos) {
        this.Cuil = Cuil;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fdnac = fdnac;
        this.domicilio = domicilio;
        this.localidad = localidad;
        this.box1 = box1;
        this.box2 = box2;
        this.box3 = box3;
        this.box4 = box4;
        this.box5 = box5;
        this.provincia = provincia;
        this.email = email;
        this.hijos = hijos;
    }

    public String getCuil() {
        return Cuil;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFdnac() {
        return fdnac;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getBox1() {
        return box1;
    }

    public String getBox2() {
        return box2;
    }

    public String getBox3() {
        return box3;
    }

    public String getBox4() {
        return box4;
    }

    public String getBox5() {
        return box5;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getEmail() {
        return email;
    }

    public String getHijos() {
        return hijos;
    }
    
    


}
