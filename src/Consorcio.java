import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class Consorcio {

        public static void main(String[] args) {
            DecimalFormat casas = new DecimalFormat("0.00");
            String lerinicialAplicacao = JOptionPane.showInputDialog("Digite o valor Inicial da sua aplicação: ");
            double inicialAplicacao = Double.parseDouble(lerinicialAplicacao);
            String lerquantidadeMeses = JOptionPane.showInputDialog("Digite a quantidade de meses: ");
            int quantidadeMeses = Integer.parseInt(lerquantidadeMeses);
            double taxajurosMensal = 0.1;
            double valorFinal = inicialAplicacao;

            for(int contador = 1; contador <= quantidadeMeses; ++contador) {
                valorFinal *= (double)1.0F + taxajurosMensal;
                JOptionPane.showMessageDialog(null, "Decorrido o " + contador + "º mês, o valor final, corresponde a:" + " R$ " + casas.format(valorFinal) + ".");
            }

            JOptionPane.showMessageDialog((Component)null, "Valor final da aplicação, após o " + quantidadeMeses + "º mês, será de: R$ " + casas.format(valorFinal)+ ".");
        }


}
