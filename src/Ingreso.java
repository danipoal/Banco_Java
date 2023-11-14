/** PAC DESARROLLO M03B 1S2324
 *  Sigue las especificaciones del enunciado de la pac de Desarrollo
 *  No se puede importar ninguna clase, dentro de esta clase.
 *  Obligatorio utilizar esta plantilla
 *  
 */
public class Ingreso extends Dinero{
   	//inserta código aquí
	public Ingreso(double ingreso, String description) {
		this.dinero = ingreso;
		this.description = description;
	}
	@Override
	public String toString() {
		return "El Ingreso es " + dinero + "por la descripcion: " + description;
	}
	
}
