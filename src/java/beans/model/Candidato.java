/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.model;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author fhilip
 */
@Named(value = "candidato")
@RequestScoped
public class Candidato {

    /**
     * Creates a new instance of Candidato
     */
    public Candidato() {
    }

    private String nombre = " Escribir Nombre ";
    private String apellido = " Escribir apellido ";

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    private String sueldoDeseado = "Ingresa Sueldo";

    /**
     * Get the value of sueldoDeseado
     *
     * @return the value of sueldoDeseado
     */
    public String getSueldoDeseado() {
        return sueldoDeseado;
    }

    /**
     * Set the value of sueldoDeseado
     *
     * @param sueldoDeseado new value of sueldoDeseado
     */
    public void setSueldoDeseado(String sueldoDeseado) {
        this.sueldoDeseado = sueldoDeseado;
    }

}
