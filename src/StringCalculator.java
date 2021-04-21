public class StringCalculator {

    public static int add(String numbers) {
        int ans = 0;

        // empty string case
        if (numbers.length() == 0)
            return 0;
        // single number case
        if (numbers.length() == 1)
            return Integer.parseInt(numbers);
        // two numbers case
        if (numbers.length() == 3)
            return Integer.parseInt(numbers.split(",")[0]) + Integer.parseInt(numbers.split(",")[1]);

        return ans;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(add("1,2"));
    }
}
