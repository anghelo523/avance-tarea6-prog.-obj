package pe.edu.upeu.calcfx.control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.springframework.stereotype.Controller;

@Controller
public class CalcfxControl {

    @FXML
    private TextField txtResultado;

    private void escribirNumero(String numero) {
        txtResultado.appendText(numero);
    }

    private void agregarOperador(String operador) {
        if (!txtResultado.getText().isEmpty() && txtResultado.getText().length() >= 4) {
            char op = txtResultado.getText().charAt(txtResultado.getText().length() - 2);
            if (txtResultado.getText().toString().contentEquals(String.valueOf(op))) {
                txtResultado.appendText(" " + operador + " ");
            }
        } else {
            txtResultado.appendText(" " + operador + " ");
        }
    }

    private void calcularResultado() {
        try {
            String[] tokens = txtResultado.getText().split(" ");
            if (tokens.length < 3) return;

            double num1 = Double.parseDouble(tokens[0]);
            String operador = tokens[1];
            double num2 = Double.parseDouble(tokens[2]);
            double resultado = 0;

            switch (operador) {
                case "+": resultado = num1 + num2; break;
                case "-": resultado = num1 - num2; break;
                case "*": resultado = num1 * num2; break;
                case "/":
                    if (num2 != 0) resultado = num1 / num2;
                    else {
                        txtResultado.setText("Error: Div/0");
                        return;
                    }
                    break;
                case "^": resultado = Math.pow(num1, num2); break;
            }

            String[] dd = String.valueOf(resultado).split("\\.");
            if (dd.length == 2 && dd[1].equals("0")) {
                txtResultado.setText(dd[0]);
            } else {
                txtResultado.setText(String.valueOf(resultado));
            }

        } catch (Exception e) {
            txtResultado.setText("Error");
            System.out.println(e.getMessage());
        }
    }

    // NUEVOS MÉTODOS PARA FUNCIONALIDADES ESPECIALES

    private void calcularRaizCuadrada() {
        try {
            double num = Double.parseDouble(txtResultado.getText());
            if (num < 0) {
                txtResultado.setText("Error");
                return;
            }
            double resultado = Math.sqrt(num);
            txtResultado.setText(String.valueOf(resultado));
        } catch (Exception e) {
            txtResultado.setText("Error");
        }
    }

    private void calcularInverso() {
        try {
            double num = Double.parseDouble(txtResultado.getText());
            if (num == 0) {
                txtResultado.setText("Error: Div/0");
                return;
            }
            double resultado = 1 / num;
            txtResultado.setText(String.valueOf(resultado));
        } catch (Exception e) {
            txtResultado.setText("Error");
        }
    }

    private void mostrarPi() {
        txtResultado.setText(String.valueOf(Math.PI));
    }

    @FXML
    private void controlClick(ActionEvent event) {
        Button boton = (Button) event.getSource();
        switch (boton.getId()) {
            case "btn0", "btn1", "btn2", "btn3", "btn4", "btn5", "btn6", "btn7", "btn8", "btn9":
                escribirNumero(boton.getText());
                break;
            case "btnDiv", "btnMult", "btnRest", "btnSum", "btnPow":
                agregarOperador(boton.getText());
                break;
            case "btnBorrar":
                txtResultado.setText("");
                break;
            case "btnIgual":
                calcularResultado();
                break;
            case "btnRaiz":
                calcularRaizCuadrada();
                break;
            case "btnInverso":
                calcularInverso();
                break;
            case "btnPi":
                mostrarPi();
                break;
            default:
                break;
        }
    }
}
