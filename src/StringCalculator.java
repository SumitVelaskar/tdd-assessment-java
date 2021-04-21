public class StringCalculator {

    public static int add(String numbers) {
        int ans = 0;

        // empty string case
        if (numbers.length() == 0)
            return 0;
        // single number case
        if (numbers.length() == 1)
            return Integer.parseInt(numbers);
        // two or more numbers case with handler for new line escape characters
        if (numbers.length() >= 3) {

            for (String i : numbers.split("[\n,]+")) {
                ans += Integer.parseInt(i);
            }
        }

        return ans;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(add("1\n2,3\n4"));
    }
}
