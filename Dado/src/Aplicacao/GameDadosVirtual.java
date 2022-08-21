package Aplicacao;
import java.util.Random;
import javax.swing.JOptionPane;

public class GameDadosVirtual {
	
	public static void main(String[] args) {
		
		
		do {
			//instância Random 
	        Random gerador = new Random();
	        Integer dado = 0;
	        String x = "";
	        JOptionPane.showConfirmDialog(null, "Jogar Dado Virtual", "Bem vindo!", 2);

	        //imprime sequência de 0 até 6 
	        for (int i = 0; i < 6; i++) {
	            System.out.println(dado = gerador.nextInt(6) + 1);

	        }
	        
	        x = dado.toString();
	       
	        JOptionPane.showConfirmDialog(null, "Resultado: " + x, "Dado Virtual", 2);
	        
	        int j = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Continua", JOptionPane.OK_CANCEL_OPTION);
	        
	        if(j == JOptionPane.YES_OPTION) {
	        	
	        }
	        else if(j == JOptionPane.NO_OPTION) {
	           
	        }
	        else if(j == JOptionPane.CANCEL_OPTION) {
	            
	        }
		}while(true);
		
		
        
        
        
       
 
	}

}
