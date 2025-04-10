package pj;
import java.util.Scanner;

public class MayTinhDonGian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean tiepTuc = true;

        System.out.println("=== Máy Tính Đơn Giản ===");

        while (tiepTuc) {
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
                        System.out.println("❌ Lỗi: Không thể chia cho 0.");
                        continue; // Bỏ qua vòng hiện tại và tiếp tục
                    }
                    result = a / b;
                    break;
                default:
                    System.out.println("❌ Phép toán không hợp lệ.");
                    continue;
            }

            System.out.println("✅ Kết quả: " + result);

            // Hỏi người dùng có muốn tiếp tục không
            System.out.print("Bạn có muốn tiếp tục? (c/k): ");
            char choice = scanner.next().toLowerCase().charAt(0);
            if (choice != 'c') {
                tiepTuc = false;
            }
        }

        System.out.println("🔚 Kết thúc chương trình. Cảm ơn bạn!");
        scanner.close();
    }
}
