package functionalInterfaces2;

public interface Checker<T,R> {

    R execute(T [] arr);
}
