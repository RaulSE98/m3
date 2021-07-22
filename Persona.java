package m3;
import javax.swing.JOptionPane;

public abstract class Persona {

		protected String nombre;
		protected String apellido;
		protected String nacimiento;
		protected Licencia licencia;
		
		public Persona(Licencia licencia) {
			this.nombre = JOptionPane.showInputDialog("Introduce tu nombre");
			this.apellido = JOptionPane.showInputDialog("Introduce tu apellido");
			this.nacimiento = JOptionPane.showInputDialog("Fecha de nacimiento (dd/mm/aaaa)");
			this.licencia = licencia;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getNacimiento() {
			return nacimiento;
		}

		public void setNacimiento(String nacimiento) {
			this.nacimiento = nacimiento;
		}

		public Licencia getLicencia() {
			return licencia;
		}

		public void setLicencia(Licencia licencia) {
			this.licencia = licencia;
		}
		
}
