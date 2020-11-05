
package var_cerra;

import java.util.ArrayList;

public class Rcompartido {

    private String datoCompartido;
    private Cerradura cerradura;
 

    
    Rcompartido(Cerradura c){
        datoCompartido="";
        cerradura = c;
      
      
    }
    
    public String getDatoCompartido() {
        boolean ban =false;
    return datoCompartido;
    }
    

 
    public void setDatoCompartido (String datoCompartido) {
       
        this.datoCompartido = datoCompartido;

    }
    
       public boolean isCerradura() {
        return cerradura.getCerradura();
    }
    public void setCerradura(boolean C) {
        this.cerradura.setCerradura(C);
    }
}