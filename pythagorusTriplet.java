import java.util.Scanner;

public class pythagorusTriplet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a;
        if(b>=max)
            max = b;
        if(c>=max)
            max = c;
        if(max == a){
            boolean m = (( b * b + c * c ) == ( a * a ));
            System.out.println(m);
        }else if(max  == b){
            boolean n =  (( a * a + c * c ) == ( b * b ));
            System.out.println(n);
        }else{
            boolean o = ((a*a + b*b) == (c*c));
            System.out.println(o);
        }
    }
}
