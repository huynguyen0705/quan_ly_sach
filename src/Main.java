import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);
        QuanLyTaiLieu quanLyTaiLieu = new QuanLyTaiLieu();
        while (isRunning){
            try {
                System.out.println("Quản lý tài liệu");
                System.out.println("1. Nhập thông tin cho tài liệu");
                System.out.println("2. Hiển thi về các tài liệu");
                System.out.println("3. Tìm kiếm tài liệu theo loại");
                System.out.println("4. Thoát");
                System.out.println("Mời nhập: ");
                int input1 = scanner.nextInt();
                if (input1 < 1 || input1 > 4) {
                    System.out.println("Nhập sai");
                }
                switch (input1){
                    case 1:
                        System.out.println("1. nhập thông tin sách");
                        System.out.println("2. nhập thông tin tạp chí");
                        System.out.println("3. nhập thông tin báo");
                        int input2 = scanner.nextInt();
                        if (input2 < 1 || input2 > 3) {
                            System.out.println("Nhập sai");
                        }
                        switch (input2){
                            case 1:
                                System.out.println("nhập thông tin sách");
                                System.out.println("nhập mã tài lieu: ");
                                Scanner scanner1 = new Scanner(System.in);
                                String maTaiLieu = scanner1.next();
                                System.out.println("nhập tên nhà xuất bản: ");
                                Scanner scanner2 = new Scanner(System.in);
                                String tenNhaXuatBan = scanner2.next();
                                System.out.println("nhập so bản phát hành: ");
                                Scanner scanner3 = new Scanner(System.in);
                                int soBanPhatHanh = scanner3.nextInt();
                                System.out.println("nhập tên tác giả: ");
                                Scanner scanner4 = new Scanner(System.in);
                                String tenTacGia = scanner4.next();
                                System.out.println("nhập số trang: ");
                                Scanner scanner5 = new Scanner(System.in);
                                int soTrang = scanner5.nextInt();
                                quanLyTaiLieu.NhapThongTinSach(maTaiLieu,tenNhaXuatBan,soBanPhatHanh,tenTacGia,soTrang);
                                break;
                            case 2:
                                System.out.println("nhập thông tin tạp chí");
                                System.out.println("nhập mã tài lieu: ");
                                Scanner scanner6 = new Scanner(System.in);
                                String maTaiLieuTc = scanner6.next();
                                System.out.println("nhập tên nhà xuất bản: ");
                                Scanner scanner7 = new Scanner(System.in);
                                String tenNhaXuatBanTc = scanner7.next();
                                System.out.println("nhập so bản phát hành: ");
                                Scanner scanner8 = new Scanner(System.in);
                                int soBanPhatHanhTc = scanner8.nextInt();
                                System.out.println("nhập số phát hành: ");
                                Scanner scanner9 = new Scanner(System.in);
                                int soPhatHanh = scanner9.nextInt();
                                System.out.println("nhập tháng phát hành (mm/yy)");
                                Scanner scanner10 = new Scanner(System.in);
                                String thangPhatHanh = scanner10.next();
                                quanLyTaiLieu.NhapThongTinTapChi(maTaiLieuTc,tenNhaXuatBanTc,soBanPhatHanhTc,soPhatHanh,thangPhatHanh);
                                break;
                            case 3:
                                System.out.println("nhập thông tin báo");
                                System.out.println("nhập mã tài lieu: ");
                                Scanner scanner11 = new Scanner(System.in);
                                String maTaiLieuB = scanner11.next();
                                System.out.println("nhập tên nhà xuất bản: ");
                                Scanner scanner12 = new Scanner(System.in);
                                String tenNhaXuatBanB = scanner12.next();
                                System.out.println("nhập so bản phát hành: ");
                                Scanner scanner13 = new Scanner(System.in);
                                int soBanPhatHanhB = scanner13.nextInt();
                                System.out.println("nhập ngày phát hành (dd/mm/yy): ");
                                Scanner scanner14 = new Scanner(System.in);
                                String ngayPhatHanh = scanner14.next();
                                quanLyTaiLieu.NhapThongTinBao(maTaiLieuB,tenNhaXuatBanB,soBanPhatHanhB,ngayPhatHanh);
                                break;
                        }
                        break;
                    case 2:
                        quanLyTaiLieu.HienThiThongTinVeCacTaiLieu();
                        break;
                    case 3:
                        System.out.println("tìm kiếm tài liệu theo loại");
                        System.out.println("1. sách");
                        System.out.println("2. tạp chí");
                        System.out.println("3. báo");
                        Scanner scanner15 = new Scanner(System.in);
                        int loai = scanner15.nextInt();
                        quanLyTaiLieu.TimKiemTaiLieuTheoLoai(loai);
                        break;
                    case 4:
                        isRunning = false;
                        break;
                }

            }catch (InputMismatchException ex){
                System.out.println("nhập sai kiểu dữ liệu");
            }
        }
    }
}