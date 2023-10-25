import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("어떤 계산을 하시겠습니까?(1. 더하기 2. 빼기 3. 곱하기 4. 나누기 5. 나머지, 종료버튼:q)");
            System.out.print(">> ");
            
            String op = sc.nextLine();
            System.out.print("피연산자 a를 입력하세요>> ");
            int a = Integer.parseInt(sc.nextLine());
            System.out.print("피연산자 b를 입력하세요>> ");
            int b = Integer.parseInt(sc.nextLine());

            switch (op){
                case "1":
                    plus(a, b);
                    break;
                case "2":
                    minus(a, b);
                    break;
                case "3":
                    multiply(a, b);
                    break;
                case "4":
                    divide(a, b);
                    break;
                case "5":
                    modulo(a, b);
                    break;
                case "q":
                    return;
            }
        }
    }

    private static void plus(int a, int b) {
        System.out.println(a + " + " + b + " = "+ (a+b));
    }

    private static void minus(int a, int b) {
        // System.out.println(a + " - " + b + " = " + (a-b));
    }

    private static void multiply(int a, int b) {
        //System.out.println(a + " * " + b + " = " + (a*b));
    }

    private static void divide(int a, int b) {
        /* if(b == 0)
            System.out.println("0으로는 나눌수 없습니다.");
        else System.out.println(a + " / " + b + " = " + (a/b)); */
    }

    private static void modulo(int a, int b) {
        /*if(b == 0)
            System.out.println("0으로는 나눌수 없습니다.");
        else System.out.println(a + " % " + b + " = " + (a%b));*/
    }
}
