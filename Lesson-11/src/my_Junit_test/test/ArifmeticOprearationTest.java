package my_Junit_test.test;

import my_Junit_test.ArifmeticOprearation;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArifmeticOprearationTest{

    @Test
    void summ() {
        int a = 5;
        int b = 5;
        int my_result = 25;
        ArifmeticOprearation arifmeticOprearation = new ArifmeticOprearation();
        int real_result = arifmeticOprearation.summ(a, b);
        assertTrue(real_result==my_result);

    }
}