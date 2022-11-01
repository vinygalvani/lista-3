import java.util.Scanner;

class Main {
  public static void main(String[] args) {
          Scanner ent = new Scanner(System.in);
        int x, fatorial = 1;
        int cont = 1;

        do{
            System.out.println("Digite um número:");
            x = ent.nextInt();
            
            for(int i = 1;i <= x; i++){
                fatorial = fatorial * i;
            }
            
            System.out.println( x + "!" + " = " + fatorial);
            cont++;
            
       }
      while(cont < 2);
    }
}