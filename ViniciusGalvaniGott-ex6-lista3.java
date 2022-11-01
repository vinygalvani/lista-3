import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner ler= new Scanner (System.in);

int somaIdade = 0,qntIdadeMasculino = 0,qntIdadeFeminino = 0, idade,somaMasc = 0, somaFem = 0;
String sexo;
for (int i = 1; i <= 4; i++){
System.out.println("digite a idade da "+i+"ª pessoa: ");
idade = ler.nextInt();
somaIdade += idade;

System.out.println("digite M para Masculino ou F para feminino: ");
sexo = ler.next();

if (sexo.equals("M")){
somaMasc ++;
qntIdadeMasculino += idade;

} else
if (sexo.equals("F")){
somaFem ++;
qntIdadeFeminino += idade;
}
}

System.out.println("A média de idade dos Homens é; " +qntIdadeMasculino / somaMasc );
System.out.println("A média de idade das Mulheres é; " +qntIdadeFeminino / somaFem );
}
}