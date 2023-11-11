// 14.	Define a class Alphabet that contains a static method isAlphabet(String t)
// that returns true if the letters in the text t are in alphabetical order or false otherwise. Sample result:
//     Alphabet.isAlphabet("abegsw") returns true
//     Alphabet.isAlphabet("abcmhsw") returns false

public class Alphabet {
    static boolean isAlphabet(String t) {
        boolean isAlpha = true;
        char a;
        char b;
        for (int i = 0; i < t.length() - 1; i++) {
            a = t.charAt(i);
            b = t.charAt(i + 1);
            if (a > b) {
                isAlpha = false;
                break;
            }
        }
        return isAlpha;
    }
}
