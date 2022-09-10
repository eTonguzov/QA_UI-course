package jUnit_examples.test;

import jUnit_examples.Finder;
import org.testng.annotations.Test;
import static org.junit.Assert.assertTrue;//библииотека junit. Класс Assert assertTrue()- это методы

//В любых тестах мы всегда сравниваем ожидаемый результат с фактическим

public class FinderTest {//принято назвать классы оригинальное название + Test

    @Test
    public void testFindMaximumElement1() {//то же самое test + метод
        int[] testInput = new int[] { 1, 2, 3, 4, 5 };//придумали массив
        int expectedResult = 5;//ожидаемый результат

        Finder myFinder = new Finder();//вызывем объект myFinder
        int actualResult = myFinder.findMaximumElement(testInput);//фактический результат = объект.метод объекта()

        assertTrue("Test input with ascending order", actualResult == expectedResult);
        /*Здесь ипользуем метод asserTrue() - возвращает True если выражение в нем True
        Cписок аннотаций для JUnit:
        @Test – определяет что метод method() является тестовым.
        @Before – указывает на то, что метод будет выполнятся перед каждым тестируемым методом @Test.
        @After – указывает на то что метод будет выполнятся после каждого тестируемого метода @Test
        @BeforeClass – указывает на то, что метод будет выполнятся в начале всех тестов,
        а точней в момент запуска тестов(перед всеми тестами @Test).
        @AfterClass – указывает на то, что метод будет выполнятся после всех тестов.
        @Ignore – говорит, что метод будет проигнорирован в момент проведения тестирования.
        (expected = Exception.class) – указывает на то, что в данном тестовом методе
        вы преднамеренно ожидаете Exception.
        (timeout = 100) – указывает, что тестируемый метод не должен занимать больше чем 100 миллисекунд.

        Основные методы класса Assert для проверки:

        fail(String) – указывает на то что бы тестовый метод завалился при этом выводя текстовое сообщение.
        assertTrue([message], boolean condition) – проверяет, что логическое условие истинно.
        assertsEquals([String message], expected, actual) – проверяет, что два значения совпадают.
        Примечание: для массивов проверяются ссылки, а не содержание массивов.
        assertNull([message], object) – проверяет, что объект является пустым null.
        assertNotNull([message], object) – проверяет, что объект не является пустым null.
        assertSame([String], expected, actual) – проверяет, что обе переменные относятся к одному объекту.
        assertNotSame([String], expected, actual) – проверяет, что обе переменные относятся к разным объектам.

         */
    }

    @Test
    public final void testFindMaximumElement2() {

        int[] testInput = new int[] { 117, 56, 38, 11, 0 };
        int expectedResult = 117;

        Finder myFinder = new Finder();
        int actualResult = myFinder.findMaximumElement(testInput);

        assertTrue("Test input with descending order",
                actualResult == expectedResult);
    }

    @Test
    public final void testFindMaximumElement3() {

        int[] testInput = new int[] { 42, 11, 38, 75, 14 };
        int expectedResult = 75;

        Finder myFinder = new Finder();
        int actualResult = myFinder.findMaximumElement(testInput);

        assertTrue("Test input with random order",
                actualResult == expectedResult);
    }

    @Test
    public final void testFindMaximumElement4() {
        int[] testInput = new int[] { 3, 3, 3, 3, 3 };
        int expectedResult = 3;

        Finder myFinder = new Finder();
        int actualResult = myFinder.findMaximumElement(testInput);

        assertTrue("Test input with ascending order",
                actualResult == expectedResult);
    }

    @Test
    public final void testFindMaximumElement5() {
        int[] testInput = new int[] { -1, 2, -3, 4, -5 };
        int expectedResult = 4;

        Finder myFinder = new Finder();
        int actualResult = myFinder.findMaximumElement(testInput);

        assertTrue("Test input with ascending order",
                actualResult == expectedResult);
    }

    @Test
    public final void testFindMaximumElement6() {
        int[] testInput = new int[] { 0, 0, 0, 0, 0 };
        int expectedResult = 0;

        Finder myFinder = new Finder();
        int actualResult = myFinder.findMaximumElement(testInput);

        assertTrue("Test input with ascending order",
                actualResult == expectedResult);
    }

    @Test
    public final void testFindMaximumElement7() {
        int[] testInput = new int[] { -1, -2, -3, -4, -5 };
        int expectedResult = -1;

        Finder myFinder = new Finder();
        int actualResult = myFinder.findMaximumElement(testInput);

        assertTrue("Test input with ascending order",
                actualResult == expectedResult);
    }

}

