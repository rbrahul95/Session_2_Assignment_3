/*
         a code using loops to print given pattern. 
             
 */
public class Session_2_Assignment_3 {
    
          //Problem 3
    public static void main(String[] args) {
      int n=5,row,column;
      
      //loops to increase 1 to 5
      //first loop 
          for(row=1; row<=n; row++)
      {
          //second loop 
         for(column=1; column<=row; column++)
            System.out.print(column);
             System.out.print("\n");
      }
          
          //loops to decrease 5 to 1
          
     for(row=n; row>1; row--,n--)
      {
         for(column=1; column<n; column++)
           System.out.print(column);
           System.out.print("\n");
   }
    
    
    
    
    }
}
/*
Expected Output would be
1
12
123
1234
12345
1234
123
12
1
*/