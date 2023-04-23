
package exercicios_java_lab_1;
import java.util.Scanner;
/**
 *
 * @author WINDOWS
 */
public class exercicio_1 {
  
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);  
    int num1;
    int num2;
    int num3;
    int armz;
    
    System.out.print("Digite o pirmeiro número: ");
    num1 = entrada.nextInt();
    System.out.print("Digite o segundo número: ");
    num2 = entrada.nextInt();
    System.out.print("Digite o terceiro número: ");
    num3 = entrada.nextInt();
     
    
    if(num1 > num2){
      armz = num1;
      num1 = num2;
      num2 = armz;
    }
 
    
    if(num2 > num3){
      armz = num2;
      num2 = num3;
      num3 = armz;
    }
 
    // depois da segunda troca o número 1 é novamente maior que o número 2?
    if(num1 > num2){
      armz = num1;
      num1 = num2;
      num2 = armz;
    }

    System.out.println("Os numeros em ordem crescente sao: ");
    System.out.println(num1 + "  " + num2 + "  " + num3);

  }
}

