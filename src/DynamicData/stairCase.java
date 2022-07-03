/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicData;
import java.util.Scanner;
/**
 *
 * @author abc
 */
public class stairCase {
   public static int changeee(int n,int coin[],int numd)
    {
        if(n==0){
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        if(numd==0){
            return 0;
        }
        int first=changeee(n-coin[0],coin,numd);
       int second=changeee(n, coin + 1,numd-1);
        return first+second;
    }    
    public static void main(String [] ar){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int coin[]=new int[n];
        int tes=changeee(n,coin,2);
                System.out.println(tes);
    }
    
}
