import java.util.ArrayList;

/**
 * La clase Concesionario representa un conjunto de coches disponibles en un concesionario.
 * * @author Miguel
 *  * @version 1.0
 *  * @since 2024-02-14
 */
public class Concesionario {

    /**
     * La lista de coches disponibles en el concesionario.
     */
    private ArrayList<Auto> autos;

    /**
     * Constructor para crear un nuevo Concesionario sin autos inicialmente.
     */
    public Concesionario() {
        autos = new ArrayList<>();
    }

    /**
     * Agrega un nuevo auto al concesionario.
     *
     * @param auto El auto que se agregará al concesionario.
     */
    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    /**
     * Obtiene la lista de autos disponibles en el concesionario.
     *
     * @return La lista de autos disponibles en el concesionario.
     */
    public ArrayList<Auto> listarAutos() {
        return autos;
    }

    /**
     * Imprime en consola los detalles de todos los autos disponibles en el concesionario.
     */
    public void imprimirAutos() {
        for (Auto auto : autos) {
            System.out.println(auto);
        }
    }
}