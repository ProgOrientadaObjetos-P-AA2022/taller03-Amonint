package ejecutor;
import equipocelulares.EquipoCelulares;

public class Ejecutor {
    public static void main(String[] args){
        
        EquipoCelulares equiCelular1 = new EquipoCelulares();
        EquipoCelulares equiCelular2 = new EquipoCelulares();
        
        double iva = 0.12;
        
        equiCelular1.establecerSistemaOperativo("IOS 9");
        equiCelular1.establecerPantallaTamanio(15);
        equiCelular1.establecerCostoInicial(545.00);
        equiCelular1.establecerIva(iva);
        equiCelular1.calcularCostoIva();
        equiCelular1.establecerDireccionMac("123.324.2134.98");
        equiCelular1.establecerInfoImei("2343129.453243.324.65");
        equiCelular1.calcularCostoFinal();
        
        equiCelular2.establecerSistemaOperativo("Androi");
        equiCelular2.establecerPantallaTamanio(18);
        equiCelular2.establecerCostoInicial(210.50);
        equiCelular2.establecerIva(iva);
        equiCelular2.calcularCostoIva();
        equiCelular2.establecerDireccionMac("176.234.7521.92");
        equiCelular2.establecerInfoImei("3760394.234984.132.73");
        equiCelular2.calcularCostoFinal();
        
        System.out.printf("Caracteristicas celular 1\n \nSistema operativo: "
        + "%s \nTamaño de pantalla: %d \nDireccion mac: %s \nInfo. IMEI: %s"
        + "\nCosto inicial: %.2f \nIVA: %.2f \nCosto con iva: %.2f \nCosto final: "
        + "%.2f \n", equiCelular1.obtenerSistemaOperativo(), 
        equiCelular1.obtenerPantallaTamanio(), equiCelular1.obtenerDireccionMac(),
        equiCelular1.obtenerInfoImei(), equiCelular1.obtenerCostoInicial(),
        equiCelular1.obtenerIva(), equiCelular1.obtenerCostoIva(),
        equiCelular1.obtenerCostoFinal());
        
        System.out.printf("\nCaracteristicas celular 2\n \nSistema operativo: "
        + "%s \nTamaño de pantalla: %d \nDireccion mac: %s \nInfo. IMEI: %s"
        + "\nCosto inicial: %.2f \nIVA: %.2f \nCosto con iva: %.2f \nCosto final: "
        + "%.2f \n", equiCelular2.obtenerSistemaOperativo(), 
        equiCelular2.obtenerPantallaTamanio(), equiCelular2.obtenerDireccionMac(),
        equiCelular2.obtenerInfoImei(), equiCelular2.obtenerCostoInicial(),
        equiCelular2.obtenerIva(), equiCelular2.obtenerCostoIva(),
        equiCelular2.obtenerCostoFinal());
        
    }
    
}
