package Lesson8;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyFirstTestTest {

    @Before
    public void setUp()  {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void test1() {
        assertEquals("1 should be equal 1","1","2");
    }
}