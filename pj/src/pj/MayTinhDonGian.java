package pj;

import java.util.Scanner;

public class MayTinhDonGian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        double a = sc.nextDouble();

        System.out.print("Nhập phép tính (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Nhập số thứ hai: ");
        double b = sc.nextDouble();

        double kq = 0;
        switch (op) {
            case '+': kq = a + b; break;
            case '-': kq = a - b; break;
            case '*': kq = a * b; break;
            case '/': 
                if (b != 0) kq = a / b;
                else {
                    System.out.println("Lỗi: chia cho 0");
                    return;
                }
                break;
            default:
                System.out.println("Phép tính không hợp lệ");
                return;
        }

        System.out.println("Kết quả: " + kq);
        System.out.println("\nKet thuc chuong trinh");
    }
}
