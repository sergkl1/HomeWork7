package task2;

/**
 * Created by sergey.kliepikov on 3/25/18.
 */
public class ComparablePair<T extends Comparable<? super T>> {

    private final T objectA;
    private final T objectB;


    public ComparablePair(T objectA, T objectB){
        this.objectA = objectA;
        this.objectB = objectB;

    }

    public T bigger(){
        T max = objectA;
        if (objectA.compareTo(objectB) > 0){
            max = objectA;
        } else{
            max = objectB;
        }

        return max;
    }

    public T smaller(){
        T min = objectA;
        if (objectA.compareTo(objectB) < 0){
            min = objectA;
        } else{
            min = objectB;
        }

        return min;
    }

}
