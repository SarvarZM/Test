package homeWork;

@FunctionalInterface
public interface AttributeFunction<T,R> {
    R execute (T str);
}
