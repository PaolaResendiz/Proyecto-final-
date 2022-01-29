/**
 * Clase Jugador2
 * @author Brenda Paola Resendiz Mendoza 
 */
public class Jugador2{

    //Atributos
    private String nombre;
    private boolean turno;

    /**
     * Constructor sin parametros y por defecto tiene "nombre" y su turno
     * es falso  
     */ 

    public Jugador2()
    {
	this.nombre = "Nombre";
	this.turno = false;
    }

     /**
     * Constructor que recibe 2 valores, 1 de tipo string y otro de tipo
     * boolean
     *
     * @param nombre Representa el nombre del primer jugador
     * @param turno Representa el turno del primer jugador 
     */

    public Jugador2(String nombre, boolean turno)
    {
	this.nombre = nombre;
	this.turno = turno;
    }

    /**
     * Metodo que devuelve el nombre del jugador 
     * @return El nombre del jugador 
     */
    public String getNombre(){
	return this.nombre;
    }

    /**
     *Metodo que modifica el nombre del jugador 
     *@param nombre El nombre del jugador 
     */
    public void setNombre(String nombre){
	this.nombre = nombre;
    }

    /**
     * Metodo que devuelve el turno del jugador 
     * @return El turno del jugador 
     */
    public boolean getTurno(){
	return this.turno;
    }

    /**
     *Metodo que modifica el turno del jugador 
     *@param turno El turno del jugador 
     */
    public void setTurno(boolean turno){
	this.turno = turno;
    }

    /**
     *Metodo toString que regresa en foma de cadena el objeto
     *@return Regresa el objeto 
     */
    @Override
    public String toString(){
	return "Nombre del primer juagador: " + this.nombre +
	    "Turno del primer jugador: " + this.turno;
    }
    
}

