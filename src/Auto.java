import java.util.ArrayList;

/**
 * La clase auto representa un coche con propiedades basicas y metodo
 * para acceder y modificar esas propiedades
 *
 * @author Miguel
 * @version 1.0
 * @since 2024-02-14
 */
public class Auto {

    /**
     * La marca del automóvil.
     */
    private String marca;

    /**
     * El modelo del automóvil.
     */
    private String modelo;

    /**
     * Constructor para crear un objeto Auto con una marca y un modelo específicos.
     *
     * @param marca  La marca del automóvil.
     * @param modelo El modelo del automóvil.
     */
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Obtiene la marca del automóvil.
     *
     * @return La marca del automóvil.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del automóvil.
     *
     * @param marca La nueva marca del automóvil.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene el modelo del automóvil.
     *
     * @return El modelo del automóvil.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo del automóvil.
     *
     * @param modelo El nuevo modelo del automóvil.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Devuelve un string del objeto Auto.
     *
     * @return Un string que representa al objeto Auto, incluyendo su marca y modelo.
     */
    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + "]";
    }
}



