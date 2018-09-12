package com.study;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试接口
 *
 * @author orange
 */

// 底层用junit  SpringJUnit4ClassRunner
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

    @Test
    public void testOne() {
        System.out.println("test hello 1");
        TestCase.assertEquals(1, 1);
    }
}
