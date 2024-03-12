import java.util.Scanner;
public class LAB01_EX02  {
    public static void main(String[] args){
        Scanner teclado= new Scanner(System.in);
        int n1, n2, n3;
        
        System.out.println("Informe o 1 numero: ");
        n1 =teclado.nextInt();
        System.out.println("Informe o 2 numero: ");
        n2 = teclado.nextInt();
        System.out.println("Informe o 3 numero: ");
        n3 = teclado.nextInt();
        
        if(n1<n2 && n1<n3){
            if(n2<n3){
                System.out.println(n1 + " " + n2 + " " + n3);
                
            }else{
                System.out.println(n1 + " " + n3 + " " + n2);
    }
        }else{
            if(n2 < n1 && n2< n3){
                if(n1<n3){
                    System.out.println(n2 + " " + n1 + " " + n3);
                }else{
                    System.out.println(n2 + " " + n3 + " " + n1);
                }
              }else{
                if(n1<n2){
                    System.out.println(n3 + " " + n1 + " " + n2);
                }else{
                    System.out.println(n3 + " " + n2 + " " + n1);
                }
            }
          }
    }
}
