
package viapas.exemplosformatacaosystemoutprintlnv17;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.text.NumberFormat;

public class ExemplosFormatacaoSystemOutPrintlnV17 {

    public static void main(String[] args) {
        String nome    = "João";
        int    idade   = 30;
        double salario = 12345.6789;

        // Concatenar Strings
        System.out.println("Nome: " + nome + ", Idade: " + idade + "\n");

        // Placeholders Simples
        System.out.printf("Nome: %s, Idade: %d \n", nome, idade );

        // Formatando Números Decimais
        System.out.printf("Salário: %.2f \n", salario );

        // Alinhamento de Strings
        System.out.printf("Nome: %-10s Idade: %d \n", nome, idade );  // Alinhado à esquerda
        System.out.printf("Nome: %10s Idade: %d \n", nome, idade);   // Alinhado à direita

        // Preenchimento com Zeros
        int numero = 42;
        System.out.printf("Número: %05d \n", numero );  // Saída: Número: 00042

        // Formatando Datas
        Date data = new Date(); // Obtém a data atual
        
        System.out.printf("Data: %tF %tT \n", data, data );  // Formato ISO 8601

        // Define o formato desejado: "dd/MM/yyyy"
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        // Formata a data e imprime
        System.out.println("Data formatada: " + formato.format(data) +"\n" );

        // Múltiplos Argumentos
        System.out.printf("Nome: %s, Idade: %d, Salário: %.2f \n", nome, idade, salario );

        //**************************************************************************  
        NumberFormat formatoBR = NumberFormat.getInstance(new Locale("pt","BR"));
        formatoBR.setMinimumFractionDigits(2);
        formatoBR.setMaximumFractionDigits(2);
        
        System.out.println("Valor em formato Brasil : " + formatoBR.format( salario ));
        //*************************************************************************** 

    }
}
