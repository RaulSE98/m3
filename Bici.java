package m3;

public class Bici extends Vehiculo{

		private Rueda delantera;
		private Rueda trasera;

		public Bici () {
			super();
			this.delantera = generarRueda();
			this.trasera = generarRueda();
		}

		public Rueda getDelantera() {
			return delantera;
		}

		public void setDelantera(Rueda delantera) {
			this.delantera = delantera;
		}

		public Rueda getTrasera() {
			return trasera;
		}

		public void setTrasera(Rueda trasera) {
			this.trasera = trasera;
		}

		@Override
		public String toString() {
			return "Bici [delantera=" + delantera + ", trasera=" + trasera + ", matricula=" + matricula + ", marca=" + marca
					+ ", color=" + color + "]";
		}
}
