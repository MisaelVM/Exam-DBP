
public class Alumno {
	int cui;
	String clave;
	
	public Alumno() {
		this.cui = 20192272;
		this.clave = "M548A89";
	}
	
	public Alumno(int cui, String clave) {
		this.cui = cui;
		this.clave = clave;
	}
	
	public int getCui() {
		return cui;
	}
	
	public void setCui(int cui) {
		this.cui = cui;
	}
	
	public String getClave() {
		return clave;
	}
	
	public void setCodigo(String clave) {
		this.clave = clave;
	}
}
