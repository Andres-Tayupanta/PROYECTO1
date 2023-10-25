import java.util.Scanner;

public class Producto {
    private int id;
    private String nombre;
    private int cantidad;
    private float precio;

    public Producto (){

    }

    public Producto(int id, String nombre, int cantidad, float precio) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public static Producto ingresarProductoDesdeConsola() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();
        System.out.print("Precio: ");
        float precio = scanner.nextFloat();

        return new Producto(id, nombre, cantidad, precio);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



     void ingresarDatosProductos (){
        Scanner scanner = new Scanner(System.in);
         System.out.print("Ingrese la cantidad de productos: ");
         int numProductos = scanner.nextInt();
         Producto[] productos = new Producto[numProductos];

         for (int i = 0; i < numProductos; i++) {
             System.out.println("Ingrese los datos del Producto #" + (i + 1));
             productos[i] = Producto.ingresarProductoDesdeConsola();
         }
     }


}
