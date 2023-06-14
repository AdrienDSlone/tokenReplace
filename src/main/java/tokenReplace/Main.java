package tokenReplace;

public class Main {

	public static void main(String[] args) {
		String salut = "Bonjour (prenom), vous habitez : (adresse)";
		Transformer transformer = new Transformer();
		transformer.addToken("(prenom)", "Adrien");
		transformer.addToken("(adresse)", "à Lille");
		System.out.println(transformer.transforme(salut));
	}
}
