import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner x = new Scanner(System.in);
    
    System.out.println("Digite a quantidade de termos");
    
    int qtd = x.nextInt();
    int n1 = 1;
    int n2 = 1;
    
    System.out.print("1 ");
    System.out.print("1 ");
   
    qtd = qtd - 2;
   
    while (qtd > 0) {
        System.out.print((n1+n2) + " ");
        
      int n3 = n1+n2;
        n1 = n2;
        n2 = n3;
        qtd--;
    }
    
    System.out.println("Fim");
  }
}