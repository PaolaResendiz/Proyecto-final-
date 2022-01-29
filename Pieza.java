/** 
 * Clase Pieza
 * Clase que representa una pieza del ajedrez en el tablero
 * @author Brenda Paola Resendiz Mendoza 
 */

public abstract class Pieza {

    //Atributos
    protected String tipo; 
    protected String color; 
    protected int x; 
    protected int y; 

    /**
     * Constructor que recibe 4 valores, 2 de tipo string y 2 de tipo int
     * @param tipo Representa el tipo de Pieza 
     * @param color Representa el color de la pieza
     * @param x Representa la coordenada de la pieza en x
     * @param y Representa la coordenada de la pieza en y
     */
    
    public Pieza(String tipo, String color, int x, int y){
        this.tipo = tipo;
        this.color = color;
        this.x = x;
        this.y = y;
        }


    /**
     * Metodo que devuelve el tipo de pieza
     * @return El tipo de pieza
     */
    public String GetTipo(){
        return this.tipo;
    }

    /**
     * Metodo que modifica el tipo de Pieza
     * @param tipo El tipo de la Pieza
     */
    public void SetTipo(String tipo){
        this.tipo = tipo;
    }

     /**
     * Metodo que devuelve el color de la pieza
     * @return El color de la pieza
     */
    public String GetColor(){
        return this.color;
    }

    /**
     * Metodo que modifica el color de la Pieza
     * @param color El color de la Pieza
     */
    public void SetColor(String color){
        this.color = color;
    }


    /**
     * Metodo que devuelve la coordenada en x de la pieza
     * @return La coordenada en x de la pieza
     */
    public int GetX(){
        return this.x;
    }

    /**
     * Metodo que modifica la coordenada en x de la Pieza
     * @param x La coordenada en x de la Pieza
     */
    public void SetX(int x){
        this.x = x;
    }


    /**
     * Metodo que devuelve la coordenada en y de la pieza
     * @return La coordenada en y de la pieza
     */
    public int GetY(){
        return this.y;
    }


    /**
     * Metodo que modifica la coordenada en y de la Pieza
     * @param y La coordenada en y de la Pieza
     */
    
    public void SetY(int y){
        this.y = y;
    }

    /**
     * Metodo que mueve la pieza
     * @param x Coordenada en x de la pieza
     * @param y Coordenada en y de la pieza
     */
    
    public abstract boolean mover(Pieza[][] t, int x, int y);

    /**
     * Metodo para que una pieza se coma a otra pieza 
     * @param t El tablero
     * @param x La coordenada en x de la Pieza que quiere comer
     * @param y La coordenada en y de la Pieza que quiere comer
     */
    
    public abstract boolean comer(Pieza[][] t, int x, int y);

    /**
     * Metodo que demuestra si un movimiento es valido o no
     * @param t el tablero
     * @param x La coordenada en x a la que quieres mover la pieza
     * @param y La coordenada en y a donde quieres mandar la pieza 
     * @throws Exception Se lanza una exception si se eligieron coordenadas que no estan dentro del rango
     */
    
    public abstract boolean movimientoValido(Pieza[][] t, int x, int y) throws Exception;

    /**
     * Metodo toString que devuelve el objeto en cadena 
     * @return El objeto en forma de cadena 
     */
    
    @Override
    public abstract String toString();

     /**
      * Metodo equals que determina si una pieza es igual a otra 
      */
    
     @Override
     public boolean equals(Object pieza){
         Pieza pz = (Pieza) pieza;
         boolean r = true;

         r = r && this.tipo.equals(pz.GetTipo());
         r = r && this.color.equals(pz.GetColor());
         r = r && this.x == pz.GetX();
         r = r && this.y == pz.GetY();
         return r;
     }
}
