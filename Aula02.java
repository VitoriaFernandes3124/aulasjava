import java.util.Scanner; // convoca uma pasta do sistema operacional
public class Aula02{
    public static void main(String[] args){
    Scanner leitorTxt = new Scanner(System.in);
    System.out.println("Digite seu nome:\n");
    String nome = leitorTxt.nextLine();
    System.out.println("Seu nome é " + nome);
    leitorTxt.close();
        
    }
}