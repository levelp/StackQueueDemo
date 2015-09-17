import levelp.Stack;
import levelp.StackIsEmptyException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Тестирование стека
 */
public class StackTest extends Assert {

    /**
     * Стек с целыми числами, добавление и удаление
     */
    @Test
    public void testIntegersBase() {
        // TDD - Test Driven Development
        //  1. Пишем тест, описываем новые требования
        //   и провеяем что тест не проходит =>
        //   RED - красный
        //  2. Пишем код, так чтобы тест проходил
        //   GREEN - зелёный
        //  3. Рефакторинг (Refactoring)
        //   Улучшаем читаемость / понятность /
        //   гибкость кода не "ломая" тесты
        Stack<Integer> stack = new Stack<>();
        assertTrue(stack.isEmpty());
        stack.push(3);
        assertFalse(stack.isEmpty());
        assertEquals(3, stack.pop().intValue());
        assertTrue(stack.isEmpty());
    }

    /**
     * Тест на push / pop
     */
    @Test
    public void testIntegersPushPop() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop().intValue());
        assertEquals(2, stack.pop().intValue());
        assertEquals(1, stack.pop().intValue());
        assertTrue(stack.isEmpty());
    }

    /**
     * Попытка pop на пустом стеке
     */
    @Test
    public void testPopWithEmptyStack() {
        Stack stack = new Stack();
        try {
            stack.pop();
            fail("Должно быть исключение");
        } catch (StackIsEmptyException e) {
            assertEquals("Стек пуст", e.getMessage());
        }
    }

    @Test
    public void testStringsPushPop() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");
        stack.push("Test");
        assertEquals("Test", stack.pop());
        assertEquals("World", stack.pop());
        assertEquals("Hello", stack.pop());
        assertTrue(stack.isEmpty());
    }
}
