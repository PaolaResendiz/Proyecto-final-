/**
 *Clase Caballos
 *Clase que representa a la pieza caballo en ajedrez 
 *@author Brenda Paola Resendiz Mendoza
 *@see Pieza
 */
public class Caballos extends Pieza {
    /**
     * Metodo constructor 
     * @param tipo Representa el tipo de la pieza
     * @param color Representa el color de la pieza
     * @param x Representa la posicion de la pieza en x
     * @param y Representa la posicion de la pieza en y 
     */

    public Caballos(String tipo, String color, int x, int y){
	super(tipo, color, x, y);
    }
    @Override
    public boolean mover(Pieza[][] t, int x, int y) {
            if(movimientoValido(t, x, y)){
                if(comer(t, x, y)){
                    t[this.x][this.y] = null;
                    this.SetX(x);
                    this.SetY(y);
                    t[x][y] = this;
                    return true;
                }
            }   
    }

    @Override
    public boolean comer(Pieza[][] t, int x, int y) {
        if((t[x][y] == null) || (!t[x][y].GetColor().equals(this.GetColor()))){
            return true;
        }
        return false;
   
    }

    @Override
    public boolean movimientoValido(Pieza[][] t, int x, int y){
        boolean valido = false;
            if((x == x-2 && y == y-1)|| (x == x-2 && y == y+1) || (x == x+2 && y == y-1)||
               (x == x+2 && y == y+1)||(x == x-1 && y == y+2)||(x == x-1 && y == y-2)||
               (x == x+1 && y == y+2)|| (x == x+1 && y == y-2)){
                   valido = true;
               }
        }
    }

    @Override
    public String toString() {
        if (this.GetColor().equals("blanco")){
            return tipo + color;
	} else{
            return tipo + color + " ";
	}
    }
}
