package app.flames;

public class Flames2 {

	public static void main(String[] args) {
		System.out.println(getNames("Suseendran", "Jency"));

		System.out.println(relationIs(performFlames(getNames("Suseendran", "Jency"))));

	}

	public static String getNames(String name1, String name2) {
		name1 = name1.toUpperCase();
		name2 = name2.toUpperCase();
		for (int i = 0; i < name1.length(); i++) {
			for (int j = 0; j < name2.length(); j++) {
				if (name1.charAt(i) == name2.charAt(j)) {

					name1 = name1.replaceFirst(String.valueOf(name1.charAt(i)), "#");
					name2 = name2.replaceFirst(String.valueOf(name2.charAt(j)), "#");

				}
			}
		}
		String result = name1 + name2;
		result = result.replaceAll("#", "");
		return result;
	}

	public static String performFlames(String result) {
		String flames = "FLAMES";
		int temp = 0;
		if (result.length() > 0) {
			while (flames.length() != 1) {
				temp = result.length() % flames.length();
				if (temp != 0)
					flames = flames.substring(temp) + flames.substring(0, temp - 1);
				else// last index
					flames = flames.substring(0, flames.length() - 1);

			}
		}
		return flames;
	}

	public static String relationIs(String relation) {
		switch (relation) {
		case "F":
			// System.out.println("Friends");
			// break;
			return "Friends";
		case "L":
			// System.out.println("Love");
			// break;
			return "Love";
		case "A":
			// System.out.println("Affection");
			// break;
			return "Affection";
		case "M":
			// System.out.println("Marriage");
			// break;
			return "Marriage";
		case "E":
			// System.out.println("Enemy");
			// break;
			return "Enemy";
		case "S":
			// System.out.println("Sibling");
			// break;
			return "Sibling";
		}
		return null;
	}
}
