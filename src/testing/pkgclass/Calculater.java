/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing.pkgclass;

/**
 *
 * @author sp16-bse-071
 */
public class Calculater {
    int c=0;
      public int Add(int a, int b){
       int c= a+b;
          System.out.println("Addition Answer=" +c);
          return c;
    }
   public int Sub(int a, int b){
       int c= a-b;
          System.out.println("Subtraction Answer= "+c);
          return c;
    }
   public int Div(int a, int b){
       int c= a/b;
          System.out.println("Division Answer= "+c);
          return c;
    }
   public int Mul(int a, int b){
       int c= a*b;
          System.out.println("Multiplaction Answer= "+c);
          return c;
    }
    public int Ratio(int a, int b){
       int c= a%b;
          System.out.println("Multiplaction Answer= "+c);
          return c;
    }
}
