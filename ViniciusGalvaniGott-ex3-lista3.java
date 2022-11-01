import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null,"Diferença das estruturas de repetições.");
    JOptionPane.showMessageDialog(null,"Estrutura WHILE: ");
    int entradaWhile = 0;   
    int entradaDoWhile = 0;
    
    while (entradaWhile != 123) {
      entradaWhile = Integer.parseInt(JOptionPane.showInputDialog(null,"Enquanto não for digitado a senha [123]\nessa pegunta continuará."));
    }
    JOptionPane.showMessageDialog(null,"1. A estrutura de repetição WHILE tem o teste lógico no INÍCIO\n2. Requer apenas um limite para saber quando ela deve parar.");
     JOptionPane.showMessageDialog(null,"Estrutura FOR: ");
    
    int entrada1For = Integer.parseInt(JOptionPane.showInputDialog(null,"Contador\nValor inicial:"));
    int entrada2For = Integer.parseInt(JOptionPane.showInputDialog(null,"Contador\nValor final:"));
    
    if (entrada1For < entrada2For) {
      for(int i = entrada1For; i <= entrada2For ; ++i){
        if (i != entrada2For) {
        System.out.print(i + " - ");
        }
        else {
          System.out.println(i + ".");
        }
      }
    }
    else {
            for(int i = entrada1For; i >= entrada2For ; --i){
        if (i != entrada2For) {
        System.out.print(i + " - ");
        }
        else {
          System.out.println(i + ".");
        }
      }
    }

        JOptionPane.showMessageDialog(null,"1. A estrutura de repetição FOR tem o teste lógico no INÍCIO\n2. Requer o valor inicial e final\n3. E também o incremento ou decremento.");

         JOptionPane.showMessageDialog(null,"Estrutura DO/WHILE: ");
    do {
      entradaDoWhile = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite [1] para sair."));
    } while (entradaDoWhile != 1);
    JOptionPane.showMessageDialog(null,"1. A estrutura de repetição DO/WHILE tem o teste lógico no FINAL\n2. Requer apenas um limite para saber quando ela deve parar.");
    
    
    
    
    
    
  }
}