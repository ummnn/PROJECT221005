package Quiz5_11;

import java.util.Scanner;

abstract class Calc {
    protected int a;
    protected int b;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    abstract int calculate();
}

class Add extends Calc{
    public int calculate() {
        return a+b;
    }
}

class Sub extends Calc{
    public int calculate() {
        return a-b;
    }
}

class Mul extends Calc{
    public int calculate() {
        return a*b;
    }
}

class Div extends Calc{
    public int calculate() {
        return a/b;
    }
}

public class Quiz5_11 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하시오 >> ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        char op = sc.next().charAt(0);

        switch(op) {
            case '+':
                Add ad = new Add();
                ad.setValue(a, b);
                System.out.println(ad.calculate());
                break;
            case '-':
                Sub sb = new Sub();
                sb.setValue(a, b);
                System.out.println(sb.calculate());
                break;
            case '*':
                Mul ml = new Mul();
                ml.setValue(a, b);
                System.out.println(ml.calculate());
                break;
            case '/':
                Div dv = new Div();
                dv.setValue(a, b);
                System.out.println(dv.calculate());
                break;
        }
    }
}