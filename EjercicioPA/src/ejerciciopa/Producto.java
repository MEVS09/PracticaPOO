/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

    // Sobrecarga del constructor
    public Producto(String nombre, double precio) {
        this(nombre, precio, 0);
    }

    // Método para vender un producto
    public boolean vender(int cantidad) {
        if (cantidad > stock) {
            System.out.println("Stock insuficiente.");
            return false;
        }
        stock -= cantidad;
        System.out.println("Venta realizada: " + cantidad + " unidades de " + nombre);
        return true;
    }

    // Método para reponer stock
    public void reponer(int cantidad) {
        stock += cantidad;
        System.out.println("Stock actualizado. Nuevo stock de " + nombre + ": " + stock);
    }

    // Método para obtener información del producto
    public String obtenerInfo() {
        return "Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + stock;
    }
}

