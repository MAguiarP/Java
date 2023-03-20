import javax.swing.JOptionPane;

    class Multiplicar{  
        
        static double valor1=0 , valor2=0, multiplicar=0;
                
        public static void main(String[] args) {
            
           valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
           valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
           
           multiplicar();
           
           JOptionPane.showMessageDialog(null, "A multiplicação dos Valores é: " + multiplicar);
        }
        
        public static void multiplicar(){
            multiplicar = valor1 * valor2;
        }
    }