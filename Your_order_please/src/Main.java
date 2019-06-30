public class Main {

    public static String order(String words) {
        String[] arr = words.split(" ");
        String[] newArr = new String[arr.length];
        boolean flag = false;
        for (String arrayItem : arr) {
            for (char character : arrayItem.toCharArray()) {
                if (Character.isDigit(character)) {
                    int val = Character.getNumericValue(character) - 1;
                    newArr[val] = arrayItem;
                    flag = true;
                    break;
                }else {
                    flag = false;
                }
            }
        }
        return flag ? String.join(" ", newArr) : "";
    }

    public static void main(String[] args) {
        System.out.println(order("Empty input should return empty string"));
        System.out.println(order("is2 Thi1s T4est 3a"));
    }


}
