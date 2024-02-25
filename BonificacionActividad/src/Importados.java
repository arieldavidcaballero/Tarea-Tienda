public class Importados extends Productos {
    // Atributos
    public String DIAN;

    // Metodos
    public Importados() {
    }

    // Costructor del Padre || Constructor Propio
    public Importados(String nombre, int codigo, String DIAN) {
        super(nombre, codigo);
        this.DIAN = DIAN;
    }

    // Get y Set
    public String getDIAN() {
        return DIAN;
    }

    public void setDIAN(String DIAN) {
        this.DIAN = DIAN;
    }
}
