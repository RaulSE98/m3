package m3;
import java.util.Arrays;

public class Coche extends Vehiculo{
	
		private Rueda[] delantera = new Rueda[2];
		private Rueda[] trasera = new Rueda[2];

		public Coche () {
			super();
			this.delantera[0] = generarRueda();
			this.delantera[1] = delantera[0];
			this.trasera[0] = generarRueda();
			this.trasera[1] = trasera[0];
		}
		
		public Rueda[] getDelantera() {
			return delantera;
		}
		public void setDelantera(Rueda[] delantera) {
			this.delantera = delantera;
		}
		public Rueda[] getTrasera() {
			return trasera;
		}
		public void setTrasera(Rueda[] trasera) {
			this.trasera = trasera;
		}

		@Override
		public String toString() {
			return "Coche [delantera=" + Arrays.toString(delantera) + ", trasera=" + Arrays.toString(trasera) + ", matricula="
					+ matricula + ", marca=" + marca + ", color=" + color + "]";
		}
		
}
