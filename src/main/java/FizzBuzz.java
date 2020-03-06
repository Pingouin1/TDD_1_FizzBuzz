public class FizzBuzz {

    public String fizzBuzz(int n) {
        String result = "";

        if (n % 3 == 0 || n % 10 == 3) {
            result += "Fizz";
        }

        if (n % 5 == 0) {
            result += "Buzz";
        }

        return result;
    }
}