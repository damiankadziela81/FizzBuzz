public class FizzBuzz {

    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            System.out.println(fizzBuzz(i));
        }

        for (int i = 1; i < 100; i++) {
            System.out.println(fizzBuzzWithStringBuilder(i));
        }

    }

    public static String fizzBuzz(int idx) {

        if ((idx % 3 == 0) && (idx % 5 == 0)) return "FizzBuzz";
        if (idx % 3 == 0) return "Fizz";
        if (idx % 5 == 0) return "Buzz";
        return Integer.toString(idx);
    }

    public static String fizzBuzzWithStringBuilder(int idx){
        StringBuilder sb = new StringBuilder();
        if (idx % 3 == 0) sb.append("Fizz");
        if (idx % 5 == 0) sb.append("Buzz");
        if (idx % 3 != 0 && idx % 5 != 0) sb.append(idx);
        return sb.toString();
    }

}
