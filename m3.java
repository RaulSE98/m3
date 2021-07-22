package m3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class m3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Titular> titular = new ArrayList<>();
		ArrayList<Coche> coche = new ArrayList<>();
		ArrayList<Bici> moto = new ArrayList<>();
		ArrayList<Camion> camion = new ArrayList<>();
		
		final String COCHE = "coche", MOTO = "moto", CAMION = "camion", L_COCHE = "B", L_MOTO = "A", L_CAMION = "C";
		String tLicencia = "", tVehiculo = "";
		
		
		do {
			
			Licencia licencia = new Licencia();
			Titular titular1 = new Titular(licencia);
			
			String vehiculo = JOptionPane.showInputDialog("Que vehiculo quieres? (coche/moto/camion)").toLowerCase();
			
			if (comprobarLicencia(vehiculo, titular1, COCHE, L_COCHE)) {
				coche.add(new Coche());
				tLicencia = L_COCHE;
				tVehiculo = COCHE;
				System.out.println(coche.toString());			
			}
			else if (comprobarLicencia(vehiculo, titular1, MOTO, L_MOTO)) {
				moto.add(new Bici());
				tLicencia = L_MOTO;
				tVehiculo = MOTO;
				System.out.println(moto.toString());
			}
			else if (comprobarLicencia(vehiculo, titular1, CAMION, L_CAMION)) {
				camion.add(new Camion());
				tLicencia = L_CAMION;
				tVehiculo = CAMION;
				System.out.println(camion.toString());
			}
			else {
				System.out.println("Error de licencia");
			}

			titular.add(titular1);
			
			if (JOptionPane.showInputDialog("El titular sera el conductor? (si/no)").toLowerCase().equals("no")) {
				Conductor conductor1 = new Conductor(licencia);
				if (comprobarLicencia(vehiculo, conductor1, tVehiculo, tLicencia)) {
					System.out.println("Correcto");
				}
				else {
					System.out.println("Error de licencia");
				}
			}
			
		} while (Boolean.parseBoolean(JOptionPane.showInputDialog("Quieres otro vehiculo? (true/false)")));
		
		
	}
	
	public static boolean comprobarLicencia(String vehiculo, Titular titular1, String tipo, String licencia) {
		return vehiculo.equals(tipo) && titular1.licencia.getTipo().equals(licencia);
	}
	public static boolean comprobarLicencia(String vehiculo, Conductor conductor1, String tipo, String licencia) {
		return vehiculo.equals(tipo) && conductor1.licencia.getTipo().equals(licencia);
	}

}
