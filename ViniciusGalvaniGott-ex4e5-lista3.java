import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    int linhas = Integer.parseInt(JOptionPane.showInputDialog("Quantas linhas terÃ¡ o desenho? (1 a 20)"));

    int cont = 1;

    if ((linhas > 0) && (linhas < 21)) {
    while (linhas >= cont) {
      if (cont == 1) {
        System.out.println("*");
      }
      else if (cont == 2) {
        System.out.println("**");
      }
      else if (cont == 3) {
        System.out.println("***");
      }
      else if (cont == 4) {
        System.out.println("****");
      }      
      else if (cont == 5) {
        System.out.println("*****");
      }
      else if (cont == 6) {
        System.out.println("******");
      }
      else if (cont == 7) {
        System.out.println("*******");
      }
      else if (cont == 8) {
        System.out.println("********");
      }      
      else if (cont == 9) {
        System.out.println("*********");
      }     
      else if (cont == 10) {
        System.out.println("**********");
      }
      else if (cont == 11) {
        System.out.println("***********");
      }
      else if (cont == 12) {
        System.out.println("************");
      }
      else if (cont == 13) {
        System.out.println("*************");
      }
      else if (cont == 14) {
        System.out.println("**************");
      }
      else if (cont == 15) {
        System.out.println("***************");
      }
      else if (cont == 16) {
        System.out.println("****************");
      }
      else if (cont == 17) {
        System.out.println("*****************");
      }
      else if (cont == 18) {
        System.out.println("******************");
      }
      else if (cont == 19) {
        System.out.println("*******************");
      }
      else if (cont == 20) {
        System.out.println("********************");
      }
      cont += 1;
    }
    }
    else {
      JOptionPane.showMessageDialog(null,"Erro!\nDigite um nÃºmero entre 1 e 20");
    }

    
  }
}