public class IfElse {
    public static void main(String[] args) {
        String input = "if 3 < 5 1 0";
        System.out.println(evaluate(input));
    }
    public static int evaluate(String input) {
        String[] parts = input.split(" ");
        int left = Integer.parseInt(parts[1]);
        String operator = parts[2];
        int right = Integer.parseInt(parts[3]);
        int trueValue = Integer.parseInt(parts[4]);
        int falseValue = Integer.parseInt(parts[5]);
        boolean condition = compare(left, operator, right);
        if (condition) {
            return trueValue;
        } else {
            return falseValue;
        }
    }

    public static boolean compare(int left, String op, int right) {
        switch (op) {
            case ">":
                return left > right;
            case "<":
                return left < right;
            case "=":
                return left == right;
            case ">=":
                return left >= right;
            case "<=":
                return left <= right;
            default:
                System.out.println("Unknown operator");
                return false;
        }
    }
}
