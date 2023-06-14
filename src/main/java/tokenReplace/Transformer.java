package tokenReplace;

import java.util.HashMap;

public class Transformer {
	private HashMap<String,String> hashmap = new HashMap<String,String>();
	
	/**
	 * adds a new token which will used when transforming texts.
	 * @param token
	 * @param value
	 */
	public void addToken(String token, String value) {
		if (checkToken(token)) {
			hashmap.put(token, value);
		} else {
			System.out.println("erreur");
		}
	}
	
	public void removeToken(String token) {
		if (checkToken(token)) {
			hashmap.remove(token);
		} else {
			System.out.println("erreur");
		}
	}

	/** 
	 * Transforms a text by replacing a set of tokens by predefined values
	 * example : 
	 * I am {name} => I am Robert
	 * A token should be a name between brackets {token}
	 * @param text
	 * @return
	 */
	public String transforme(String text) {
		for (String key : hashmap.keySet()) {
			text=text.replace(key, hashmap.get(key));
		}
		return text;
	}
	
	private boolean checkToken(String token) {
		if (token==null || token.equals("") || token.charAt(0)!='(' || token.charAt(token.length()-1) != ')') {
			return false;
		} else {
			return true;
		}
	}
}
