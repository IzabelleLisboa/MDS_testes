
package testessoftwere;

import java.util.Scanner;


    public class TestesSoftwere {
//1
        public static void main(String[] args) {
            int n;
            Scanner ler= new Scanner(System.in);
            System.out.println ("insira um valor inteiro");
            n = ler.nextInt();
//2
            if(n%2==0)
                System.out.println(n+" é par\n" +n+ "é múltiplo de 2" );
            else
                //3
                System.out.println(n+" é ímpar");
            //4
            if(n%3==0)
                System.out.println(n+" é múltiplo de 3" );
            //5
            if(n%5==0)
                System.out.println(n+" é multiplo de 5" );
            //6
            if(n%7==0 && n% 14==0)
                System.out.println(n+" é múltiplo de 7 e de 14" );
            //7
            if(n%13==0 || n%19==0)
                System.out.println(n+" é múltiplo de 13 ou de 19" );
        }
    }
        
        
            
    

