package lesson29.lambdaexpressions;

@FunctionalInterface
public interface Operation<T> {

    T operate(T value1, T value2);
}
