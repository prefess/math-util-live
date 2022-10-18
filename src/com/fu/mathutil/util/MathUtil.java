/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil.util;

/**
 *
 * @author Thoai
 */
//ta viết class để cung cấp tiện ích cho nơi khác xài
//khi ta cung cấp tiện ích cho nơi khác xài , đó là lúc ta không cần nhớ gì 
//cho riêng ta, hàm static sẽ làm điều này
public class MathUtil {

    //n! = 1.2.3.4.5.6...n
    // quy ước: 0! = 1! = 1
    // ko tính giai thừa cho số âm
    //20! là vừa khớp kiểu long, kiểu long tối đa là 18 con số 0
    //21! là lố kiểu long 
    //nếu đưa vào âm, 21 giai thừa ta éo tính, ta đập vào mặt ai xài hàm
    //một cái ngoại lệ, chửi éo tính được
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be between 0..20");
        }
        //hàm dừng liền éo cần return

        //xuống đây là n = 0..20 ồi
        if (n == 0 || n == 1) {
            return 1; // dừng ngay khi n đặc biệt
        }
        //xuống đến đây n=2..20 ồi
        //chơi for hoặc đệ quy - recursion
        //kỹ thuật nhồi con heo đất, ốc bu nhồi thịt
        long product = 1; //tích khởi đầu = 1, nhồi 2 3 4 5 6 7 8 .. n 
        for (int i = 2; i <= n; i++) {
            //product = product*i;
            product *= i;
        }
        return product;
    }
}
