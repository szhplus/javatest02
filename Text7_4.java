/*import java.util.Scanner;

public class Text7_4 {

    //欧几里德 辗转相除法
    public static int gcd(int a,int b) {
        int r ;
        while(b != 0) {
            r = a % b ;
            a = b;
            b = r;
        }
        return a;

    }
    //最小公倍数的另一种解法
    public static int gcdtwo(int a,int b){
        while (a != b) {
            if (a > b ) {
                a = a -b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
    //最大公约数
    public static int lcm(int a,int b) {
        return a * b /gcd(a,b);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        int b = input.nextInt();
        /*if (a < b) {
            a = a+b;
            b = a - b;
            a = a - b;
        }*/

  /*      System.out.println("最大公约数"+gcdtwo(a,b));
        System.out.println("最小公倍数"+lcm(a,b));

    }
}*/

import java.util.Scanner;
public class Text7_4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        if(n>m){
            int z;
            z=n;
            n=m;
            m=z;

        }
        for(int i=n;i>=2;i--){
            if(m%i==0&&n%i==0){
                System.out.println("最大公约数"+i);
            }

        }
        for(int j=m;j>=m;j++){
            if(j%m==0&&j%n==0){
                System.out.println("最小公倍数："+j);
                break;
            }
        }



    }
}
