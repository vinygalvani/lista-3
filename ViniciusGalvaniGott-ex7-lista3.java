import java.lang.Math;
import javax.swing.JOptionPane;;

public class Main
{ 
   public static void main(String[] args) 
   {
      float peso, altura;
      float imc;
      String classifica;
 
      peso = Float.parseFloat(JOptionPane.showInputDialog("Peso da Pessoa (kg):"));
      altura = Float.parseFloat(JOptionPane.showInputDialog("Altura da Pessoa (m):") );
 
      imc = (float) (peso/Math.pow(altura, 2));
 
      if (imc <= 19)
         classifica = "Abaixo do Peso";
      else
         if (imc <= 25)
            classifica = "Peso ideal";
         else
            if (imc <= 30)
               classifica = "Acima do Peso";
            else
               if (imc <= 35)
                  classifica = "Obesidade I";
                 else
               if (imc > 35 && imc < 40)
                  classifica = "Obesidade II";
               else
                  classifica = "Obesidade III";
 
 
      JOptionPane.showMessageDialog(null, "IMC da Pessoa = "+imc+" - "+classifica);
   }
}
