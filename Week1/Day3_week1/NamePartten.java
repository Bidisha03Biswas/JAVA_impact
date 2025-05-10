import java.util.*;

public class NamePattern {
    private static final int HEIGHT = 5;

    private static final Map<Character, String[]> letterPatterns = new HashMap<>();

    static {
        letterPatterns.put('A', new String[]{
            "  *  ",
            " * * ",
            "*****",
            "*   *",
            "*   *"
        });
        letterPatterns.put('B', new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*   *",
            "**** "
        });
        letterPatterns.put('C', new String[]{
            " ****",
            "*    ",
            "*    ",
            "*    ",
            " ****"
        });
        letterPatterns.put('D', new String[]{
            "**** ",
            "*   *",
            "*   *",
            "*   *",
            "**** "
        });
        letterPatterns.put('E', new String[]{
            "*****",
            "*    ",
            "***  ",
            "*    ",
            "*****"
        });
        letterPatterns.put('F', new String[]{
            "*****",
            "*    ",
            "***  ",
            "*    ",
            "*    "
        });
        letterPatterns.put('G', new String[]{
            " ****",
            "*    ",
            "* ** ",
            "*  * ",
            " ****"
        });
        letterPatterns.put('H', new String[]{
            "*   *",
            "*   *",
            "*****",
            "*   *",
            "*   *"
        });
        letterPatterns.put('I', new String[]{
            "*****",
            "  *  ",
            "  *  ",
            "  *  ",
            "*****"
        });
        letterPatterns.put('J', new String[]{
            "  ***",
            "   * ",
            "   * ",
            "*  * ",
            " **  "
        });
        letterPatterns.put('K', new String[]{
            "*  * ",
            "* *  ",
            "**   ",
            "* *  ",
            "*  * "
        });
        letterPatterns.put('L', new String[]{
            "*    ",
            "*    ",
            "*    ",
            "*    ",
            "*****"
        });
        letterPatterns.put('M', new String[]{
            "*   *",
            "** **",
            "* * *",
            "*   *",
            "*   *"
        });
        letterPatterns.put('N', new String[]{
            "*   *",
            "**  *",
            "* * *",
            "*  **",
            "*   *"
        });
        letterPatterns.put('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });
        letterPatterns.put('P', new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        });
        letterPatterns.put('Q', new String[]{
            " *** ",
            "*   *",
            "* * *",
            "*  * ",
            " ** *"
        });
        letterPatterns.put('R', new String[]{
            "**** ",
            "*   *",
            "**** ",
            "* *  ",
            "*  * "
        });
        letterPatterns.put('S', new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        });
        letterPatterns.put('T', new String[]{
            "*****",
            "  *  ",
            "  *  ",
            "  *  ",
            "  *  "
        });
        letterPatterns.put('U', new String[]{
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });
        letterPatterns.put('V', new String[]{
            "*   *",
            "*   *",
            "*   *",
            " * * ",
            "  *  "
        });
        letterPatterns.put('W', new String[]{
            "*   *",
            "*   *",
            "* * *",
            "** **",
            "*   *"
        });
        letterPatterns.put('X', new String[]{
            "*   *",
            " * * ",
            "  *  ",
            " * * ",
            "*   *"
        });
        letterPatterns.put('Y', new String[]{
            "*   *",
            " * * ",
            "  *  ",
            "  *  ",
            "  *  "
        });
        letterPatterns.put('Z', new String[]{
            "*****",
            "   * ",
            "  *  ",
            " *   ",
            "*****"
        });
        letterPatterns.put(' ', new String[]{
            "     ",
            "     ",
            "     ",
            "     ",
            "     "
        });
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine().toUpperCase();

        for (int line = 0; line < HEIGHT; line++) {
            for (int i = 0; i < name.length(); i++) {
                char ch = name.charAt(i);
                String[] pattern = letterPatterns.getOrDefault(ch, letterPatterns.get(' '));
                System.out.print(pattern[line] + "  ");
            }
            System.out.println();
        }

        sc.close();
    }
}
