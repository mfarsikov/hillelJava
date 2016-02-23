package intro;

/**
 * Created by User on 19.02.2016.
 */
public class StringExample {

    public static void main(String[] args) {

        String str = "blue";
        String str1 = new String("some string");

        char symbol = str.charAt(3);
        System.out.println(symbol);

        int sum = getNumberOfSymbols('s', str);
        System.out.println("Number of s in " + str + " is " + sum);

        String str2 = str.concat(" cat");
        System.out.println("Concat strings: " + str2);

        String str3 = str + " dog";
        System.out.println("Concat with +: " + str3);

        String str4 = "\"Animal\"";
        System.out.println(str4);

        String str5 = "Word with spaces ";
        System.out.println(str5.trim());

        String str6 = str5.replace("with", "something");
        System.out.println("Replace example: " + str6);

        //5 - inclusive, 10 - exclusive
        String str7 = str5.substring(5, 10);
        System.out.println("Substring example: " + str7);

        String[] str8 = str6.split(" ");
        System.out.println(str8);
    }

    public static int getNumberOfSymbols(char symbol, String s) {

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == symbol) {
                sum++;
            }
        }
        return sum;
    }
}
