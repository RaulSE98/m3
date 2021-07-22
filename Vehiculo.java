package m3;
import javax.swing.JOptionPane;

public abstract class Vehiculo {
	
		protected String matricula;
		protected String marca;
		protected String color;
		
		
		public String getmatricula() {
			return matricula;
		}
		public void setmatricula(String matricula) {
			this.matricula = matricula;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		
		
		public Vehiculo () {
		this.matricula = matricula();
		this.marca = marca();
		this.color = color();
		}
		
		
		public Rueda generarRueda() {
			String marca;
			double diametro;
			
			marca = JOptionPane.showInputDialog("Introduce la marca de la rueda");
			
			do {
	            String diametro_usuario = JOptionPane.showInputDialog("Introduce el diametro de la rueda");
	            diametro=Double.parseDouble(diametro_usuario);
	        } while(diametro < 0.4 || diametro > 4);
			
			Rueda rueda = new Rueda (marca, diametro);
			
			return rueda;
		}
		
		//Comprovacion 
		private String matricula() {
			String matricula ="", letras = "";
			int num;
			
			do {
				matricula = JOptionPane.showInputDialog("Introduce los numeros de la matricula");
				num = Integer.parseInt(matricula);
			} while (num / 1000 <= 0 || num / 1000 > 10);
			
			do {
				letras = JOptionPane.showInputDialog("Introduce las letras de la matricula").toUpperCase();
			} while (letras.length() != 2 && letras.length() != 3);
			
			matricula += letras;
			
			return matricula;
		}
		
		private String marca() {
			return JOptionPane.showInputDialog("Introduce la marca");
		}
		private String color() {
			return JOptionPane.showInputDialog("Introduce el color");
		}

}
