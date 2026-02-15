package org.pgm;

public class CharacterOccurrence {
	public static void main(String[] args) {

		String s = "Selenium";
		char a = 'e';
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == a) {
				count++;

			}
		}
		System.out.println("e :" + count);
}
}

