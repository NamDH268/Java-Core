public class CongNhan extends CanBo {
    private int bac;

    public CongNhan(String hoten, int tuoi, GioiTinh gt, String diachi, int bac) {
        super(hoten, tuoi, gt, diachi);
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "bac=" + bac +
                ", hoten='" + hoten + '\'' +
                ", tuoi=" + tuoi +
                ", gt=" + gt +
                ", diachi='" + diachi + '\'' +
                '}';
    }
}