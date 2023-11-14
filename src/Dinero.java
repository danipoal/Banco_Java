/** PAC DESARROLLO M03B 1S2324
 *  Sigue las especificaciones del enunciado de la pac de Desarrollo
 *  No se puede importar ninguna clase, dentro de esta clase.
 *  Obligatorio utilizar esta plantilla
 *  
 */
public abstract class Dinero {
   	//inserta código aquí
	protected double dinero;
	protected String description;
	
	public double getDinero() {
		return this.dinero;
	}
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
