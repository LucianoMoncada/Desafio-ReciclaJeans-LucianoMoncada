public class Producto {
    private String articulo;
    private String precio;
    private String descripcion;
    private String codigo;
    private String talla;
    private String marca;
    private String color;


    // Esto controla el formato de salida del toString
    public static boolean formatoImportacion = false;

    public Producto() {}

    // Constructor
    public Producto(String articulo, String precio, String descripcion, String codigo, String talla, String marca, String color) {
        this.articulo = articulo;
        this.precio = precio;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.talla = talla;
        this.marca = marca;
        this.color = color;
    }

    // Getters y setters
    public String getArticulo() { return articulo; }
    public void setArticulo(String articulo) { this.articulo = articulo; }

    public String getPrecio() { return precio; }
    public void setPrecio(String precio) { this.precio = precio; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getTalla() { return talla; }
    public void setTalla(String talla) { this.talla = talla; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    @Override
    public String toString() {
        if (formatoImportacion) {
            return "[Producto [articulo=" + articulo +
                    ", precio=" + precio +
                    ", descripcion=" + descripcion +
                    ", codigo=" + codigo +
                    ", talla=" + talla +
                    ", marca=" + marca +
                    ", color=" + color + "]]";
        } else {
            return "Datos del Producto:\n" +
                    "Nombre articulo: " + articulo + "\n" +
                    "Código: " + codigo + "\n" +
                    "Marca: " + marca + "\n" +
                    "Color: " + color + "\n" +
                    "Descripcion: " + descripcion + "\n" +
                    "Precio: " + precio + "\n" +
                    "Talla: " + talla + "\n" +
                    "---------------------------------";
        }
    }
}