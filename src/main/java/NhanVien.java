public class NhanVien extends CanBo{
    private String congviec;

    public NhanVien(String hoten, int tuoi, GioiTinh gt, String diachi, String congviec) {
        super(hoten, tuoi, gt, diachi);
        this.congviec = congviec;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "congviec='" + congviec + '\'' +
                ", hoten='" + hoten + '\'' +
                ", tuoi=" + tuoi +
                ", gt=" + gt +
                ", diachi='" + diachi + '\'' +
                '}';
    }
}
