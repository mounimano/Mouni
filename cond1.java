import java.util.Scanner;
public class cond1
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for( i=1; i<=4; i++){
        for( j=1; j<=1; j++)
        System.out.println("+");
        for(i=4; i>=1;i++)
        for(j=1; j>=i;j++)
        System.out.println("");
        }
    }
}
