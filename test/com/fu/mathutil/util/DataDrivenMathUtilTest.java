/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import static com.fu.mathutil.util.MathUtil.getFactorial;

/**
 *
 * @author Thoai
 */
//ta sẽ tách bộ dữ liệu test ra 1 chỗ riêng, sau đó chỉ việc nhồi
//nó vào trong các lời gọi hàm cần test
//ví dụ giống như tình huống bạn test màn hình login, chức năng login
//bạn cần chuẩn bị sẵn các cases
//cases thành công : user đúng, pass đúng, role tương ứng
//                      sv1        passsv1       sv
//                      sv2        passsv2       sv
//                      gv1        passgv1       gv
//                      ...
//DATA DRIVEN
//chuẩn bị bộ data - case
//feed/trích xuất/extract từng data đưa vào lời gọi hàm
//chạy hàm với từng case/data xem kết quả
@RunWith(value = Parameterized.class) //báo với thư viện JUnit rằng
//chuẩn bị chơi với trò tham số hóa
public class DataDrivenMathUtilTest {

    //có bộ data rồi, chỉ cho JUnit biết cách lấy từng data với ý nghĩa
    //gì, ví dụ mỗi dòng trong bộ data ứng 2 ý nghĩa
    // cột 0, là input cho hàm getF(input)
    //cột 1, là expected value, giá trị mà hàm getF(input) phải trả về
    //extract data sẽ thả vào biến, lát hồi biến đưa cho các hàm
    //quy ước là public, (non-static khác ở static ở chỗ là nó cần có không gian riếng)
    @Parameter(value = 0)
    public int input; //ứng cột 0
    @Parameter(value = 1)
    public long expected; //ứng cột 1

    @Test //tự loop qua các bộ data trong hàm init() ở dưới
    public void testFactorialGivenRightArgumentReturnsGoodResult() {
        assertEquals(expected, getFactorial(input));
    }
    
    //ta phải chuẩn bị bộ data: excel, txt CSV, table trong db
    //mảng 2 chiều//
    //cần có (đầu vào, đầu ra) nhiều cập như thế 
    //quy ước mảng 2 chiều này phải là static
    //Singleton - Design Patterns
    @Parameters
    public static Object[][] initData() {
        //int a[] = {1,1,2,3,5,8,13,21}; //mảng 8 phần tử
        //8 biến int có sẵn value
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {3, 6},
            {6, 720},
            {7, 5040} //chuẩn bị bộ data trước data
        //sau đó đưa cho hàm getF(0)
        //                      assertEquals(1, ?);
        //data driven testing
        //"OOP object oriented"
        };
    }

    

}

//
