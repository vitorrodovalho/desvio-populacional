package desviopopulacional;

import java.util.Scanner;

/**
 *
 * @author vitor
 */
public class DesvioPopulacional {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int qtd=0,i=0;
        float media,soma=0,SSx=0,desvioPop;
        
        System.out.println("Programa que calcula o desvio padrão populacional");
        System.out.println("Informe o números de entradas que deseja utilizar");
        qtd = sc.nextInt();
        
        float [] valores = new float [qtd]; // Array que armazena valores
        float [] desvio = new float [qtd]; // Array que desvio padrao
        
        for(i=0;i<qtd;i++){
            System.out.println("Informe o "+(i+1)+"º valor:");
            valores[i] = sc.nextFloat(); // Guarda o valor lido no Array
            soma = soma + valores[i];
        }
        
        media = soma / qtd; // Calculo o valor de μ
        
        for(i=0;i<qtd;i++){
            desvio[i] = valores[i] - media; // x - media 
            desvio[i] = desvio[i] * desvio[i]; // (x - media)^2 
            SSx = SSx + desvio[i]; 
        }
        
        desvioPop =  SSx / qtd; // dividindo μ pelo numeros de entrada
        
        desvioPop = (float) Math.sqrt(desvioPop); // raiz quadrada de μ
        
        System.out.println("O desvio padrão populacional é = "+desvioPop);
        
    }
    
}
