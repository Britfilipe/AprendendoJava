import java.util.Scanner;
public class UsandoWhile {


    public static void main(String[] args) {
        //Entrada
        
        Scanner entrada = new Scanner(System.in);
        
        int condicao = 0;
        
        //Processamento e Saida
        do {
            
            System.out.println("digite 1 para sair");
            condicao = entrada.nextInt();
            System.out.println("Voce digitou " + condicao); 
             
        }while (condicao != 1);
        
        
        System.out.println("Até Logo");
        
    }
    
}