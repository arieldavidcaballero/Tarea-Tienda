import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner snr = new Scanner(System.in);

        int opcion;
        int x = 2;

        Nacionales[] lisProNacionales = new Nacionales[x];
        Importados[] lisProImportados = new Importados[x];

        do {

            System.out.println("---------------------------------------------------------------------------------------------------" +
                    "\nHola, ¿Como estas? :)" +
                    "\nEste es un Programa para guardar Productos [Importados] o [Nacionales] " +
                    "\nYa que guarde los productos puede ver cuales son [Importados] o [Nacionales] y su respectivo codigo\n" +
                    "---------------------------------------------------------------------------------------------------\n");

            System.out.println("\tMENU :) " +
                    "\n[1] ---> Registre un Producto Nacional" +
                    "\n[2] ---> Registre un Porducto Importado" +
                    "\n[3] ---> Mirar Lista de Productos Nacionales" +
                    "\n[4] ---> Mirar Lista de Productos Importados" +
                    "\n[5] ---> Buscar un Producto Nacional" +
                    "\n[6] ---> Buscar un Producto Importado\n" +
                    "\n[7] ---> Salir :(\n" +
                    "\nPor Favor La Opcion que desea Realizar = ");

                    opcion = snr.nextInt();

                    switch (opcion) {
                        case 1:
                            for (int i = 0; i < lisProNacionales.length; i++) {
                                System.out.println("\nIngrese el Codigo del Producto : " + (i +1));
                                int codigo = snr.nextInt();
                                System.out.println("Ingrese el Nombre del Producto : " + (i + 1));
                                String nombre = snr.next();
                                System.out.println("Ingrese el Codigo de la DIAN del Prooducto : " + (i + 1));
                                String DIAN = snr.next();
                                lisProNacionales[i] = new Nacionales(nombre, codigo, DIAN);
                            }
                            System.out.println("El Producto Nacional Fue Registrado Corectamente :)");
                            break;

                        case 2:
                            for (int i = 0; i < lisProImportados.length; i++) {
                                System.out.println("\nIngrese el Codigo del Producto : " + (i +1));
                                int codigo = snr.nextInt();
                                System.out.println("Ingrese el Nombre del Producto : " + (i + 1));
                                String nombre = snr.next();
                                System.out.println("Ingrese el Codigo de la DIAN del Prooducto : " + (i + 1));
                                String DIAN = snr.next();
                                lisProImportados[i] = new Importados(nombre, codigo, DIAN);
                            }
                            System.out.println("El Producto Importado Fue Registrado Corectamente :)");
                            break;

                        case 3:
                            System.out.println("Lista de Productos Nacionales");
                            for (Nacionales producto : lisProNacionales) {
                                if (producto != null) {
                                    System.out.println("| Código " + producto.getCodigo() + " | Nombre " + producto.nombre + " | Registro DIAN " + producto.DIAN  + " | ");
                                }
                            }

                        case 4:
                            System.out.println("Lista de Productos Importados");
                            for (Importados producto : lisProImportados) {
                                if (producto != null) {
                                    System.out.println("| Código " + producto.getCodigo() + " | Nombre " + producto.nombre + " | Registro DIAN " + producto.DIAN  + " | ");
                                }
                            }

                        case 5:
                            System.out.println("Ingrese el [CÓDIGO] del Producto [NACIONAL] que Desea Buscar");
                            int codigoNacional = snr.nextInt();
                            boolean encontradoNacional = false;
                            for (Nacionales producto : lisProNacionales) {
                                if (producto != null && producto.getCodigo() == codigoNacional) {
                                    encontradoNacional = true;
                                    System.out.println("Producto Nacional - Encontrado | Código " + producto.getCodigo() + " | Nombre " + producto.nombre + " | Registro DIAN " + producto.DIAN  + " | ");
                                    break;
                                }
                            }
                            if (!encontradoNacional) {
                                System.out.println("Código de Producto Nacional No Encontrado :(");
                            }

                        case 6:
                            System.out.println("Ingrese el [CÓDIGO] del Producto [IMPORTADO] que Desea Buscar");
                            int codigoImportado = snr.nextInt();
                            boolean encontradoImportado = false;
                            for (Importados producto : lisProImportados) {
                                if (producto != null && producto.getCodigo() == codigoImportado) {
                                    encontradoImportado = true;
                                    System.out.println("Producto Importado - Encontrado | Código " + producto.getCodigo() + " | Nombre " + producto.nombre + " | Registro DIAN " + producto.DIAN  + " | ");
                                    break;
                                }
                            }
                            if (!encontradoImportado) {
                                System.out.println("Código de Producto Nacional No Encontrado :(");
                            }

                        case 7:
                            System.out.println("\nHatá la Procima :)\n");
                            break;

                        default:
                            System.out.println("\n---OPCION INVALÍDO---\n");
                    }
        } while (opcion != 7);
    }
}