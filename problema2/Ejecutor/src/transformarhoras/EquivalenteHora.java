package transformarhoras;

public class EquivalenteHora {
    
    private int horas;
    private int minutos;
    private int segundos;
    private int dias;
    
    public void establecereHoras(int x){
        horas = x;
    }
    
    public void calcularMinutos(){
        minutos = 60 * horas;
    }
    
    public void calcularSegundos(){
        segundos = 3600 * horas;
    }
    
    public void calcularDias(){
        dias = horas/24;
    }
    
    public int obtenerHoras(){
        return horas;
    }
    
    public int obtenerMinutos(){
        return minutos;
    }
    
    public int obtenerSegundos(){
        return segundos;
    }
    
    public int obtenerDias(){
        return dias;
    }
    
}
