/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.huyle.mathutil.test.core;

import com.huyle.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Admin
 */

//cau lenh nay cua JUnit bao hieu rang se can loop qua tap data 
//de lay cap data input/expected nhoi vao ham test
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    //ta se tra ve mang 2 chieu gom nhieu cap Expected|Input
    @Parameterized.Parameters       //JUnit se ngam chay loop qua tung dong
                                    //cua mang de lay ra dc cap data input/ex[ected
    //ten ham khong quan trong, quan trong la @
    public static Object[][] initData() {
        return new Integer[][] {
                                    {0, 1},
                                    {1, 1},
                                    {2, 2},
                                    {3, 6},
                                    {4, 24},
                                    {6, 120},
                                    
        };
    }
    //gia su loop qua tung odng cua mang, ta van can gan tung value cua cot
    //vao bien tuong ung input, expected de lat hoi feed cho ham
    
    @Parameterized.Parameter(value = 0) //value = 0 la map voi mang data
    public int n; //bien map voi value cua cot 0 cua mang
    
    @Parameterized.Parameter(value = 1)
    public long expected; //kieu long vi gia tri tra ve cua ham getF() la long
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
}
