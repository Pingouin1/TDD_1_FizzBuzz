public class Main {

    private final static FizzBuzz fizzBuzz = new FizzBuzz();

    public static void main (String[] args){
        int i = 0;
        while (i < 100) {
            System.out.println(fizzBuzz.fizzBuzz(i));
            i++;
        }
    }
}
