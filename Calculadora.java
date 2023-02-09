import javax.swing.JOptionPane;

  public class Calculadora
  {
    public static void main( String [] args)
    {
        String firstNumber = JOptionPane.showInputDialog( "Digite um número");
        String secondNumber = JOptionPane.showInputDialog( "Digite um segundo número");
        String opc = 
            JOptionPane.showInputDialog( "Escolha um número de 1 a 3");   
               
        int number1 = Integer.parseInt( firstNumber );
        int number2 = Integer.parseInt( secondNumber );
        int opcao = Integer.parseInt( opc);  
        
        if(opcao==1){
        int sum= number1 / number2;
        JOptionPane.showMessageDialog( null, "A divisão dos números é:" + sum, "Resultado final é:", JOptionPane.PLAIN_MESSAGE );
        } 
        
        if(opcao==2){
        int sum = number1 * number2;  
        JOptionPane.showMessageDialog( null, "a multiplicação é:" + sum, "Resultado final é:", JOptionPane.PLAIN_MESSAGE );
        }
        if(opcao == 3){
            int sum = number1 + number2; 
            JOptionPane.showMessageDialog( null, "a soma é" + sum, "Resultado final é:", JOptionPane.PLAIN_MESSAGE );
        }
         
    }
  }

