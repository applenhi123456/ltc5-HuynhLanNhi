package bt1;
class CXngoaithanh extends ChuyenXe {
        private String noiden;
        private int Songaydiduoc;

    public CXngoaithanh(String MSchuyen, String HoTentx, String SoXe, double Doanhthu,String noiden, int Songaydiduoc) {
        super (MSchuyen,HoTentx,SoXe,Doanhthu);
        this.noiden = noiden;
        this.Songaydiduoc = Songaydiduoc;
    }

    public String getNoiden() {
        return noiden;
    }

    public void setNoiden(String noiden) {
        this.noiden = noiden;
    }

    public int getSongaydiduoc() {
        return Songaydiduoc;
    }

    public void setSongaydiduoc(int Songaydiduoc) {
        this.Songaydiduoc = Songaydiduoc;
    }

    @Override
    public String toString() {
        return "CXngoaithanh{" + "noiden=" + noiden + ", Songaydiduoc=" + Songaydiduoc + '}';
    }   
    }