import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
        public static void main(String[] args) {

            Producto productos = new Producto();
            productos.ingresarDatosProductos();

            Clientes consumidor = new Clientes();
            consumidor.ingresarDatosClientes();
            /*Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese la cantidad de productos: ");
            int numProductos = scanner.nextInt();
            Producto[] productos = new Producto[numProductos];

            for (int i = 0; i < numProductos; i++) {
                System.out.println("Ingrese los datos del Producto #" + (i + 1));
                productos[i] = Producto.ingresarProductoDesdeConsola();
            }

            System.out.print("Ingrese la cantidad de clientes: ");
            int numClientes = scanner.nextInt();
            Clientes[] clientes = new Clientes[numClientes];

            for (int i = 0; i < numClientes; i++) {
                System.out.println("Ingrese los datos del Cliente #" + (i + 1));
                clientes[i] = Clientes.ingresarClienteDesdeConsola();
            }

            System.out.print("Ingrese la cantidad de ventas: ");
            int numVentas = scanner.nextInt();
            Ventas[] ventas = new Ventas[numVentas];

            for (int i = 0; i < numVentas; i++) {
                System.out.println("Ingrese los datos de la Venta #" + (i + 1));
                ventas[i] = Ventas.ingresarVentaDesdeConsola(productos, clientes);
            }

            // Imprimir los datos de las ventas
            System.out.println("Registro de Ventas:");
            for (Ventas venta : ventas) {
                venta.mostrarInformacion();
                System.out.println("---------------");*/
            }

    }