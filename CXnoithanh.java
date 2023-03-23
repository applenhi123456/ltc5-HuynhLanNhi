package bt1;
class CXnoithanh extends ChuyenXe {
        private String SoTuyen;
        private String Sokmdiduoc;
    public CXnoithanh(String SoTuyen, String Sokmdiduoc, String MSchuyen, String HoTentx, String SoXe, double Doanhthu) {
        super(MSchuyen, HoTentx, SoXe, Doanhthu);
        this.SoTuyen = SoTuyen;
        this.Sokmdiduoc = Sokmdiduoc;
    }

    public String getSoTuyen() {
        return SoTuyen;
    }

    public void setSoTuyen(String SoTuyen) {
        this.SoTuyen = SoTuyen;
    }

    public String getSokmdiduoc() {
        return Sokmdiduoc;
    }

    public void setSokmdiduoc(String Sokmdiduoc) {
        this.Sokmdiduoc = Sokmdiduoc;
    }
    @Override
    public String toString() {
        return "CXnoithanh{" + "SoTuyen=" + SoTuyen + ", Sokmdiduoc=" + Sokmdiduoc + '}';
    }

    private static class STring {

        public STring() {
        }
    }
        
    }
    
    