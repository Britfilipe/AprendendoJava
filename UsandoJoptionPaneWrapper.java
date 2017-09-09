import javax.swing.JOptionPane;
public class UsandoJoptionPaneWrapper {

    public static void main(String[] args) {
        //Entrada
        //Scanner entrada = new Scanner(System.in);
        String nome = JOptionPane.showInputDialog( null, "Digite Seu Nome");
        String sobrenome = JOptionPane.showInputDialog( null, "Digite Seu Sobrenome");
        
        String aux = JOptionPane.showInputDialog( null, "Digite Seu Salario");
        
        double salario = Double.parseDouble(aux);
        
        aux = JOptionPane.showInputDialog(null, "Digite sua Idade");
        
        int idade = Integer.parseInt(aux);
        
        
        
        
        //Processamento
        double resul = salario * idade;
        String nomeComleto = nome + " " + sobrenome;
        
        //Saida
        JOptionPane.showMessageDialog(null, nomeComleto);
        JOptionPane.showMessageDialog(null, "Salario X Idade" + resul);
        
        
       
    }
    
}
