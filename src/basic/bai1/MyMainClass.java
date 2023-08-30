package basic.bai1;
import java.util.Scanner;
public class MyMainClass extends CalculateUtils {
	
	public static void main(String[] args) {
		
		CalculateUtils cal = new CalculateUtils();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap so thu nhat X = ");
		double X = scanner.nextDouble();
		cal.x = X;

		System.out.print("Nhap so thu hai Y = ");
		double Y = scanner.nextDouble();
		cal.y = Y;
	    

		System.out.print("Nhap lenh ACTION: ");
		String ACTION  = scanner.next();
		
		if (ACTION.equals("CONG")) {
			double kq = cal.tinhCong();
			System.out.println(kq);	
		}
		else if (ACTION.equals("TRU")) {
			double kq = cal.tinhTru();
			System.out.println(kq);	
		}
		else if (ACTION.equals("CHIA")){
			double kq = cal.tinhChia();
			System.out.println(kq);	
		}
		else if (ACTION.equals("NHAN")){
			double kq = cal.tinhNhan();
			System.out.println(kq);	
		}
		else {
			System.out.println("Gia Tri Action Khong Hop Le");
		}		
	}

}
