import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in) ;
        int N = scan.nextInt() ;
        int K = scan.nextInt() ;
        int[] L = new int[N];
        int i,j=0,answer=0,T;
        for( i=0 ; i<N ; i++ ){
            scan.nextLine();
            L[j] = scan.nextInt() ;
            T = scan.nextInt() ;
            answer += L[j] ;
            if( T==0 ){
                L[j] = 0 ;
            }
            else{
                j++ ;
            }
        }
        int[] temp = Arrays.copyOf( L , j );
        Arrays.sort( temp ) ;
        for( i=0 ; i<(j-K) ; i++ ){
            answer -= 2*temp[i] ;
        }
        System.out.println( answer );
    }
}
