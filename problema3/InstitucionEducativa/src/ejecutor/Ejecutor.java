
package ejecutor;
import institucioneducativa.InstitucionEducativa;

public class Ejecutor {

    public static void main(String[] args){
        
        InstitucionEducativa datosInst1 = new InstitucionEducativa();
        InstitucionEducativa datosInst2 = new InstitucionEducativa();
        
        datosInst1.establecerNombre("San Gabriel");
        datosInst1.establecerTipoInstitucion("Privada");
        datosInst1.establecerNumAlum(50);
        datosInst1.establecerNumDoc(1);
        datosInst1.establecerNumSedes(2);
        datosInst1.establecerGastosAlum(34.34);
        datosInst1.calcularPresupuesto();
        
        datosInst2.establecerNombre("Porciuncula");
        datosInst2.establecerTipoInstitucion("Fiscomicional");
        datosInst2.establecerNumAlum(1600);
        datosInst2.establecerNumDoc(30);
        datosInst2.establecerNumSedes(31);
        datosInst2.establecerGastosAlum(157.3);
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
