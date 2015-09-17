package levelp;

/**
 * Ошибка если стек пуст
 * Exception
 * RuntimeException
 * Throwable
 */
public class StackIsEmptyException extends RuntimeException {
    public StackIsEmptyException(String message) {
        super(message);
    }
}
