import java.util.Arrays;

public class Main {

    private static String encode(String str) {
        String[] arr = str.split("");
        int index = 0;

        StringBuilder string = new StringBuilder();

        while (index < arr.length) {
            string.append("(");
            for (int i = 0; i < arr.length; i++) {
                String s = arr[i];
                if (arr[index].equalsIgnoreCase(s) & index != i) {
                    string.replace(index, index + 1, ")");
                    break;
                }
            }

            index++;
        }

        return string.toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("Success"));
    }
}
