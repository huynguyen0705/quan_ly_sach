public class Sach extends TaiLieu{
    private String TenTacGia;
    private int SoTrang;

    public Sach (String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
        setMaTaiLieu(maTaiLieu);
        setTenNhaXuatBan(tenNhaXuatBan);
        setSoBanPhatHanh(soBanPhatHanh);
        setTenTacGia(tenTacGia);
        setSoTrang(soTrang);
    }

    public String getTenTacGia() {
        return TenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        TenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return SoTrang;
    }

    public void setSoTrang(int soTrang) {
        SoTrang = soTrang;
    }
    public void HienThiSach(){
        System.out.println("mã tài liệu: " + getMaTaiLieu());
        System.out.println("tên nhà xuất bản: " + getTenNhaXuatBan());
        System.out.println("số bản phát hành: " + getSoBanPhatHanh());
        System.out.println("tên tác giả: " + getTenTacGia());
        System.out.println("số trang: " + getSoTrang());
    }
}
