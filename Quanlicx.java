package baitap1;
import java.util.ArrayList;
import java.util.Scanner;
public class Quanlicx {
ArrayList<ChuyenXe> listChuyenXe;
Scanner SC ;
ChuyenXe cX;
int chon;
public Quanlicx() {
 super();
 listChuyenXe = new ArrayList<ChuyenXe>();
 SC = new Scanner(System.in);
}
public void nhap (int n)
public void nhap (int n)
{
 for (int i = 0; i < n; i++)
 {
 System.out.println("1: chuyen xe noi thanh");
 System.out.println("2: chuyen xe ngoai thanh");
 System.out.println("0: Thoat"); chon = sc.nextInt(); sc.nextLine();
 Switch (chon) {
 case 1:
{
 String maso;
 String tenTaixe;
 double doanhThu;
 int soKM;
 int soTuyen;
 System.out.println("Nhap ma so : "); maso = sc.nextLine(); System.out.println("Ho ten lai xe : "); tenTaixe = sc.nextLine(); System.out.println("So tuyen: "); soTuyen = sc.nextInt(); sc.nextLine(); System.out.println("So Km : "); SOKM = sc.nextInt(); sc.nextLine();
 listChuyenxe.add(cx);
 System.out.println("add thanh cong tuyen noi thanh");
}
break;
case 2:{
 String maso;
 String tenTaixe;
 double doanhThu;
 String noiDen;
 System.out.println("Doanh thu : "); doanh Thu - sc.nextDouble(); sc.nextLine(); ex = new ChuyenNoiThanh(naSo, tenTaixe, doanh Thu, soTuyen, SOKM),
 int soNgayDiDuoc;
 System.out.println("Nhap ma so: "); maso = sc.nextLine();
 System.out.println("Ho ten lai xe : "); tenTaixe = sc.nextLine();
 System.out.println("Noi den: "); noiDen sc.nextLine();
 System.out.println("So ngay di duoc : "); soNgayDiDuoc sc.nextInt(); sc.nextLine(); N System.out.println("Doanh thu : "); doanhThu = sc.nextDouble(); sc.nextLine(); cx = new ChuyenNgoaiThanh(maSo, tenTaiXe, doanhThu, noiDen, soNgayDiDuoc); listChuyenxe.add(cx);
 System.out.println("add thanh cong tuyen ngoai thanh");
 break;
 default:
 break;
}
}
}
public void xuat()
{
    for (Chuyente cx listChuyenxe)
    {
        System.out.println(cx.toString());
}
}
public void TongDoanhthu TungLoad()
double doanhThuNoiThanh = 0, doanhThuNgoaiThanh = 0;
for (Chuyenxe cx : listChuyenxe)
(
if(cx instanceof ChuyenNoiThanh)
doanhThuNoiThanh+=cx.getDoanhThu();
}
if(cx instanceof ChuyenNgoaiThanh)
doanh ThuNgoaiThanh+=cx.getDoanh Thu();
}
System.out.println("\n\nTong Doanh thu tuyen noi thanh : " + doanh ThuNoiThanh);
System,out.println("\nTong Doanh thu tuyến ngoại thành : " + doanh Thu Ngoai Thanh);
}
}