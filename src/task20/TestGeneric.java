package task20;

//https://www.digitalocean.com/community/tutorials/java-generics-example-method-class-interface

import java.io.Serializable;
import java.util.Arrays;

class Animal{
    public Animal() {
    }
}
class TGeneric<T extends Comparable<T>, V extends Serializable, K extends Animal>{
    T varT;
    V varV;
    K varK;

    public  TGeneric(T valT, V valV, K valK)
    {
        varT = valT;
        varV = valV;
        varK = valK;
    }

    T getT() {
        return varT;
    }

    V getV() {
        return varV;
    }

    K getK() {
        return varK;
    }

    void printVarTypes()
    {
        System.out.println("T type: " + varT.getClass());
        System.out.println("V type: " + varV.getClass());
        System.out.println("K type: " + varK.getClass());
    }
}

class Calc{
    public static <S extends Number, U extends Number> double add (S one, U two) {
        return one.doubleValue() + two.doubleValue();
    }

    public static <S extends Number, U extends Number> double multiply (S one, U two) {
        return one.doubleValue() * two.doubleValue();
    }

    public static <S extends Number, U extends Number> double divide (S one, U two) {
        return one.doubleValue() / two.doubleValue();
    }

    public static <S extends Number, U extends Number> double subtraction (S one, U two) {
        return one.doubleValue() - two.doubleValue();
    }
}

class MinMax<E>{
    private final E[] arr;
    public MinMax(E[] arr) {
        this.arr = arr;
        Arrays.sort(this.arr);
    }

    public E getMinElement() {
        return arr[0];
    }

    public E getMaxElement() {
        return arr[arr.length - 1];
    }
}

public class TestGeneric {

    public static void main(String[] args) {
        TGeneric<Integer, String, Animal> tg = new TGeneric<>(10, "String", new Animal());
        tg.printVarTypes();

        Integer[] arr = {5, 12, 8, 4, 3, 7};
        MinMax<Integer> mm = new MinMax<>(arr);
        System.out.println("Minimum element: " + mm.getMinElement());
        System.out.println("Maximum element: " + mm.getMaxElement());

        int val1 = 15;
        double val2 = 34.3;
        System.out.println("Sum result: " + Calc.add(val1, val2));
        System.out.println("Multiply result: " + Calc.multiply(val1, val2));
        System.out.println("Subtraction result: " + Calc.subtraction(val1, val2));
        System.out.println("Divide result: " + Calc.divide(val1, val2));
    }
}

