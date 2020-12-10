package lab9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    private boolean isNumber(TextField input) {
        try {
            double val = Double.parseDouble(input.getText());
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }
    @Override
    public void start(Stage stage) {
        stage.setTitle("Calculator");
        TextField divisor = new TextField();
        TextField divident = new TextField();
        Label resultLable = new Label();
        Label errorLabel = new Label();
        Button button = new Button();
        button.setText("Divide");
        button.setOnAction(actionEvent ->
        {
            try
            {
                resultLable.setText("");
                errorLabel.setText("");
                double divisorValue = Double.parseDouble(divisor.getText());
                double dividentValue = Double.parseDouble(divident.getText());

                double resultValue = divisorValue / dividentValue;
                resultLable.setText( Double.toString(resultValue) );

                if (divisor.getText().isEmpty()) { throw new Exception("Enter a number"); }

                if (divident.getText().isEmpty()) { throw new Exception("Enter a number"); }

                if (dividentValue == 0 && divisorValue == 0)
                {
                    throw new ArithmeticException("Imagine you give " + divisor.getText() + " cookies to 0 friends, \nsee, it makes no sense, now cookie monster is sad  \nbecause he has no cookies, but you are sad because you \ndont have friends...");
                }
                if (divisorValue == 0)
                {
                    throw new ArithmeticException("Imagine you give " + divisor.getText() + " cookies to 0 friends, \nsee, it makes no sense, now cookie monster is happy \nthat he has cookies, but you are sad because you dont \nhave friends...");
                }
                if (dividentValue == 13)
                {
                    throw new UnluckyException("Unlucky Number 13");
                }
            }

            catch (ArithmeticException e) {

                errorLabel.setText(e.getMessage());

            }
            catch(NumberFormatException e)
            {
                if (isNumber((divident))) {
                    errorLabel.setText("Im number calculator, not ASCII convertor to divide \ncharacters...");
                }
                if (isNumber((divisor))) {
                    errorLabel.setText(("Im number calculator, not ASCII convertor to divide \ncharacters..."));
                }
                if(isNumber((divident)) && isNumber((divisor)) ) {
                    errorLabel.setText("Im number calculator, not ASCII convertor to divide \ncharacters...");
                }
            }
            catch(Exception e)
            {
                errorLabel.setText(e.getMessage());
            }
        });
        VBox calculator = new VBox(10);
        calculator.getChildren().addAll(divisor, divident, button, resultLable, errorLabel);
        stage.setScene(new Scene(calculator, 400, 400));
        stage.show();
    }

}