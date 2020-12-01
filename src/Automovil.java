public class Automovil { //clase  abre llave
    public static void main(String[] args) {
    }

    protected String color;
    protected String marca;
    protected int añoDeFabricacion;
    protected int cantidadDeLLantas;
    protected int cantidadDePasajeros;
    protected int cantidadDePuertas;
    protected int cilindraje;

    public Automovil(String color, String marca, int añoDeFabricacion, int cantidadDeLLantas, int cantidadDePasajeros,
                     int cantidadDePuertas, int clindraje){//abre llave de vehiculo

        this.color = color;
        this.marca = marca;
        this.añoDeFabricacion = añoDeFabricacion;
        this.cantidadDeLLantas = cantidadDeLLantas;
        this.cantidadDePasajeros = cantidadDePasajeros;
        this.cantidadDePuertas = cantidadDePuertas;
        this.cilindraje = clindraje;

    } //cierra llave  vehiculo


    public String getColor () { //abre llave string color
        return color = color;
    } //cierra llave  string color

    public String getMarca () { //abre llave string  marca
        return marca;
    }//cierra llave string marca

    public int getAñoDeFabricacion () { //abre llave string año fabricacion
        return añoDeFabricacion;
    } //cierra llave string año fabricacion

    public int getCantidadDeLLantas () { //abre llave string cantidad de llantas
        return cantidadDeLLantas;
    } // cierra llave string cantidad de llantas

    public int CantidadDePasajeros () { //abre llave string cantidad pasajeros
        return cantidadDePasajeros;
    } // cierra cantidad pasajeros

    public int getCantidadDePuertas () { //abre llave  string cantidad puertas
        return cantidadDePuertas;
    } // cierra llave string cantidad puertas

    public int setCilindraje ( int cilindraje){ //abre string cilindraje
        return cilindraje = cilindraje;
    } //cierra llave string cilidraje


    protected void frenar () { //abre llave void frenar

    }//cierra llave void frenar

    protected void acelera () {//abre llave void acelera

    }//cierra void llave acelera

    protected void reversa () {//abre llave void reserva

    }//cierra llave void reversa




} // cierra llave de clase
