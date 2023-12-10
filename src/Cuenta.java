
import java.util.ArrayList;
import java.util.List;

/** PAC DESARROLLO M03B 1S2324
 *  Sigue las especificaciones del enunciado de la pac de Desarrollo
 *  No se puede importar ninguna otra clase, dentro de esta clase.
 *  Obligatorio utilizar esta plantilla
 *  
 */
public class Cuenta{

   	//inserta código aquí
	private double saldo;
	private Usuario usuario;
	private ArrayList<Gasto> gastos = new ArrayList<>();
	private ArrayList<Ingreso> ingresos = new ArrayList<>();
	
	
	public Cuenta(Usuario usuario) {
		this.saldo = 0;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public double addIngresos(String description, double cantidad) {
		saldo += cantidad;
		Ingreso ingreso = new Ingreso (cantidad, description);
		ingresos.add(ingreso);
		
		return saldo;
	}
	
	public double addGastos(String description, double cantidad) {
		if(cantidad <= saldo) {
			saldo -= cantidad;
			Gasto gasto = new Gasto (cantidad, description);
			gastos.add(gasto);
		
			return saldo;
		}else {
			GastoException error1 = new GastoException();
			System.out.println("No tienes suficiente dinero");
			return saldo;
		}

	}
	
	public ArrayList<Ingreso> getIngresos(){
		return ingresos;
	}
	
	public ArrayList<Gasto> getGastos(){
		return gastos;
	}
	
	@Override
	public String toString() {
		return usuario + Double.toString(saldo);
	}
	
}
