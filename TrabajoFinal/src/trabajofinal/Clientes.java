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
    String Cuil, nombre, apellido, fdnac, domicilio, genero, localidad, provincia, email, ecivil, hijos;

    public Clientes(String Cuil, String nombre, String apellido, String fdnac, String domicilio, String genero, String localidad, String provincia, String email, String ecivil, String hijos) {
        this.Cuil = Cuil;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fdnac = fdnac;
        this.domicilio = domicilio;
        this.genero = genero;
        this.localidad = localidad;
        this.provincia = provincia;
        this.email = email;
        this.ecivil = ecivil;
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

    public String getGenero() {
        return genero;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getEmail() {
        return email;
    }

    public String getEcivil() {
        return ecivil;
    }

    public String getHijos() {
        return hijos;
    }

    
    
    
}
