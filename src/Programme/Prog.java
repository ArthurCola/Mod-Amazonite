package Programme;

import java.util.Random;
import java.util.Scanner;

import IHM.Fenetre;
  
public class Prog {
    public static void main(String[]arg)
    {
      
    
	Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    int Nt;
    
    do
    {
        System.out.println("Faites les calculs suivant :");
        int Nc1 = rand.nextInt(10)+ 1;
        int Nc2 = rand.nextInt(1000)+ 1;
        System.out.println(Nc1);
        System.out.println("+");
        System.out.println(Nc2);
        Nt = scan.nextInt();
          
                if(Nc1 + Nc2 != Nt)
                {
                    System.out.println("Faux !");
                }
                else
                    System.out.println("Vrai !");
                      
             
    }while(Nt != -1);
      
  
    }
}
