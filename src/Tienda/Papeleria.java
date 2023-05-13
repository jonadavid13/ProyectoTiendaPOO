
package Tienda;

public class Papeleria extends Producto{
    private String material;
    
    public Papeleria(String material, String nombre, String marca, int precio) {
        super(nombre, marca, precio);
        this.material = material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
    
    @Override
    public String mostrarDatos(){
        return "Nombre del producto: "+getNombre()+"\nMarca: "+getMarca()+"Material: "+getMaterial()+"\nPrecio: "+getPrecio();
    }
}