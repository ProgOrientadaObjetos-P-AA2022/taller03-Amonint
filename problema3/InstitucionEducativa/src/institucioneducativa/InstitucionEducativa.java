
package institucioneducativa;

public class InstitucionEducativa {
    
    private String nombre;
    private String tipoInstitucion;
    private int numAlum;
    private int numDoc;
    private int numSedes;
    private double gastosAlum;
    private double presupuesto;
    
    public void establecerNombre(String x){
        nombre = x;
    }
    
    public void establecerTipoInstitucion(String x){
        tipoInstitucion = x;
    }
    
    public void establecerNumAlum(int x){
        numAlum = x;
    }
    
    public void establecerNumDoc(int x){
        numDoc = x;
    }
    
    public void establecerNumSedes(int x){
        numSedes = x;
    }
    
    public void establecerGastosAlum(double x){
        gastosAlum = x;
    }
    
    public void calcularPresupuesto(){
        presupuesto = gastosAlum * numAlum;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerTipoInstitucion(){
        return tipoInstitucion;
    }
    
    public int obtenerNumAlum(){
        return numAlum;
    }
    
    public int obtenerNumDoc(){
        return numDoc;
    }
    
    public int obtenerNumSedes(){
        return numSedes;
    }
    
    public double obtenerGastosAlum(){
        return gastosAlum;
    }
    
    public double obtenerPresupuesto(){
        return presupuesto;
    }
    
}
