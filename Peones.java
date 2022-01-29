/**
 *Clase peones
 *Clase que representa a la pieza peon en ajedrez
 *@author Brenda Paola Resendiz Mendoza
 *@see Pieza
 */
public class Peones extends Pieza {

    /**
     * Metodo constructor
     * @param tipo Representa el tipo de la Pieza 
     * @param color Representa el color de la pieza
     * @param x Representa la posicion de la pieza en x
     * @param y Representa la posicion de la pieza en y
     */
    public Peones(String tipo, String color, int x, int y){
        super(tipo, color, x, y);

    }
    
    /**
     * Metodo que valida el movimiento de la pieza
     * @param t Representa el tablero
     * @param x Representa la coordenada en x a donde se quiere mover la pieza
     * @param y Representa la coordenada en y a donde se quiere mover la pieza
     */
    @Override
    public boolean mover(Pieza[][] t, int x, int y){
        try{
                if(movimientoValido(t, x, y)){
                    t[this.x][this.y] = null;
                    this.SetX(x);
                    this.SetY(y);
                    t[x][y] = this;
                    evolucionar(t);
                    return true;  
                }
        }
        return false;
       }

    /**
     * Metodo que utiliza el peon para comer otra pieza
     * @param t Representa el tablero
     * @param x Representa la coordenada en x donde esta la pieza que se quiere comer
     * @param y Representa la Coodenada en y donde esta la pieza que se quiere comer 
     * 
     */
    @Override
    public boolean comer(Pieza[][] t,int x, int y) {
        if(this.GetColor() != t[x][y].GetColor()){
            return true;
            
        }
        return false;

        
    }
    
    /**
     * Metodo que verifica si un movimeinto es valido
     * @param t El tablero
     * @param x Coordenada en x a donde se quiere mover la pieza
     * @param y Coodenada en y a donde se quiere mover la pieza
     */
    
    @Override
    public boolean movimientoValido(Pieza[][] t,int x, int y){

        if(this.GetColor().equals("blanco")){
            if((t[x][y] == null)&& (x == x)  && (y == y + 1)){
                return true;
                
            }else if((x == x -1 && y == y +1)|| (x == x +1 && y == y+1)){
                return comer(t,x,y);
	    }

	    else{
            if((t[x][y] == null)&& (x == x) && (y == y -1)){
                return true;

            }else if((x == x +1 && y == y-1)||(x == x -1 && y == y -1)){
                return comer(t,x,y);
            }
        }

    }


    @Override
    public String toString() {
        if (this.GetColor().equals("blanco")){
            return tipo + color + " ";
        }else{
            return tipo + color + " ";
        }
    }

    /**
     * Metodo que evoluciona el peon 
     * @param t El tablero
     */
    public void evolucionar(Pieza[][] t){
        if(this.GetColor().equals("blanco")){
            if(this.y == 5){
                t[this.x][this.y] = new Reina(" ","blanco",this.x, this.y);
                
            }
        }else{
            if(this.y == 0){
                t[this.x][this.y] = new Reina(" ","negro",this.x, this.y);
	    }
	}
    }
    }
}

