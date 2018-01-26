package daily.dayfour;

import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int lines = scan.nextInt();
        String s;
        String even = "";
        String odd = "";
        for(int i = 0 ; i<lines; i++){
            s= scan.next();
            int j = 0;
            while(j<s.length()){
                if(j%2==0){
                    even = even + s.charAt(j);
                }else{
                    odd = odd + s.charAt(j);
                }
                j++;
            }
            System.out.println(even + " " + odd);
            s = "";
            j = 0;
            even= "";
            odd = "";
        }
        scan.close();

    }
}
