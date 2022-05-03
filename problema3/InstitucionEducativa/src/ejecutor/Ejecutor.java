
package ejecutor;
import institucioneducativa.InstitucionEducativa;

public class Ejecutor {

    public static void main(String[] args){
        
        InstitucionEducativa datosInst1 = new InstitucionEducativa();
        InstitucionEducativa datosInst2 = new InstitucionEducativa();
        
        datosInst1.establecerNombre("La Inmaculada");
        datosInst1.establecerTipoInstitucion("Fiscomisional");
        datosInst1.establecerNumAlum(515);
        datosInst1.establecerNumDoc(45);
        datosInst1.establecerNumSedes(5);
        datosInst1.establecerGastosAlum(50.45);
        datosInst1.calcularPresupuesto();
        
        datosInst2.establecerNombre("Antonio Peña Celi");
        datosInst2.establecerTipoInstitucion("Privada");
        datosInst2.establecerNumAlum(635);
        datosInst2.establecerNumDoc(50);
        datosInst2.establecerNumSedes(3);
        datosInst2.establecerGastosAlum(150.45);
        datosInst2.calcularPresupuesto();
        
        System.out.printf("INSTITUCION EDUCATIVA 1 \n \nNombre: %s\nTipo: %s\n"
                + "N° Alumnos: %d\nN°Docentes: %d\nN° Sedes: %d\n"
                + "Gastos por Alumno: %.2f\nPresupuesto: %.2f\n",
                datosInst1.obtenerNombre(), datosInst1.obtenerTipoInstitucion(),
                datosInst1.obtenerNumAlum(), datosInst1.obtenerNumDoc(),
                datosInst1.obtenerNumSedes(), datosInst1.obtenerGastosAlum(),
                datosInst1.obtenerPresupuesto());
        
              System.out.printf("\nINSTITUCION EDUCATIVA 2 \n \nNombre: %s\nTipo: %s\n"
                + "N° Alumnos: %d\nN°Docentes: %d\nN° Sedes: %d\n"
                + "Gastos por Alumno: %.2f\nPresupuesto: %.2f\n",
                datosInst2.obtenerNombre(), datosInst2.obtenerTipoInstitucion(),
                datosInst2.obtenerNumAlum(), datosInst2.obtenerNumDoc(),
                datosInst2.obtenerNumSedes(), datosInst2.obtenerGastosAlum(),
                datosInst2.obtenerPresupuesto());
    }
}
