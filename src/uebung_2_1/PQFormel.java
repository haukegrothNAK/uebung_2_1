package uebung_2_1;

public class PQFormel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p = 8;
		double q = 88;

		double unterderWurzel = ((p / 2) * (p / 2) - q);
		double vorderWurzel = (-p / 2);

		if (unterderWurzel < 0) {
			System.out.println("negativer Wert unter der Wurzel");

		} else {
			if (unterderWurzel > 0) {
				double x1 = (vorderWurzel + Math.sqrt(unterderWurzel));
				double x2 = (vorderWurzel - Math.sqrt(unterderWurzel));

				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);

			} else {
				double x3 = vorderWurzel;
				System.out.println("Es gibt nur ein Ergebnis:");
				System.out.println("Ergebnis = " + x3);

			}
		}

	}

}
