/**
 * 
 */
package hyu;

/**
 * 
 */
import java.util.Scanner;

public class MayTinhDonGian {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soThuNhat, soThuHai, ketQua;
        char phepToan;

        System.out.println("=== Máy tính: +, -, *, /, √ ===");
        System.out.println("Chọn phép toán:");
        System.out.println(" + : Cộng");
        System.out.println(" - : Trừ");
        System.out.println(" * : Nhân");
        System.out.println(" / : Chia");
        System.out.println(" r : Căn bậc hai");

        System.out.print("Nhập phép toán: ");
        phepToan = scanner.next().charAt(0);

        switch (phepToan) {
            case '+':
            case '-':
            case '*':
            case '/':
                System.out.print("Nhập số thứ nhất: ");
                soThuNhat = scanner.nextDouble();

                System.out.print("Nhập số thứ hai: ");
                soThuHai = scanner.nextDouble();

                switch (phepToan) {
                    case '+':
                        ketQua = soThuNhat + soThuHai;
                        System.out.println("Kết quả: " + ketQua);
                        break;
                    case '-':
                        ketQua = soThuNhat - soThuHai;
                        System.out.println("Kết quả: " + ketQua);
                        break;
                    case '*':
                        ketQua = soThuNhat * soThuHai;
                        System.out.println("Kết quả: " + ketQua);
                        break;
                    case '/':
                        if (soThuHai != 0) {
                            ketQua = soThuNhat / soThuHai;
                            System.out.println("Kết quả: " + ketQua);
                        } else {
                            System.out.println("Lỗi: Không thể chia cho 0!");
                        }
                        break;
                }
                break;

            case 'r':
                System.out.print("Nhập số cần tính căn bậc hai: ");
                soThuNhat = scanner.nextDouble();
                if (soThuNhat >= 0) {
                    ketQua = Math.sqrt(soThuNhat);
                    System.out.println("Kết quả: √" + soThuNhat + " = " + ketQua);
                } else {
                    System.out.println("Lỗi: Không thể căn bậc hai số âm!");
                }
                break;

            default:
                System.out.println("Lỗi: Phép toán không hợp lệ!");
        }

        scanner.close();
    }
}