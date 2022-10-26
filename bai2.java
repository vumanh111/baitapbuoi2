/*
Bài 2 :Nhập vào 4 nguyên a , b , c , d. In ra màn hình số lớn thứ hai trong 4 số trên. 
Nếu cả 4 số đều bằng nhau in ra màn hình “Không tồn tại số lớn thứ hai”.
*/
package baitapbuoi1;


import java.util.Scanner;


public class bai2 {

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int a[] = new int[4];
        for( int i =0; i< 4; i++){
            a[i] = scanner.nextInt();
        }
        
        for(int i = 0; i< 3; i++){
            for(int j = i+1; j< 4; j++){          
                if(a[i] < a[j]){
                    int tp= a[i];
                        a[i] = a[j];
                        a[j] = tp;
                }
            }   
        }
        
        System.out.println("----");
        for( int i = 1; i< 2; i++){
            
           System.out.println("" +a[i]);
       }
        
        
               
       
            
            
      
         
     
        
            
        
        
        
    }
}
