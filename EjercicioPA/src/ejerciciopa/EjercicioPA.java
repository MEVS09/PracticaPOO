
package ejerciciopa;

public class EjercicioPA {

    public static void main(String[] args) {
        Producto p1 = new Producto("PC", 750000, 10);
        Producto p2 = new Producto("Mouse", 25000);

        System.out.println(p1.obtenerInfo());
        System.out.println(p2.obtenerInfo());

        p1.vender(3);
        p2.vender(1);

        p1.reponer(5);

        System.out.println(p1.obtenerInfo());
        System.out.println(p2.obtenerInfo());
    }
    
}
