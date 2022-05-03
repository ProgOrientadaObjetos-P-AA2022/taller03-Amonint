
package ejecutor;
import transformarhoras.EquivalenteHora;

public class Ejecutor {

    
    public static void main(String[] args) {
        
        EquivalenteHora transfHoras1 = new EquivalenteHora();
        EquivalenteHora transfHoras2 = new EquivalenteHora();
       
        transfHoras1.establecereHoras(83);
        transfHoras1.calcularMinutos();
        transfHoras1.calcularSegundos();
        transfHoras1.calcularDias();
        
        transfHoras2.establecereHoras(120);
        transfHoras2.calcularMinutos();
        transfHoras2.calcularSegundos();
        transfHoras2.calcularDias();
        
        System.out.printf("Horas a tranformar: %d\nEquivalente en minutos: %d"
                + " minutos\nEquivalente en segundos: %d segundos"
                + "\nEquivalente en días: %d dias\n",
        transfHoras1.obtenerHoras(), transfHoras1.obtenerMinutos(),
        transfHoras1.obtenerSegundos(), transfHoras1.obtenerDias());
        
        System.out.printf("\nHoras a tranformar: %d\nEquivalente en minutos: %d"
                + " minutos\nEquivalente en segundos: %d segundos"
                + "\nEquivalente en días: %d dias\n",
        transfHoras2.obtenerHoras(), transfHoras2.obtenerMinutos(),
        transfHoras2.obtenerSegundos(), transfHoras2.obtenerDias());
        
    }
    
}
