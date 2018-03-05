// IMPLEMENTACI�N PARCIAL DE CLASE EstacionClim�tica
/**
 * @author alumno2017
 */
import java.util.Scanner; 

public class EstacionClimatica 
{ 
    // instance variables - replace the example below with your own 
    private String nombre; 
    private int a�o; 
    private TempHumDia mediciones[];  // Tabla de mediciones 
    private int nummediciones;      // N�mero de mediciones almacenadas 

    /** 
     * Constructor for objects of class EstacionClimatica con sus parametros por defecto
     */ 
    public EstacionClimatica() 
    { 
         this.nombre = ""; 
         this.a�o = 2000;  
         mediciones = new TempHumDia[366];  // Por si el a�o es bisiesto.  
         nummediciones = 0; 
    } 
    
    /**
     * Constructor por defecto
     * @param nombre
     * @param a�o
     */
    public EstacionClimatica( String nombre, int a�o) 
    { 
         this(); // Llamo al constructor por defecto 
         this.nombre = nombre; 
         this.a�o = a�o; 
         
    } 
/**
 * 
 * @param medida la cual ingresare en la tabla de objetos TempHumDia
 * @return verdadero si pertenece al a�o en la cual tenemos mediciones
 */
    public boolean addDia ( TempHumDia medida){
        if (this.a�o != medida.getA�o() )
          return false;
        
        int i  = medida.obtenerNumerodeDia();  
        mediciones[i] = medida;
        nummediciones++;
        return true;
          
    }
    

     /**
      * 
      * @param medida comparamos si se encuentra dentro de nuestra tabla
      * @return verdadero se borra y lo pone a null , falso si el a�o es diferente
      */
    
    public boolean delDia ( TempHumDia medida){ 
        if (this.a�o != medida.getA�o() )
          return false;
          
        int i  = medida.obtenerNumerodeDia(); 
        if ( i >=0 || i < this.mediciones.length)  
         mediciones[i]= null;
        nummediciones--;
        return true;
     
    } 
    /**
     * Muestro las mediciones ingresadas por a nuestra tabla, los null los ignora
     */
    public void listarDias(){ 
        
        for(int i=0; i<mediciones.length; i++){
        if(mediciones[i] != null){
        System.out.println(mediciones.toString());
        }
        }
     
    } 
   
    // M�todo auxiliar que me indica si una fecha es correcta 
    /**
     * 
     * @param dia solicitados para crear un objeto TempHumDia
     * @param mes
     * @param a�o
     * @return verdadero si el formato pertenece al mes correcto y dias correctos
     */
    static boolean fechaOK ( int dia, int mes, int a�o){ 
        
       if(dia >0 && dia <= 31 && mes == 1 && a�o > 0 && a�o< 2030){
        return true;
        }
        if(dia >0 && dia <= 28 && mes == 2 && a�o > 0 && a�o< 2030){
        return true;
        }
        if(dia >0 && dia <= 31 && mes == 3 && a�o > 0 && a�o< 2030){
        return true;
        }
        if(dia >0 && dia <= 30 && mes == 4 && a�o > 0 && a�o< 2030){
        return true;
        }
        if(dia >0 && dia <= 31 && mes == 5 && a�o > 0 && a�o< 2030){
        return true;
        }
        if(dia >0 && dia <= 30 && mes == 6 && a�o > 0 && a�o< 2030){
        return true;
        }
        if(dia >0 && dia <= 30 && mes == 7 && a�o > 0 && a�o< 2030){
        return true;
        }
        if(dia >0 && dia <= 31 && mes == 8 && a�o > 0 && a�o< 2030){
        return true;
        }
        if(dia >0 && dia <= 30 && mes == 9 && a�o > 0 && a�o< 2030){
        return true;
        }
        if(dia >0 && dia <= 31 && mes == 10 && a�o > 0 && a�o< 2030){
        return true;
        }
        if(dia >0 && dia <= 30 && mes == 11 && a�o > 0 && a�o< 2030){
        return true;
        }
        if(dia >0 && dia <= 31 && mes == 12 && a�o > 0 && a�o< 2030){
        return true;
        }
        else return false;
    
    } 
    
    /**
     * 
     * @return un nuevo objeto TempHumDia creado desde esta clase
     */
    static TempHumDia leerMedida() { 

         Scanner leer = new Scanner(System.in); 
         int dia,mes,a�o, tempMax, tempMin, humMax, humMin; 
         TempHumDia  medicion = null; 
         
        boolean error = true; 
        do { 
        System.out.println("D�a:"); dia = leer.nextInt(); 
        System.out.println("Mes:");  mes = leer.nextInt(); 
        System.out.println("A�o:");  a�o = leer.nextInt(); 
  
        if ( fechaOK( dia,mes,a�o) ) { 
             System.out.println ( " T� M�xima:"); tempMax = leer.nextInt(); 
             System.out.println ( " T� M�nima:"); tempMin = leer.nextInt(); 
             System.out.println ( " H� M�xima:"); humMax = leer.nextInt(); 
             System.out.println ( " H� M�nima:"); humMin = leer.nextInt(); 
             medicion = new TempHumDia ( dia,mes,a�o, tempMax, tempMin, humMax, humMin); 
             error = false; 
            } 
        else 
        { 
            System.out.println(" Fecha �rronea"); 
        } 
    
    } while (  error); 
    
    
    return medicion; 
}
} 