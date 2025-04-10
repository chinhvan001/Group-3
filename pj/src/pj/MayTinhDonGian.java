package pj;


import java.util.Scanner;

public class MayTinhDonGian {

    public static void main(String[] args) {
        // Tạo một đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Khai báo các biến cần dùng
        double soThuNhat, soThuHai, ketQua; // Dùng cho các phép toán
        char phepToan; // Lưu ký hiệu của phép toán được chọn

        // Hiển thị menu lựa chọn các phép toán
        System.out.println("=== Máy tính đơn giản ===");
        System.out.println("Hỗ trợ các phép toán sau:");
        System.out.println(" + : Cộng hai số");
        System.out.println(" - : Trừ hai số");
        System.out.println(" * : Nhân hai số");
        System.out.println(" / : Chia hai số");
        System.out.println(" r : Căn bậc hai của một số");

        // Yêu cầu người dùng chọn phép toán
        System.out.print("Nhập phép toán bạn muốn thực hiện: ");
        phepToan = scanner.next().charAt(0); // Đọc ký tự đầu tiên từ bàn phím

        // Xử lý theo phép toán được chọn
        switch (phepToan) {
            // Các phép toán hai số: cộng, trừ, nhân, chia
            case '+':
            case '-':
            case '*':
            case '/':
                // Nhập hai số thực từ người dùng
                System.out.print("Nhập số thứ nhất: ");
                soThuNhat = scanner.nextDouble();

                System.out.print("Nhập số thứ hai: ");
                soThuHai = scanner.nextDouble();

                // Thực hiện phép toán tương ứng
                switch (phepToan) {
                    case '+':
                        ketQua = soThuNhat + soThuHai;
                        System.out.println("Kết quả: " + soThuNhat + " + " + soThuHai + " = " + ketQua);
                        break;
                    case '-':
                        ketQua = soThuNhat - soThuHai;
                        System.out.println("Kết quả: " + soThuNhat + " - " + soThuHai + " = " + ketQua);
                        break;
                    case '*':
                        ketQua = soThuNhat * soThuHai;
                        System.out.println("Kết quả: " + soThuNhat + " * " + soThuHai + " = " + ketQua);
                        break;
                    case '/':
                        if (soThuHai != 0) {
                            ketQua = soThuNhat / soThuHai;
                            System.out.println("Kết quả: " + soThuNhat + " / " + soThuHai + " = " + ketQua);
                        } else {
                            System.out.println("Lỗi: Không thể chia cho 0!");
                        }
                        break;
                }
                break;

            // Phép căn bậc hai chỉ yêu cầu một số
            case 'r':
                System.out.print("Nhập số cần tính căn bậc hai: ");
                soThuNhat = scanner.nextDouble();

                if (soThuNhat >= 0) {
                    ketQua = Math.sqrt(soThuNhat); // Hàm sqrt trong Java trả về căn bậc hai
                    System.out.println("Kết quả: √" + soThuNhat + " = " + ketQua);
                } else {
                    System.out.println("Lỗi: Không thể tính căn bậc hai của số âm!");
                }
                break;

            // Trường hợp người dùng nhập sai phép toán
            default:
                System.out.println("Lỗi: Phép toán không hợp lệ. Vui lòng chọn +, -, *, / hoặc r.");
        }

        // Đóng đối tượng Scanner sau khi sử dụng
        scanner.close();
    }
}
