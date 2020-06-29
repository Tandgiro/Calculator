import java.util.Scanner;

class scan {
    double a,b,c,k;


    double d = 1,f = 2, g = 3, j = 4;




    double scan() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first value: ");
        return a = in.nextInt();
    }

    double two_scan(){
        Scanner in_two = new Scanner(System.in);
        System.out.println("Input second value: ");
        return b = in_two.nextInt();
    }

    double three_scan(){
        Scanner in_three = new Scanner(System.in);
        System.out.println("(+)1 , (-)2 , (*)3 , (/)4; : ");
        return c = in_three.nextInt();
    }
    double plus(){
        return k =  a + b;
    }

    double minus(){
        return k = a - b;
    }

    double multi(){
        return k = a * b;
    }

    double division(){
        return k =  a / b;
    }

    scan(double one, double two){
        one = a;
        two = b;
    }

}

public class funcia {
    public static void main(String [] args){
        double d = 1,f = 2, g = 3, j = 4;
        double a,b,c;

        Scanner in = new Scanner(System.in);
        System.out.println("Input first value: ");
        a = in.nextInt();

        Scanner in_two = new Scanner(System.in);
        System.out.println("Input second value: ");
        b = in_two.nextInt();

        Scanner in_three = new Scanner(System.in);
        System.out.println("(+)1 , (-)2 , (*)3 , (/)4; : ");
        c = in_three.nextInt();

        scan value = new scan(a, b);

        double z,x,v,m;

        z = value.plus();
        x = value.minus();
        v = value.multi();
        m = value.division();

        if (c == d)
            System.out.println("Equally: " + z);
        else if (c == f)
            System.out.println("Equally: " + x);
        else if (c == g)
            System.out.println("Equally: " + v);
        else if (c == j)
            System.out.println("Equally: " + m);
        else
            System.out.println("Not Found");

    }
}
