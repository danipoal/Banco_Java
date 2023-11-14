import java.util.ArrayList;
import java.util.Scanner;
/** PAC DESARROLLO M03B 1S2324
 *  Sigue las especificaciones del enunciado de la pac de Desarrollo
 *  No se puede importar ninguna otra clase, dentro de esta clase.
 *  Obligatorio utilizar esta plantilla
 *  
 */
public class Main {

    public static void main(String[] args) {
    	//inserta código aquí
    	
    	Usuario usuario = LeerUsuario();
    	Cuenta cuenta = new Cuenta(usuario);
    	do {
    		mostrarMenu();

    	} while(true);
    
    }
    
    
    
    

/**** Mostrar las distintas opciones validas del Menu de Opciones ****/
    public static void mostrarMenu(){
    	//inserta código aquí
    	Cuenta cuenta = new Cuenta(LeerUsuario());
    	System.out.println("Realiza una nueva acción" + 
    					"\n1 Introduce un nuevo gasto" +
    					"\n2 Introduce un nuevo ingreso" +
    					"\n3 Mostrar gastos" +
    					"\n4 Mostrar ingresos" +
    					"\n5 Mostrar saldo" +
    					"\n0 Salir");
    	Scanner sc = new Scanner(System.in);
    	sc.nextLine();
    	String opcion = sc.nextLine();
    	
    	sc.nextLine();
    	
    	
		if(opcion.equals("1")) {
    		
    		addGastos(cuenta);
    	}else if(opcion.equals("2")) {
    		addIngresos(cuenta);
    	}else if(opcion.equals("3")) {
    		imprimirGastos(cuenta);
    	}else if(opcion.equals("4")) {
    		imprimirIngresos(cuenta);
    	}else if(opcion.equals("5")) {
    			
				cuenta.toString();
    	}else if(opcion.equals("0")) {
    		System.exit(0);
    	}
    	sc.close();
    	
    	
    	
}

    
/**** Función que lee por teclado los datos del usuario y los devuelve como un objeto de tipo Usuario. ****/
    private static Usuario LeerUsuario(){
    	
    	Usuario usuario = new Usuario();
   
    	Scanner sc = new Scanner(System.in); 
    
    
    	System.out.println("Introduce tu nombre:");
    	String nombre = sc.nextLine();
    	usuario.setNombre(nombre);
    	
    	
    	System.out.println("Introduce tu edad:");
    	int edad = sc.nextInt();
    	sc.nextLine();
    	usuario.setEdad(edad);
    	
    
    	System.out.println("Introduce tu DNI:");
    	String DNI = sc.nextLine();
    	usuario.setNombre(DNI);
    	
    	sc.close();
        return usuario;
    }

    
/**** Funcion que lee por teclado un ingreso, lo agrega a la lista de ingresos y muestra mensaje ****/
    private static void addIngresos(Cuenta cuenta){
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Introduzca la descripcion del ingreso");
    	String descripcion = sc.nextLine();
    	
    	System.out.println("Introduce la cantidad del ingreso");
    	double cantidad = sc.nextDouble();
    	sc.nextLine();
    	Ingreso ingreso = new Ingreso(cantidad, descripcion);
    	cuenta.addIngresos(descripcion, cantidad);
    	
    }

    
/**** Muestra por pantalla el listado de ingresos ****/
    private static void imprimirIngresos(Cuenta cuenta){
    	 ArrayList<Ingreso> listaIngresos = cuenta.getIngresos();
        
        for (Ingreso ingreso : listaIngresos) {
            System.out.println(ingreso.toString());
            }
    }

/**** Funcion que lee por teclado un Gasto y lo agrega a la lista de gastos  y muestra mensaje ****/
    private static void addGastos(Cuenta cuenta){
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Introduzca la descripcion del gasto");
    	String descripcion = sc.nextLine();
    	
    	System.out.println("Introduce la cantidad del gasto");
    	double cantidad = sc.nextDouble();
    	sc.nextLine();
    	Gasto gasto = new Gasto(cantidad, descripcion);
    	sc.close();
        
    }

/**** Muestra por pantalla el listado de gastos ****/
    private static void imprimirGastos(Cuenta cuenta){
   	 ArrayList<Gasto> listaGastos = cuenta.getGastos();
     
     for (Gasto gasto : listaGastos) {
         System.out.println(gasto.toString());
         }
    }
}
