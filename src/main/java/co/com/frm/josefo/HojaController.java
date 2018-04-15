package co.com.frm.josefo;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author fernando
 */
@Named(value = "hojaController")
@ViewScoped
public class HojaController implements Serializable {
    
    private String dato;

    /**
     * Creates a new instance of HojaController
     */
    public HojaController() {
    }
    
    @PostConstruct
    public void init(){
        this.dato = "Hola";
    }
    
    public void Guardar(){
        FacesContext context = FacesContext.getCurrentInstance();
        if(!dato.isEmpty()){
            context.addMessage(null, new FacesMessage("Mensaje", "El registro se ha guardado exitosamente"));
        } else{
            context.addMessage(null, new FacesMessage("Error", "No han completado los datos necesarios."));
        }        
    }    

    /**
     * @return the dato
     */
    public String getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(String dato) {
        this.dato = dato;
    }
    
}
