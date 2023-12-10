public class Usuario {
   	//inserta código aquí
	private String nombre;
	private int edad;
	private String DNI;
	
	public Usuario() {
		
		
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getDNI() {
		return DNI;
	}
	
	public boolean setDNI(String DNI) {
		
		if(DNI.matches("\\d{8}[A-Za-z]")) {			
			this.DNI = DNI;
			return true;
		}else {
			return false;
		}
		
	}
	
		


	@Override
	public String toString() {
		return "El nombre: " + nombre + "de edad " + edad + "con DNI: " + DNI;
	}
}
