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
public class longestAlliencsub {
   public static int lis(int a[],int n){
        int b[]=new int[n];
        b[0]=1;
        for(int i=1;i<n;i++){
            b[i]=1;
            for(int j=i-1;j>=0;j--){
                if(a[j]>a[i]){
                    continue;
                }
                int possibleaAns=b[j]+1;
                if(possibleaAns>b[i]){
                    b[i]=possibleaAns;
                }
            }
        }
        int best=0;
        for(int i=0;i<n;i++){
            if(best<b[i]){
                best=b[i];
            }
        }
        return best;
    }
    public static void main(String[] ar){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
             a[i]=in.nextInt();
        }
        int ans=lis(a,n);
        System.out.println(ans);
    }
    
}
