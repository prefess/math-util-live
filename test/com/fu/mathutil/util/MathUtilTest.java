/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil.util;

import java.sql.SQLException;
import static org.junit.Assert.*;
import org.junit.Test;
import static com.fu.mathutil.util.MathUtil.getFactorial;
/**
 *
 * @author Thoai
 */
//chạy class này thì nhấn Shift-F6, vì F6 dành cho main()
public class MathUtilTest {

    @Test //biến hàm bất kỳ trong class này thành main()
    //có nhiều quy tắc đặc tên hàm dùng cho việc test
    //có nhiều quy tắc đặt tên hàm dùng cho việc test - naming convention
    public void testFactorialGivenRightArgumentReturnsGoodResult() {
        //expected vs. actual
        long expected = 120;
        long actual = getFactorial(5);

        assertEquals(expected, actual);

        assertEquals(5040, getFactorial(7));

        assertEquals(1, getFactorial(0));
    }

    //tình huống ngoại lệ thì sao. JUnit 4 thì ngoại lệ k phải là 1 value
    // để so sánh. Mà chỉ để bắt xem nó có xuất hiện hay ko?
    //có cách khác để "assert" đo lường
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        getFactorial(-5); //k thể assert, ta gọi hàm
                                    //mong ngoại lệ xuất hiện trong case
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
}
//xanh: khi tất cả các test case xanh - đúng thì bao hàm tất cả phải đúng
//đỏ: chỉ cần 1 case không ổn, expected khác actual, coi như đỏ cho all
//      chỉ 1 case/thằng k ỏn, sai, kết luận chung hàm không tốt

//JUnit lo cho mình đúng sai trên tổng thể, mắt chỉ nhìn kết luận cuối
//      thay vì sout() cách truyền thống, dùng mắt dối chiếu mọi cases
//XANH ĐỎ ĐI TIẾP CHO CI/CD/DEVOPS - CONTINUOUS INTEGRATION


//NÂNG CAO - DATA DRIVEN TESTING