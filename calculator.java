import java.util.Scanner;

class func{
    double a,b;
    double plus() {
        return a + b;
    }

    double minus() {
        return a - b;
    }

    double multi() {
        return a * b;
    }

    double division() {
        return a / b;
    }
}

public class calculator {
    public static void main(String [] args){
        boolean close = true;
        for (;close = true; ) {

            double z = 1, x = 2, v = 3, n = 4;
            Scanner one_tap = new Scanner(System.in);
            int a;
            System.out.println("Enter First value: ");
            a = one_tap.nextInt();

            Scanner two_tap = new Scanner(System.in);
            int b;
            System.out.println("Enter First value: ");
            b = one_tap.nextInt();

            Scanner three_tap = new Scanner(System.in);
            int c;
            System.out.println("1(+), 2(-), 3(*), 4(/) : ");
            c = one_tap.nextInt();

            if (c == z)
                System.out.println("Equally: " + (a + b));
            else if (c == x)
                System.out.println("Equally: " + (a - b));
            else if (c == v)
                System.out.println("Equally: " + (a * b));
            else if (c == n)
                System.out.println("Equally: " + (a / b));
            Scanner cl = new Scanner(System.in);
            int stop;
            System.out.println("Close application 'calculator'? |(1)/Yes | (0)/No| : ");
            stop = cl.nextInt();

            if (stop == 1)
                close = false;


        }

    }
}
