
package ejerciciopa;

public class Producto {
    
    private String nombre;
    private double precio;
    private int stock;

    // Constructor
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Sobrecarga 
    public Producto(String nombre, double precio) {
        this(nombre, precio, 0);
    }

    // Metodo
    public boolean vender(int cantidad) {
        if (cantidad > stock) {
            System.out.println("Stock insuficiente.");
            return false;
        }
        stock -= cantidad;
        System.out.println("Venta realizada: " + cantidad + " unidades de " + nombre);
        return true;
    }

    // Metodo
    public void reponer(int cantidad) {
        stock += cantidad;
        System.out.println("Stock actualizado. Nuevo stock de " + nombre + ": " + stock);
    }

    // Metodo
    public String obtenerInfo() {
        return "Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + stock;
    }
}

