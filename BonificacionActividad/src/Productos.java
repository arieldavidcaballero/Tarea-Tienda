public class Productos {
    // Atributos
    public String nombre;
    private int codigo;

    // Metodos
    public Productos() {
    }

    public Productos(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    // Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
