public class TapChi extends TaiLieu{
    private int SoPhatHanh;
    private String ThangPhatHanh;
    public TapChi (String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int soPhatHanh, String thangPhatHanh) {
        setMaTaiLieu(maTaiLieu);
        setTenNhaXuatBan(tenNhaXuatBan);
        setSoBanPhatHanh(soBanPhatHanh);
        setSoPhatHanh(soPhatHanh);
        setThangPhatHanh(thangPhatHanh);
    }

    public int getSoPhatHanh() {
        return SoPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        SoPhatHanh = soPhatHanh;
    }

    public String getThangPhatHanh() {
        return ThangPhatHanh;
    }

    public void setThangPhatHanh(String thangPhatHanh) {
        ThangPhatHanh = thangPhatHanh;
    }
    public void HienThiTapChi(){
        System.out.println("mã tài liệu: " + getMaTaiLieu());
        System.out.println("tên nhà xuất bản: " + getTenNhaXuatBan());
        System.out.println("số bản phát hành: " + getSoBanPhatHanh());
        System.out.println("số phát hành: " + getSoPhatHanh());
        System.out.println("Tháng phát hành: " + getThangPhatHanh());
    }
}
