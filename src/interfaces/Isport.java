package interfaces;

public interface Isport {
	
	abstract void courir();
	abstract void nager ();
	abstract void pedaler ();
	
	default void respirer() {
        System.out.println("Je respire frere");
    }
	
	static void hello() 
    { 
        System.out.println("Hello"); 
    } 

}
