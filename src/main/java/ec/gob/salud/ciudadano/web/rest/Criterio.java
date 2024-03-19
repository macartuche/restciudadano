package ec.gob.salud.ciudadano.web.rest;

 
public class Criterio {

    private String identificacion;
    private String fecha;

    public String getIdentificacion(){
        return identificacion;
    }

    public void setIdentificacion(String identificacion){
        this.identificacion = identificacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Criterio{" + "identificacion=" + identificacion + ", fecha=" + fecha + '}';
    }
    
  
}

