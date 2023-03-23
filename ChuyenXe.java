package bt1;
class ChuyenXe {
    private String MSchuyen;
    private String HoTentx;
    private String SoXe;
    private double Doanhthu;

    public ChuyenXe(String MSchuyen, String HoTentx, String SoXe, double Doanhthu) {
        this.MSchuyen = MSchuyen;
        this.HoTentx = HoTentx;
        this.SoXe = SoXe;
        this.Doanhthu = Doanhthu;
    }

    public String getMSchuyen() {
        return MSchuyen;
    }

    public void setMSchuyen(String MSchuyen) {
        this.MSchuyen = MSchuyen;
    }

    public String getHoTentx() {
        return HoTentx;
    }

    public void setHoTentx(String HoTentx) {
        this.HoTentx = HoTentx;
    }

    public String getSoXe() {
        return SoXe;
    }

    public void setSoXe(String SoXe) {
        this.SoXe = SoXe;
    }

    public double getDoanhthu() {
        return Doanhthu;
    }

    public void setDoanhthu(double Doanhthu) {
        this.Doanhthu = Doanhthu;
    }          

    @Override
    public String toString() {
        return "ChuyenXe{" + "MSchuyen=" + MSchuyen + ", HoTentx=" + HoTentx + ", SoXe=" + SoXe + ", Doanhthu=" + Doanhthu + '}';
    }
}