/*
 * Implementar un almac�n de enteros mediante una tabla de huecos
 * se supone que no puede contener el valor 0 ya que indica posiciones libre.
 */
/**
 * 
 * @author Adrian
 *
 */
public class Almacen1 {

    static private final int LIBRE = 0;
    // Array con los valores almacenados
    private int tvalores[];
    private int valoresAlmacenados = 0;
    
    // Constructores sin par�metros creo una tabla de 10 elementos 
    
    /**
	 * Es el contructor sin par�metros inicializado con un tama�o de 10
	 */
    public Almacen1(){
        this(10);  // Llamo al constructor con par�metros
    }

    // Constructor donde se fija tama�o m�ximo del Almac�n
    
    /**
	 * constructor del Almacen 1
	 * @param tama�o nos indica en tama�o de nuestra tabla
	 */
    
    public Almacen1( int tama�o){
        tvalores = new int [tama�o];
        init();
    }
    
    // Pone todas las posiciones a LIBRES
    /**
	 * metodo en el cual  posiciones LIBRES  se representan con un 0
	 */
    public void init (){
        for (int i = 0; i < tvalores.length; i++) {
            tvalores[i] = Almacen1.LIBRE;
        }
        valoresAlmacenados = 0;
    }
    
    // Muestra una cadena con los valores de la tabla
    public String toString (){
        StringBuilder tabla = new StringBuilder();
        for (int i = 0; i < tvalores.length; i++) {
            if(tvalores[i] != 0){
                tabla.append(tvalores[i]);
                tabla.append(", ");
            }
        }
        return tabla.toString();
    }
    
    // Devuelve el n�meros de posiciones libres
    /**
	 * Cuenta la cantidad de espacios en blancos
	 * @return devuelve la cantidad de espacios libres
	 */
    public int numPosicionesLibres(){
       int cont = 0;
        for (int i=0; i<tvalores.length; i++ ) {
            if (tvalores[i] == 0) {
                cont++;
                }
        }
        return cont;
    }
    
    // Devuelve el n�mero de posiones ocupadas
    /**
	 * Cuenta los espacios ocupados
	 * @return devuelve los valores ocupados
	 */
    public int numPosicionesOcupadas(){
        int cont = 0;
        for (int i=0; i<tvalores.length; i++ ) {
            if (tvalores[i] != 0) {
                cont++;
                }
        }
        return cont;
    }
    
    // Devuelve verdadero o falso si est� almacenado el valor en la tabla
    /**
	 * Comprueba si un n�mero est�
	 * @param num numero que comprobamos si est� en la tabla o no
	 * @return devolvemos verdadero en caso de que este y falso si no lo est�
	 */
   
    
    public boolean estaValor ( int num){
		boolean esta=false;
		for(int i = 0; i <tvalores.length; i++) {
			if(tvalores[i]==num) {
				return true;
			}
			else {
				return false;
			}
		}
	return esta;
	}
    
    // Almacena el valor el la tabla, devuelve false sin no puede almacenarlo
    /**
	 * Introduce un valor a la tabla
	 * @param num numero que introducimos
	 * @return verdadero si podemos ponerlo y falso si no
	 */
    public boolean ponValor(int num){
        for (int i = 0; i < tvalores.length; i++) {
            if (tvalores[i] == 0) {
                tvalores[i] = num;
                return true;
            }
        }
        return false;
    }
    
    // Elimina el elemento de la tabla, si no esta devuelve false
    /**
	 * Elimina un valor
	 * @param num numero introducido
	 * @return devuelve true si num esta y false si no lo esta
	 */
    
    public boolean sacarValor (int num){	
		for(int i = 0; i< tvalores.length;i++) {
			if(tvalores[i]== num) {
				tvalores[i] = Almacen1.LIBRE;
				return true;
			}
				
		}
		return false;
		
	
	}
      // Indica si el almac�n esta lleno
    /**
	 * comprueba si la tabla esta lleno
	 * @return devuelve true si estan todas las  posiciones ocupadas y false si hay al menos una posicion esta libre
	 */
    public boolean estaLleno (){    
        for (int i = 0; i < tvalores.length; i++) {
            if (tvalores[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
