import java.util.ArrayList;

public class QuanLyTaiLieu {
    ArrayList<Sach> DsSach;
    ArrayList<TapChi> DsTapChi;
    ArrayList<Bao> DsBao;
    public QuanLyTaiLieu(){
        DsSach = new ArrayList<>();
        DsTapChi = new ArrayList<>();
        DsBao = new ArrayList<>();
    }
    public void NhapThongTinSach(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang){
        Sach sach = new Sach(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, tenTacGia, soTrang);
        DsSach.add(sach);
        System.out.println("Nhập thành công");
    }
    public void NhapThongTinTapChi(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int soPhatHanh, String thangPhatHanh){
        TapChi tapChi = new TapChi(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, soPhatHanh, thangPhatHanh);
        DsTapChi.add(tapChi);
        System.out.println("Nhập thành công");
    }
    public void NhapThongTinBao(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String ngayPhatHanh){
        Bao bao= new Bao(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, ngayPhatHanh);
        DsBao.add(bao);
        System.out.println("Nhập thành công");
    }
    public void HienThiThongTinVeCacTaiLieu(){
        System.out.println("thông tin sách");
        for (int i = 0; i < DsSach.size(); i++){
            DsSach.get(i).HienThiSach();
            System.out.println("\n");
        }
        System.out.println("thông tin tạp chí");
        for (int i = 0; i < DsTapChi.size(); i++){
            DsTapChi.get(i).HienThiTapChi();
            System.out.println("\n");
        }
        System.out.println("thông tin báo");
        for (int i = 0; i < DsBao.size(); i++){
            DsBao.get(i).HienThiBao();
            System.out.println("\n");
        }
    }
    public void TimKiemTaiLieuTheoLoai(int loai){
        switch (loai){
            case 1:
                System.out.println("danh sách sách");
                for (int i = 0; i < DsSach.size(); i++){
                    DsSach.get(i).HienThiSach();
                    System.out.println("\n");
                }
                break;
            case 2:
                System.out.println("danh sách tạp chí");
                for (int i = 0; i < DsTapChi.size(); i++){
                    DsTapChi.get(i).HienThiTapChi();
                    System.out.println("\n");
                }
                break;
            case 3:
                System.out.println("danh sách báo");
                for (int i = 0; i < DsBao.size(); i++){
                    DsBao.get(i).HienThiBao();
                    System.out.println("\n");
                }
                break;
        }
    }
}
