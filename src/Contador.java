import java.util.Locale;
import java.util.Scanner;

public class Contador{
    public static void main(String[] args) {
        try{

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o primeiro parametro: ");
        int um = sc.nextInt();
        System.out.println("Digite o parametro dois: ");
        int dois = sc.nextInt();
        contar(um,dois);

        } catch (ParametrosInvalidosException e){
            System.out.println("O segundo par\u00E2metro deve ser maior que o primeiro");
        }


    }
    static void contar(int um, int dois) throws ParametrosInvalidosException{
        if (um > dois) {
          throw new ParametrosInvalidosException();
        
        } else { 
            int contagem = dois - um;
            for (int i = 1;i<=contagem;i++){
                System.out.println("Imprimindo o numero "+i);
            }
    }
    }
}