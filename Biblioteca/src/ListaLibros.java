
public class ListaLibros
{
   
    Libro primero;

    /**
     * Constructor for objects of class ListaNodos
     */
    public ListaLibros()
    {
       
        primero = null;
    }

   
    // Completar los metodos
    
    // Incluye un nuevo libro en la lista
    public void pon( Libro valor){
       valor.siguiente = primero;
        primero = valor;  
    }
    
    public boolean estaVacia(){
       return ( primero == null );    
        
    }
    
    // Devuelve un libro que es eliminado de la lista o null si no exite
    public Libro quitar ( int id ) {
        Libro resu = null;
        if ( estaVacia() ) return null;
        if ( primero.id == id ){
            resu = primero;
            primero = primero.siguiente;
        }
        Libro p2 = primero;
        Libro p1 = primero.siguiente;
        
        
        while ( p1 != null){
            // Es el que hay que eliminar
            if ( p1.id == id ){
                resu = p1; 
                p2.siguiente = p1.siguiente;
                //elimino haciendo referencia al siguiente elemento
            }
         p2 = p1;
         p1 = p1.siguiente;
        }
        return resu;
    }
   
    // Devuelve el id del libro o -1 si no esta
    public int buscarId ( String titulo ){
        
        int resid = -1;
       Libro paux = primero;
       while ( paux != null ){
           if ( paux.titulo.equals(titulo) ){
               resid = paux.id;
               break;
            }
           paux = paux.siguiente;
        }
        return resid;
    
   }
    // Muestra los libros almacenados
    public void verCatalogo (){
    Libro paux = primero;
        while (paux != null ){
            System.out.println(paux);
            paux = paux.siguiente;
        }
    }
    
         
    

}

