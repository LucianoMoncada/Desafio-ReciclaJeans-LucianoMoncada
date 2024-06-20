import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ProductoServicio productoServicio;
    private ArchivoServicio archivoServicio;
    private Scanner scanner;

    // Constructor
    public Menu(ProductoServicio productoServicio, ArchivoServicio archivoServicio) {
        this.productoServicio = productoServicio;
        this.archivoServicio = new ArchivoServicio();
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        String opcion;
        do {
            System.out.println("1 Listar Producto");
            System.out.println("2 Editar Datos");
            System.out.println("3 Importar Datos");
            System.out.println("4 Salir");
            System.out.print("Ingrese opción: ");
            opcion = scanner.nextLine();

            if ("1".equals(opcion)) {
                productoServicio.listarProductos();
            } else if ("2".equals(opcion)) {
                editarProducto();
            } else if ("3".equals(opcion)) {
                importarDatos();
            } else if ("4".equals(opcion)) {
                System.out.println("Saliendo del sistema");
            } else {
                System.out.println("Opción inválida.");
            }
        } while (!"4".equals(opcion));
    }

    private void importarDatos() {
        System.out.print("Ingresa la ruta de archivos: ");
        String ruta = scanner.nextLine();
        try {
            ArrayList<Producto> productosCargados = archivoServicio.cargarDatos(ruta);
            productoServicio.setListaProductos(productosCargados);
            System.out.println("Datos importados correctamente");
            Producto.formatoImportacion = true;

            for (Producto producto : productosCargados) {
                System.out.println(producto.toString());
            }

            Producto.formatoImportacion = false;

        } catch (IOException e) {
            System.out.println("Error al subir datos: " + e.getMessage());
        }
    }

    private void editarProducto() {
        System.out.print("Ingrese el código del producto a editar: ");
        String codigo = scanner.nextLine();
        for (Producto producto : productoServicio.getListaProductos()) {
            if (producto.getCodigo().equals(codigo)) {
                System.out.println("1.-El nombre del artículo actual es: " + producto.getArticulo());
                System.out.println("2.-El código del producto: " + producto.getCodigo());
                System.out.println("3.-El color del producto: " + producto.getColor());
                System.out.println("4.-La descripción del producto: " + producto.getDescripcion());
                System.out.println("5.-La marca del producto: " + producto.getMarca());
                System.out.println("6.-El precio del producto: " + producto.getPrecio());
                System.out.println("7.-La talla del producto: " + producto.getTalla());
                System.out.print("Ingrese la opción a editar de los datos del producto: ");
                int opcion = Integer.parseInt(scanner.nextLine());
                System.out.print("Ingrese el nuevo valor para el campo seleccionado: ");
                String nuevoValor = scanner.nextLine();

                if (opcion == 1) {
                    producto.setArticulo(nuevoValor);
                } else if (opcion == 2) {
                    producto.setCodigo(nuevoValor);
                } else if (opcion == 3) {
                    producto.setColor(nuevoValor);
                } else if (opcion == 4) {
                    producto.setDescripcion(nuevoValor);
                } else if (opcion == 5) {
                    producto.setMarca(nuevoValor);
                } else if (opcion == 6) {
                    producto.setPrecio(nuevoValor);
                } else if (opcion == 7) {
                    producto.setTalla(nuevoValor);
                } else {
                    System.out.println("Opción no válida.");
                }
                System.out.println("Producto actualizado correctamente.");
                break;
            }
        }
    }
}