/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil.util;

import static com.fu.mathutil.util.MathUtil.getFactorial;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Thoai
 */
@RunWith(value = Parameterized.class)
public class DataDrivenWrongArgumentTest {

    @Parameterized.Parameter(value = 0)
    public int input; //ứng cột 0

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        getFactorial(input); //k thể assert, ta gọi hàm
                                    //mong ngoại lệ xuất hiện trong case
    }
    @Parameterized.Parameters
    public static Object[] initDataThrowsException() {
        //int a[] = {1,1,2,3,5,8,13,21}; //mảng 8 phần tử
        //8 biến int có sẵn value
        return new Integer[]{
            -1, -2, -3, -4, -5 //chuẩn bị bộ data trước data
        //sau đó đưa cho hàm getF(0)
        //                      assertEquals(1, ?);
        //data driven testing
        //"OOP object oriented"
        };
    }

}
