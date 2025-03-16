public class Consorcio {
    public static void main(String[] args) {
        double valorCota = 100.00;
        int quantidadeMeses = 10;
        double taxaJuros = 1.02;
        double total = 0;

        for (int i = 1; i <= quantidadeMeses; i++) {
            if (i > 1) {
                valorCota *= taxaJuros;
            }
            total = valorCota * 10;
            System.out.printf("Mês %d: Valor da cota: %.2f | Total: %.2f\n", i, valorCota, total);
        }
        System.out.printf("\nValor final que você irá receber após 10 meses: %.2f\n", total);
    }
}

