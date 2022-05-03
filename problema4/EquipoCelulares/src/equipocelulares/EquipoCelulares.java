
package equipocelulares;

public class EquipoCelulares {
    
    private String sistemaOperativo;
    private int pantallaTamanio;
    private double costo_inicial;
    private double iva;
    private double costoIva;
    private String direccion_mac;
    private String info_imei;
    private double costo_final;
    
    public void establecerSistemaOperativo(String x){
        sistemaOperativo = x;
    }
    
    public void establecerPantallaTamanio(int x){
        pantallaTamanio = x;
    }
    
    public void establecerCostoInicial(double x){
        costo_inicial = x;
    }
    
    public void establecerIva(double x){
        iva = x;
    }
    
    public void calcularCostoIva(){
        costoIva = costo_inicial * iva;
    }
    
    public void establecerDireccionMac(String x){
        direccion_mac = x;
    }
    
    public void establecerInfoImei(String x){
        info_imei = x;
    }
    
    public void calcularCostoFinal(){
        costo_final = costoIva + costo_inicial;
    }
    
    public String obtenerSistemaOperativo(){
        return sistemaOperativo;
    }
    
    public int obtenerPantallaTamanio(){
        return pantallaTamanio;
    }
    
    public double obtenerCostoInicial(){
        return costo_inicial;
    }
    
    public double obtenerIva(){
        return iva;
    }
    
    public double obtenerCostoIva(){
        return costoIva;
    }
    
    public String obtenerDireccionMac(){
        return direccion_mac;
    }
    
    public String obtenerInfoImei(){
        return info_imei;
    }
    
    public double obtenerCostoFinal(){
        return costo_final;
    }
    
}
