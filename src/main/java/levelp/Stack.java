package levelp;

/**
 * Стек
 */
public class Stack<T> {
    Element root = null;

    public boolean isEmpty() {
        return root == null;
    }

    /**
     * Добавить значение на вершину стека
     *
     * @param value значение
     */
    public void push(T value) {
        Element e = new Element();
        e.value = value;
        e.next = root;
        root = e;
    }

    /**
     * Получить значение с вершины стека и удалить его
     *
     * @return значение
     */
    public T pop() {
        if (root == null)
            throw new StackIsEmptyException("Стек пуст");
        T value = root.value;
        root = root.next;
        // Старый корень оставили сборщику мусора
        return value;
    }

    class Element {
        T value;
        Element next;
    }
}
