public class Main {

    public static String highAndLow(String numbers) {
        String[] tmpArr = numbers.split(" ");
        int maxNumber = Integer.parseInt(tmpArr[0]);
        int minNumber = maxNumber;

        for (String item : tmpArr) {
            int val = Integer.parseInt(item);
            if (val > maxNumber) maxNumber = val;
            else if (val < minNumber) minNumber = val;
        }

        return maxNumber + " " + minNumber;
    }

    public static void main(String[] args) {
        highAndLow("1 2 3 4 5"); //5 1
        highAndLow("1 2 -3 4 5"); //5 -3
        highAndLow("1 9 3 4 -5");// 9 -5
        highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"); //42 -9
    }
}
