package Lec7;

public class Triciky_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ABCA";
		Print_amswer(str, "");

	}

	public static void Print_amswer(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			boolean falg = false;
			for (int j = i + 1; j < ques.length(); j++) {
				if (ques.charAt(j) == ch) {
					falg = true;
					break;
				}
			}
			if (falg == false) {
				String s1 = ques.substring(0, i);
				String s2 = ques.substring(i + 1);
				Print_amswer(s1 + s2, ans + ch);
			}
		}

	}

}
