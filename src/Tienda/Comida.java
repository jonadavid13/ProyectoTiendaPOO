
package Tienda;

public class Comida extends Producto{
    private String fecVencimiento;
    private String fecElaboracion;
   
    public Comida(String fecElaboracion,String fecVencimiento, String nombre, String marca, int precio) {
        super(nombre, marca, precio);
        this.fecElaboracion = fecElaboracion;
        this.fecVencimiento = fecVencimiento;
    }

    public void setFecVencimiento(String fecVencimiento) {
        this.fecVencimiento = fecVencimiento;
    }

    public String getFecVencimiento() {
        return fecVencimiento;
    }

    public String getFecElaboracion() {
        return fecElaboracion;
    }

    public void setFecElaboracion(String fecElaboracion) {
        this.fecElaboracion = fecElaboracion;
    }

    
    @Override
    public String mostrarDatos() {
        return "Nombre del producto: "+getNombre()+"\nMarca: "+getMarca()+"\nFecha de Elaboración: "+getFecElaboracion()+"\nFecha de vencimiento: "+getFecVencimiento()+"\nPrecio: "+getPrecio();
    }
}
