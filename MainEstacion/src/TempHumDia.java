
/**
 * Write a description of class TempHumDia here.
 * 
 /**
  * @author alumno2017
  */

public class TempHumDia extends TempDia
{
    private int humMax, humMin;
   
    /**
     * A�ado el constructor el cual heresa de TempDia sus parametros
     * @param dia
     * @param mes
     * @param a�o
     * @param tempMax
     * @param tempMin
     * @param humMax
     * @param humMin
     */
    public TempHumDia(int dia, int mes , int a�o , int tempMax, int tempMin, int humMax, int humMin){
        
       super(dia, mes , a�o , tempMax, tempMin);
        this.humMax= humMax;
        this.humMin= humMin; 
    }
    /**
     * Muestra el formato del objeto TempHumDia con sus parametros
     */
 public String toString(){
        
        return super.toString()+((humMax+humMin)/2);
        
    }
    
    
}
