public class SquareDigit {

    public static int squareDigits(int n) {
        StringBuilder numbers = new StringBuilder();

        for (String item : Integer.toString(n).split("")) {
            int value = Integer.parseInt(item) * Integer.parseInt(item);
            numbers.append(value);
        }

        return Integer.parseInt(numbers.toString());
    }

    public static void main(String[] args) {
        System.out.println(squareDigits(911909));
    }
}