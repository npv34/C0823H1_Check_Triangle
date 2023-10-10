import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("-----Phan loai tam giac ------");
            System.out.println("Nhap canh a: ");
            int a = scanner.nextInt();
            System.out.println("Nhap canh b: ");
            int b = scanner.nextInt();
            System.out.println("Nhap canh c: ");
            int c = scanner.nextInt();
            if (isaTriangle(a, b, c)) {
                if (isaEquilateralTriangle(a, b, c)) {
                    System.out.println("La tam giac deu");
                } else if (isaIsoscelesTriangle(a, b, c)) {
                    System.out.println("La tam giac can");
                } else if (isaRightTriangle(a, b, c)) {
                    System.out.println("La tam giac vuong");
                }else {
                    System.out.println("La tam giac thuong");
                }

                int perimeter = getPerimeter(a, b, c);
                double area = getArea(a, b, c);
                System.out.println("Chu vi: " + perimeter);
                System.out.println("Dien tich: " + area);
                break;
            } else {
                System.out.println("Khong phai la tam giac");
            }
        }while (true);


    }

    private static double getArea(int a, int b, int c) {
        double p = (double)getPerimeter(a, b, c) / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    private static int getPerimeter(int a, int b, int c) {
        return a + b + c;
    }

    private static boolean isaRightTriangle(int a, int b, int c) {
        return a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b;
    }

    private static boolean isaIsoscelesTriangle(int a, int b, int c) {
        return a == b || b == c || a == c;
    }

    private static boolean isaEquilateralTriangle(int a, int b, int c) {
        return a == b && b == c;
    }

    private static boolean isaTriangle(int a, int b, int c) {
        return a + b > c && b + c > a && c + a > b;
    }
}
