/**
 * Clase Reina
 * Clase que representa a la pieza reina en ajedrez
 * @author Brenda Paola Resendiz Mendoza
 * @see Pieza
 */
public class Reina extends Pieza{

     /**
     * Metodo constructor
     * @param tipo Representa el tipo de la pieza
     * @param color Representa el color de la pieza
     * @param x Representa la posicion de la pieza en x
     * @param y Representa la posicion de la pieza en y  
     */
    
    public Reina(String tipo, String color, int x, int y){
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
        return false;
    }

    @Override
    public boolean mover(Pieza[][] t, int x, int y){
	if(movimientoValido(t, x, y)){
	    if(comer(t, x, y)){
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
    public boolean comer(Pieza[][] t, int x, int y) {
        if((t[x][y] == null) || (!t[x][y].GetColor().equals(this.GetColor())))
	    {
	      return true;
	    }
        return false;
    }

    @Override
    public boolean movimientoValido(Pieza[][] t, int x, int y)
    {
            if(diagonalSupIzq(x,y,x,y)|| diagonalSupDere(x,y,x,y)||
            diagonalInfDere(x,y,x,y)|| diagonalInfIzq(x,y,x,y)){
                return true;
            }else if(x == this.x || y == this.y){
                return true;  
            }
        }

        return false;
    }

    /**
     * Metodo recursivo que verifica la diagonal superior izquierda
     * @param destinox la coordenada en x a donde se quiere llegar
     * @param destinoy la coordenada en y a donde se quiere llegar
     * @param actualx  la coordenada actual en x de la pieza
     * @param actualy la coordenada actual en y de la pieza
     * @return si se pudo realizar el metodo
     */
    public boolean diagonalSupIzq(int destinox, int destinoy, int actualx, int actualy){
        if(destinox == actualx && destinoy == actualy){
            return true;
        }
        if(actualx > 5 || actualx < 0 || actualy > 5 || actualy < 0){
            return false;
        }
        else{
            return diagonalSupIzq(destinox, destinoy, actualx-1, actualy+1);
        }
    }


    /**
     * Metodo recursivo que verifica la diagonal superior derecha
     * @param destinox la coordenada en x a donde se quiere llegar
     * @param destinoy la coordenada en y a donde se quiere llegar
     * @param actualx  la coordenada actual en x de la pieza
     * @param actualy la coordenada actual en y de la pieza
     * @return si se pudo realizar el metodo
     */
    public boolean diagonalSupDere(int destinox, int destinoy, int actualx, int actualy){
        if(destinox == actualx && destinoy == actualy){
            return true;
        }
        if(actualx > 5 || actualx < 0 || actualy > 5 || actualy < 0){
            return false;
        }
        else{
            return diagonalSupDere(destinox, destinoy, actualx+1, actualy+1);
        }
    }

      /**
     * Metodo recursivo que verifica la diagonal inferior izquierda
     * @param destinox la coordenada en x a donde se quiere llegar
     * @param destinoy la coordenada en y a donde se quiere llegar
     * @param actualx  la coordenada actual en x de la pieza
     * @param actualy la coordenada actual en y de la pieza
     * @return si se pudo realizar el metodo
     */
    public boolean diagonalInfIzq(int destinox, int destinoy, int actualx, int actualy){
        if(destinox == actualx && destinoy == actualy){
            return true;
        }
        if(actualx > 5 || actualx < 0 || actualy > 5 || actualy < 0){
            return false;
        }
        else{
	          return diagonalInfIzq(destinox, destinoy, actualx-1, actualy-1);
        }
    }   

      /**
     * Metodo recursivo que verifica la diagonal inferior derecha
     * @param destinox la coordenada en x a donde se quiere llegar
     * @param destinoy la coordenada en y a donde se quiere llegar
     * @param actualx  la coordenada actual en x de la pieza
     * @param actualy la coordenada actual en y de la pieza
     * @return si se pudo realizar el metodo
     */
    public boolean diagonalInfDere(int destinox, int destinoy, int actualx, int actualy){
        if(destinox == actualx && destinoy == actualy){
            return true;
	}
        if(actualx > 5 || actualx < 0 || actualy > 5 || actualy < 0){
            return false;
	}
        else{
            return diagonalInfDere(destinox, destinoy, actualx+1, actualy-1);
	}
    }

    @Override
    public String toString() {
        if (this.GetColor().equals("blanco")){
            return tipo + color + " ";
	}
	else{return tipo + color + " ";}
    }
}
