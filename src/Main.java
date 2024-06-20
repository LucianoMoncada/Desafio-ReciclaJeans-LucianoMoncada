public class Main {
    public static void main(String[] args) {

        ProductoServicio productoServicio = new ProductoServicio();
        Menu menu = new Menu(productoServicio, new ArchivoServicio());

        menu.mostrarMenu();
    }
}