/**
 * Clase Rey
 * Clase que representa a la pieza rey en ajedrez
 * @author Brenda Paola Resendiz Mendoza
 * @see Pieza
 */
public class Rey extends Pieza{

    /**
     * Metodo constructor
     * @param tipo Representa el tipo de la pieza
     * @param color Representa el color de la pieza
     * @param x Representa la posicion de la pieza en x
     * @param y Representa la posicion de la pieza en y  
     */

    public Rey(String tipo, String color, int x, int y){
	super(tipo, color, x, y);

    }

    @Override
    public boolean mover(Pieza[][] t, int x, int y){
	    if(movimientoValido(t,x,y)){
		if(comer(t,x,y)){
		    t[this.x][this.y] = null;
		    this.SetX(x);
		    this.SetY(y);
		    t[x][y] = this;
		    return true;
		}
	    }

	return false;
    }

    @Override
    public boolean comer(Pieza[][] t, int x, int y){
	if((t[x][y] == null) || (!t[x][y].GetColor().equals(this.GetColor())))
	    {
		return true;
	    }
	return false;
    }

    @Override
    public boolean movimientoValido(Pieza[][] t, int x, int y)
    {
	boolean valido = false;
	    try{
		if((x == x-1 && y == y) || (x == x+1 && y == y) || (x == x && y == y-1) ||
		   (x == x && y == y+1) || (x == x-1 && y == y+1) || (x == x+1 && y == y+1)||
		   (x == x-1 && y == y-1) || (x == x+1 && y== y-1)){
		    valido = true;
		}
	    }
	    catch(Exception e){
	    }
	return valido;
    }
    @Override
    public String toString() {
	if (this.GetColor().equals("blanco")){
	    return tipo + color + " ";
	}
	else{
	    return tipo + color + " ";
	}
    }
   	
}
