/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassiments;

/**
 *
 * @author abc
 */
public class addition2darray {int ans=0;
    
    public static void main(String[] args){
        
      
        int a[][] = {{1,2,3},{4,5,6}};
		int b[][] = {{7,8,9},{10,11,12}};

		// Instantiation of third array to store results
		int c[][] = new int[2][3];

		for(int i=0; i<2; ++i){
			for(int j=0; j<3; ++j){
				// add two array and result store in third array
				c[i][j] = a[i][j] * b[i][j];
				System.out.println("Enter sum of "+i + " " + j +"index" +" " + c[i][j]);
			}
    }
}
}    
