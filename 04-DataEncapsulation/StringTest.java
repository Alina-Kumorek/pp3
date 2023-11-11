// 14.	The class String includes methods for examining individual characters of the sequence,
// for comparing strings, for searching strings, for extracting substrings,
// and for creating a copy of a string with all characters translated to uppercase or to lowercase.
// You can use the methods in your programs. Write a program that, for the text:
//         "Have a nice day!"
// calculates and displays:
//     a.	The number of characters
//     b.	The first 9 characters
//     c.	True if the text ends with the suffix "day!"
//     d.	True if the text is not empty
//     e.	Index of the last occurrence of the character ‘e’
//     f.	The text in which each space character has been replaced with a minus sign
//     g.	The text converted to upper case


public class StringTest {
    public static void main(String[] args) {
        String s = "Have a nice day!";
        System.out.println(s);
        System.out.println("Number of characters: " + s.length());
        System.out.println("The first 9 characters: " + s.substring(0, 9));
        System.out.println("Ends with \"day!\"? " + s.endsWith("day!"));
        System.out.println("Not empty? " + ! s.isEmpty());
        System.out.println("Last occurence of \"e\": " + s.lastIndexOf('e'));
        System.out.println("Space replaced with \"-\": " + s.replace(' ', '-'));
        System.out.println("Upper case: " + s.toUpperCase());
    }
}