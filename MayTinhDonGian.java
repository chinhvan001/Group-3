
import java.util.Scanner;

public class MayTinhDonGian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Máy tính đơn giản");
        System.out.print("Nhập số thứ nhất: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập số thứ hai: ");
        double b = scanner.nextDouble();

        System.out.print("Chọn phép toán (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Lỗi: Không thể chia cho 0.");
                    return;
                }
                result = a / b;
                break;
            default:
                System.out.println("Phép toán không hợp lệ.");
                return;
        }

        System.out.println("Kết quả: " + result);
    }
}