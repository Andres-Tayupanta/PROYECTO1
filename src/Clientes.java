import java.util.Scanner;
import java.util.concurrent.Callable;

public class Clientes {
    private  int id;
    private  String nombre;
    private  String cedula;
    private  String telefono;

 public Clientes(){

 }

    public Clientes(int id,String nombre, String cedula, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static Clientes ingresarClienteDesdeConsola() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Cédula: ");
        String cedula = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();



        return new Clientes (id,nombre, cedula, telefono);

    }
    void ingresarDatosClientes () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la catidad de clientes:");
        int numClientes = scanner.nextInt();
        Clientes[] clientes = new Clientes[numClientes];
        for (int i = 0; i < numClientes; i++) {
            System.out.println("Ingrese los datos del cliente:");
            clientes[i] = Clientes.ingresarClienteDesdeConsola();

        }
    }




}
