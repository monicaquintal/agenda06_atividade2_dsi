package monicaquintal_ag6_ds_i;

import javax.swing.JOptionPane;

public class MonicaQuintal_Ag6_DS_I {
    
    public static void main(String[] args) {
        // declaração de variáveis
        int numero; // variável para armazenamento do número final da placa
        
        // entrada de dados com conversão de tipo
        numero = Integer.parseInt(JOptionPane.showInputDialog("Insira o número final da placa do veículo: "));
        
        switch (numero) {
            case 1:
                JOptionPane.showMessageDialog(null, "O pagamento do IPVA eve ser relizado até 30/04.");
                break;
                
            case 2:
                JOptionPane.showMessageDialog(null, "O pagamento do IPVA deve ser relizado até 31/05.");
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "O pagamento do IPVA deve ser realizado até 30/06.");
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "O pagamento do IPVA deve ser realizado até 31/07.");
                break;

            case 5:
                JOptionPane.showMessageDialog(null, "O pagamento do IPVA deve ser relizado até 31/08.");
                break;

            case 6:
                JOptionPane.showMessageDialog(null, "O pagamento do IPVA deve ser realizado até 30/09.");
                break;

            case 7:
                JOptionPane.showMessageDialog(null, "O pagamento do IPVA deve ser realizado até 31/10.");
                break;

            case 8:
                JOptionPane.showMessageDialog(null, "O pagamento do IPVA deve ser realizado até 30/11.");
                break;

            case 9:
                JOptionPane.showMessageDialog(null, "O pagamento do IPVA deve ser realizado até 31/12.");
                break;

            case 0:
                JOptionPane.showMessageDialog(null, "O pagamento do IPVA deve ser realizado até 31/12.");
                break;

            default:
                JOptionPane.showMessageDialog(null, "O valor informado está incorreto. Insira o número final da Placa (de 0 a 9).");
        } //fim do switch-case
        
    } //fim do método main
    
} //fim da classe
