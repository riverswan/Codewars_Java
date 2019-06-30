public class Main {

    public static String order(String words) {
        String[] arr = words.split(" ");
        String[] newArr = new String[arr.length];
        for (String arrayItem : arr) {
            for (char character : arrayItem.toCharArray()) {
                if (Character.isDigit(character)) {
                    int val = Character.getNumericValue(character) - 1;
                    newArr[val] = arrayItem;
                }
            }
        }
        return String.join(" ", newArr);
    }

    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
    }


}
