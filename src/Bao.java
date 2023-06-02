public class Bao extends TaiLieu{
    private String NgayPhatHanh;
    public Bao (String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String ngayPhatHanh) {
        setMaTaiLieu(maTaiLieu);
        setTenNhaXuatBan(tenNhaXuatBan);
        setSoBanPhatHanh(soBanPhatHanh);
        setNgayPhatHanh(ngayPhatHanh);
    }

    public String getNgayPhatHanh() {
        return NgayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        NgayPhatHanh = ngayPhatHanh;
    }
    public void HienThiBao(){
        System.out.println("mã tài liệu: " + getMaTaiLieu());
        System.out.println("tên nhà xuất bản: " + getTenNhaXuatBan());
        System.out.println("số bản phát hành: " + getSoBanPhatHanh());
        System.out.println("ngày phát hành: " + getNgayPhatHanh());
    }
}
