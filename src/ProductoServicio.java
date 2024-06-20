import java.util.Scanner;
import java.util.ArrayList;


public class ProductoServicio {
    private ArrayList<Producto> listaProductos;
    private Scanner scanner;

    public ProductoServicio() {
        listaProductos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    // Método para listar productos
    public void listarProductos() {
        for (Producto producto : listaProductos) {
            System.out.println(producto);
        }
    }

    // Método para editar un producto
    public void editarProducto() {
        System.out.print("Ingrese el código del producto a editar: ");
        String codigo = scanner.nextLine();
        Producto productoEncontrado = null;

        for (Producto producto : listaProductos) {
            if (producto.getCodigo().equals(codigo)) {
                productoEncontrado = producto;
                break;
            }
        }

        if (productoEncontrado != null) {
            System.out.println("Producto encontrado: " + productoEncontrado);
            System.out.println("Seleccione el campo a editar:");
            System.out.println("1. Artículo");
            System.out.println("2. Precio");
            System.out.println("3. Descripción");
            System.out.println("4. Código");
            System.out.println("5. Talla");
            System.out.println("6. Marca");
            System.out.println("7. Color");
            System.out.print("Opción: ");
            int opcion = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el nuevo valor: ");
            String nuevoValor = scanner.nextLine();

            if (opcion == 1) {
                productoEncontrado.setArticulo(nuevoValor);
            } else if (opcion == 2) {
                productoEncontrado.setPrecio(nuevoValor);
            } else if (opcion == 3) {
                productoEncontrado.setDescripcion(nuevoValor);
            } else if (opcion == 4) {
                productoEncontrado.setCodigo(nuevoValor);
            } else if (opcion == 5) {
                productoEncontrado.setTalla(nuevoValor);
            } else if (opcion == 6) {
                productoEncontrado.setMarca(nuevoValor);
            } else if (opcion == 7) {
                productoEncontrado.setColor(nuevoValor);
            } else {
                System.out.println("Opción no válida.");
            }

            System.out.println("Producto actualizado: " + productoEncontrado);
        } else {
            System.out.println("No se encontró un producto con el código especificado.");
        }
    }
}