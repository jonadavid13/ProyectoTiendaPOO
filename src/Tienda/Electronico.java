
package Tienda;

public class Electronico extends Producto {
    private String tipo;

    public Electronico(String tipo, String nombre, String marca, int precio) {
        super(nombre, marca, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String mostrarDatos(){
        return "Nombre del producto: "+getNombre()+"\nTipo de electrónico: "+getTipo()+"\nMarca: "+getMarca()+"\nPrecio: "+getPrecio();
    }
}
