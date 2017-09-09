import javax.swing.JOptionPane;
public class UsandoArray {


    public static void main(String[] args) {

        
        //Entrada
        int idade [] = new int [10];
        
        for (int i = 0; i < idade.length; i++) {
        idade[i] = Integer.parseInt( JOptionPane.showInputDialog( null, "Digite a Idade" + (i+1) ) );   
                
        }   
        //Processamento
        int somaidade = 0;
        
        for (int i = 0; i < idade.length; i++) {
            somaidade = somaidade + idade[i];
               
        }
        //Saida
        double media = somaidade / (double)idade.length;
        
        System.out.println("A media é : " + media);
    }
    
}
