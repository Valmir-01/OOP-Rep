package Lab4;

public class Main4 {
    public static void main(String[] args) {
        //first file
        //String[] expressions = FileRead.readFromFile("src/Lab4/three_expression.txt");
        //second file
        String[] expressions = FileRead.readFromFile("src/Lab4/one_expression.txt");

        for(String expression : expressions){
            System.out.println(expression + " : " + ExpressionValidator.balancedParenthesis(expression));
        }
    }
}
