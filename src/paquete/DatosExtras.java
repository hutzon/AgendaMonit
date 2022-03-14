
package paquete;

/**
 *
 * @author OTTONIEL CAMPOS
 */
public class DatosExtras {
    public int noRestAgendaDvr;
    public int idRestDvr;
    
    

    public int getIdRestDvr() {
        System.out.println(idRestDvr + "Valor dentro del get");
        return idRestDvr;
    }

    public void setIdRestDvr(int idRestDvr) {
        System.out.println(idRestDvr + "Valor dentro del set");
        
        this.idRestDvr = idRestDvr;
    }

    public int getNoRestAgendaDvr() {
        return noRestAgendaDvr;
    }

    public void setNoRestAgendaDvr(int noRestAgendaDvr) {
        this.noRestAgendaDvr = noRestAgendaDvr;
    }
    
    public int valorId(){
      int resultado = idRestDvr;
        System.out.println(resultado);
      return resultado;
    }
    
    
    
}
