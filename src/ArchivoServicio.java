
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArchivoServicio {
    public ArchivoServicio() {}
      public ArrayList<Producto> cargarDatos(String rutaArchivo) throws IOException {
        ArrayList<Producto> productos = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
        String line;
        while ((line = br.readLine()) != null) {
            String[] datos = line.split(",");
            Producto producto = new Producto(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6]);
            productos.add(producto);
        }
        br.close();
        return productos;
    }
}