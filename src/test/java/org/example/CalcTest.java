package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
  Calc c = new Calc();

    @Test
    void testAddition() {
        assertEquals(4, c.add(2,2));
    }
    @Test
    public void testSubtraction() {
        Calc c = new Calc();
        // 故意写错！假设 subtract(4, 2) 应该等于 2，我们偏要说它等于 3，让测试失败
        assertEquals(2, c.subtract(4, 2));
    }
}
