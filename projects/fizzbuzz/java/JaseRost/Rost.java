import java.util.ArrayList;

public class Rost {

    public static void main(String[] args) {
        int num = Integer.valueOf(args[0]);

        ArrayList<String> results = result(num);
        for (String line : results) {
            System.out.println(line);
        }
    }

    public static ArrayList<String> result(int num) {

        ArrayList<String> results = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            String print = "";
            if (i % 3 == 0) {
                print = print.concat("Fizz");
            }
            if (i % 5 == 0) {
                print = print.concat("Buzz");
            }
            if (i % 7 == 0) {
                print = print.concat("Bazz");
            }
            if ("".equals(print)) {
                print = String.valueOf(i);
            }
            results.add(print);
        }
        return results;
    }
}
