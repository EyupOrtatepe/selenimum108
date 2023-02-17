package day04_JUnitFramework;

import org.junit.*;

public class C05_BirlikteKullanim {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before class calisti \n=========");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After class calisti \n=========");
    }
    @Before
    public void before(){
        System.out.println("Before calisti");
    }
    @After
    public void after(){
        System.out.println("After calisti");
    }
    @Test
    public void test01(){
        System.out.println("Test1 calisti");
    }
    @Test
    public void test02(){
        System.out.println("Test2 calisti");
    }
    @Test
    public void test03(){
        System.out.println("Test2 calisti");
    }
}
