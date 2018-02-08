/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.backing;

import beans.model.Candidato;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped

public class VacanteForm {

    /**
     * Creates a new instance of VacanteForm
     */
    public VacanteForm() {
    }
    @ManagedProperty(value = "#{candidato}")
    private Candidato candidato;

    public String enviar() {
        System.out.println("enviar nombre:" + this.candidato.getNombre());
        System.out.println("enviar apellido:" + this.candidato.getApellido());
        System.out.println("enviar sueldo deseado:" + this.candidato.getSueldoDeseado());
        if ("Juan".equals(this.candidato.getNombre())) {
            if(this.candidato.getApellido().equals("Perez")){
                String msg="Gracias Pero Juan Perez ya trabaja con nosotros";
                FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR,msg,msg);
                FacesContext facesContext = FacesContext.getCurrentInstance();
                String clientId = null;
                facesContext.addMessage(clientId,facesMessage);
                return "index";
            }
                
            return "exito";
        } else {
            return "fallo";
        }
    }

    /**
     * @return the candidato
     */
    public Candidato getCandidato() {
        return candidato;
    }

    /**
     * @param candidato the candidato to set
     */
    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

}
