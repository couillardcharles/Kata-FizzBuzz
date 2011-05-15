package fr.arpinum.katas;

public class FizzBuzz {

	public String[] nombres() {
		final String[] nombres = new String[101];
		for (int nombre = 1; nombre < 101; nombre++) {
			nombres[nombre] = traduit(nombre);
		}
		return nombres;
	}

	private String traduit(final int nombre) {
		Mathematiques maths = new Mathematiques();
		if (maths.estUnMultipleDeTrois(nombre) || maths.estUnMultipleDeCinq(nombre)) {
			String résultat = "";
			if (maths.estUnMultipleDeTrois(nombre)) {
				résultat = "fizz";
			}
			if (maths.estUnMultipleDeCinq(nombre)) {
				résultat += "buzz";
			}
			return résultat;
		}
		return String.valueOf(nombre);
	}

}
