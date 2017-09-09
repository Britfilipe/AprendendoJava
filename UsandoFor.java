import java.util.Scanner;
public class UsandoFor {

 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner( System.in );
        System.out.println("Digite o numero da Tabuada");
        int num = entrada.nextInt();
        int aux = 20;
        
        
        
        //Processamento e Saida
        
        for (int i = 1; i <=10; i++ ) {
            
            System.out.println( num + " X " + i + " = " + (num * i));
        
        }
        

    }
    
}
