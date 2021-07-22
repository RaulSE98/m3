package m3;
import javax.swing.JOptionPane;

public class Conductor extends Persona{

		private boolean garaje;
		private boolean seguro;

		public Conductor (Licencia licencia) {
			super(licencia);
			this.garaje = Boolean.parseBoolean(JOptionPane.showInputDialog("Tienes garaje? (true/false)"));
			this.seguro = Boolean.parseBoolean(JOptionPane.showInputDialog("Tienes seguro? (true/false)"));
		}


		public boolean isGaraje() {
			return garaje;
		}

		public void setGaraje(boolean garaje) {
			this.garaje = garaje;
		}

		public boolean isSeguro() {
			return seguro;
		}

		public void setSeguro(boolean seguro) {
			this.seguro = seguro;
		}
}
