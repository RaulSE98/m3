package m3;
import javax.swing.JOptionPane;

public abstract class Licencia {
	
		private int id;
		private String tipo;
		private String nombre;
		private String caducidad;
		
		public Licencia() {
			this.id = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero de licencia"));
			this.tipo = JOptionPane.showInputDialog("Introduce tipo de licencia");
			this.nombre = JOptionPane.showInputDialog("Introduce nombre");
			this.caducidad = JOptionPane.showInputDialog("Introduce fecha de caducidad (dd/mm/aaaa)");
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getCaducidad() {
			return caducidad;
		}

		public void setCaducidad(String caducidad) {
			this.caducidad = caducidad;
		}

}
