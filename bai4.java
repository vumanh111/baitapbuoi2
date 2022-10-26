
import java.util.Scanner;

/*
Bài 4: Nhập vào màn hình số n > 0 , nếu nhập vào n <= 0 thực hiện nhập đến 
khi n > 0 thì thôi .Kiểm tra các chữ số trong số này , in ra các chữ số là số chính phương , nếu trong số này không đựợc cấu tạo từ chữ số nào là số chính phương in ra màn hình “No”.

*/
public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
         n = scanner.nextInt();
        }
        while(n <=0);
        int b;
		float m,dem = 0;
		System.out.print("----------\n");
		while(n / 10 != 0 || n > 0) {
			b = n % 10;
			m = (float) Math.sqrt(b);
			if(m == (int)m) {
				System.out.print("các số chính phương là: " + b );
				dem++;
			}
			n = n / 10;
			
		}
		if(dem == 0)  System.out.print("No");
        
        
        
        
        
    }
    
    
}
