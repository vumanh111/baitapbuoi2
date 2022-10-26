/*
Bài 3: Một bài toán khá quen thuộc 
	Trăm trâu , trăm cỏ , 
      Trâu lớn ăn năm , trâu nằm ăn ba ,
        Lụ khụ trâu già ,ba con 1 bó . 
     Hỏi có bao nhiêu con trâu đứng , trâu năm , trâu già? 

*/
package baitapbuoi1;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for(int i =1; i<=20; i++){
            for(int j =1; j< 33; j++){
                if(i*5 + j*3 +(100 - i -j)/3 ==100){
                    System.out.print("trau dung:" +i );
                    System.out.print(" trau nam:" +j);
                    System.out.print(" trau gia:" +(100- i -j));
                    System.out.println("\n");
                    
                }
                
            }
        }
    }
    
}
