
package Tienda;

import javax.swing.JOptionPane;
import Tienda.Main;

public abstract class Producto {
    private String nombre;
    private String marca;
    private int precio;

    public Producto(String nombre, String marca, int precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }
    
    //Métodos Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    //Métodos Getter
    public String getNombre() {
        return nombre;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public int getPrecio() {
        return precio;
    }
    
    //Métodos
    public abstract String mostrarDatos ();
    
}
